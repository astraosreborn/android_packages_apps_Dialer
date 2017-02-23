/*
 * Copyright (C) 2016 The Android Open Source Project
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
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.android.dialer.callcomposer.nano;

/** This file is autogenerated, but javadoc required. */
@SuppressWarnings("hiding")
public final class CallComposerContact
    extends com.google.protobuf.nano.ExtendableMessageNano<CallComposerContact> {

  private static volatile CallComposerContact[] _emptyArray;
  public static CallComposerContact[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new CallComposerContact[0];
        }
      }
    }
    return _emptyArray;
  }

  // optional fixed64 photo_id = 1;
  public long photoId;

  // optional string photo_uri = 2;
  public java.lang.String photoUri;

  // optional string contact_uri = 3;
  public java.lang.String contactUri;

  // optional string name_or_number = 4;
  public java.lang.String nameOrNumber;

  // optional bool is_business = 5;
  public boolean isBusiness;

  // optional string number = 6;
  public java.lang.String number;

  // optional string display_number = 7;
  public java.lang.String displayNumber;

  // optional string number_label = 8;
  public java.lang.String numberLabel;

  // @@protoc_insertion_point(class_scope:com.android.dialer.callcomposer.CallComposerContact)

  public CallComposerContact() {
    clear();
  }

  public CallComposerContact clear() {
    photoId = 0L;
    photoUri = "";
    contactUri = "";
    nameOrNumber = "";
    isBusiness = false;
    number = "";
    displayNumber = "";
    numberLabel = "";
    unknownFieldData = null;
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    if (this.photoId != 0L) {
      output.writeFixed64(1, this.photoId);
    }
    if (this.photoUri != null && !this.photoUri.equals("")) {
      output.writeString(2, this.photoUri);
    }
    if (this.contactUri != null && !this.contactUri.equals("")) {
      output.writeString(3, this.contactUri);
    }
    if (this.nameOrNumber != null && !this.nameOrNumber.equals("")) {
      output.writeString(4, this.nameOrNumber);
    }
    if (this.isBusiness != false) {
      output.writeBool(5, this.isBusiness);
    }
    if (this.number != null && !this.number.equals("")) {
      output.writeString(6, this.number);
    }
    if (this.displayNumber != null && !this.displayNumber.equals("")) {
      output.writeString(7, this.displayNumber);
    }
    if (this.numberLabel != null && !this.numberLabel.equals("")) {
      output.writeString(8, this.numberLabel);
    }
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    if (this.photoId != 0L) {
      size +=
          com.google.protobuf.nano.CodedOutputByteBufferNano.computeFixed64Size(1, this.photoId);
    }
    if (this.photoUri != null && !this.photoUri.equals("")) {
      size +=
          com.google.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.photoUri);
    }
    if (this.contactUri != null && !this.contactUri.equals("")) {
      size +=
          com.google.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(3, this.contactUri);
    }
    if (this.nameOrNumber != null && !this.nameOrNumber.equals("")) {
      size +=
          com.google.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(
              4, this.nameOrNumber);
    }
    if (this.isBusiness != false) {
      size +=
          com.google.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(5, this.isBusiness);
    }
    if (this.number != null && !this.number.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(6, this.number);
    }
    if (this.displayNumber != null && !this.displayNumber.equals("")) {
      size +=
          com.google.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(
              7, this.displayNumber);
    }
    if (this.numberLabel != null && !this.numberLabel.equals("")) {
      size +=
          com.google.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(8, this.numberLabel);
    }
    return size;
  }

  @Override
  public CallComposerContact mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    while (true) {
      int tag = input.readTag();
      switch (tag) {
        case 0:
          return this;
        default:
          {
            if (!super.storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
        case 9:
          {
            this.photoId = input.readFixed64();
            break;
          }
        case 18:
          {
            this.photoUri = input.readString();
            break;
          }
        case 26:
          {
            this.contactUri = input.readString();
            break;
          }
        case 34:
          {
            this.nameOrNumber = input.readString();
            break;
          }
        case 40:
          {
            this.isBusiness = input.readBool();
            break;
          }
        case 50:
          {
            this.number = input.readString();
            break;
          }
        case 58:
          {
            this.displayNumber = input.readString();
            break;
          }
        case 66:
          {
            this.numberLabel = input.readString();
            break;
          }
      }
    }
  }

  public static CallComposerContact parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new CallComposerContact(), data);
  }

  public static CallComposerContact parseFrom(
      com.google.protobuf.nano.CodedInputByteBufferNano input) throws java.io.IOException {
    return new CallComposerContact().mergeFrom(input);
  }
}
