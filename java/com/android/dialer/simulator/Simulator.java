/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.android.dialer.simulator;

import android.content.Context;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.view.ActionProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/** Used to add menu items to the Dialer menu to test the app using simulated calls and data. */
public interface Simulator {
  boolean shouldShow();

  ActionProvider getActionProvider(Context context);

  /** Information about a connection event. */
  public static class Event {
    /** The type of connection event. */
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({
      NONE,
      ANSWER,
      REJECT,
      HOLD,
      UNHOLD,
      DISCONNECT,
      STATE_CHANGE,
      DTMF,
      SESSION_MODIFY_REQUEST,
    })
    public @interface Type {}

    public static final int NONE = -1;
    public static final int ANSWER = 1;
    public static final int REJECT = 2;
    public static final int HOLD = 3;
    public static final int UNHOLD = 4;
    public static final int DISCONNECT = 5;
    public static final int STATE_CHANGE = 6;
    public static final int DTMF = 7;
    public static final int SESSION_MODIFY_REQUEST = 8;

    @Type public final int type;
    /** Holds event specific information. For example, for DTMF this could be the keycode. */
    @Nullable public final String data1;
    /**
     * Holds event specific information. For example, for STATE_CHANGE this could be the new state.
     */
    @Nullable public final String data2;

    public Event(@Type int type) {
      this(type, null, null);
    }

    public Event(@Type int type, String data1, String data2) {
      this.type = type;
      this.data1 = data1;
      this.data2 = data2;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) {
        return true;
      }
      if (!(other instanceof Event)) {
        return false;
      }
      Event event = (Event) other;
      return type == event.type
          && Objects.equals(data1, event.data1)
          && Objects.equals(data2, event.data2);
    }

    @Override
    public int hashCode() {
      return Objects.hash(Integer.valueOf(type), data1, data2);
    }
  }
}