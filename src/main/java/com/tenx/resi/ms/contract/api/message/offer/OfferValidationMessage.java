/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.tenx.resi.ms.contract.api.message.offer;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OfferValidationMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 968931530888607303L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OfferValidationMessage\",\"namespace\":\"com.tenx.resi.ms.contract.api.message.offer\",\"fields\":[{\"name\":\"offerValidationStatus\",\"type\":[\"null\",{\"type\":\"string\",\"java-class\":\"com.tenx.resi.ms.contract.api.dto.OfferValidationStatus\",\"logicalType\":\"OfferValidationStatus\"}],\"default\":null},{\"name\":\"offerValidationChecklist\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"OfferValidationChecklistMessage\",\"fields\":[{\"name\":\"missingDocuments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\",\"java-class\":\"java.util.List\"}],\"default\":null},{\"name\":\"listingAgentInfoMissing\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"freddieMacValidationsFailing\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"fannieMaeValidationsFailing\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isMoreBuyerInvolved\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isMoreEntityInvolved\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isMoreSignerInvolved\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isInternationalBuyerInvolved\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"agentLicenseFollowup\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"legalDescriptionMissing\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isLegacyIntegration\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"addendumFileSizeLimitExceeded\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"missingClosingCompanyFields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\",\"java-class\":\"java.util.List\"}],\"default\":null},{\"name\":\"mlhSyncError\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"contractGenerationError\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OfferValidationMessage> ENCODER =
      new BinaryMessageEncoder<OfferValidationMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OfferValidationMessage> DECODER =
      new BinaryMessageDecoder<OfferValidationMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OfferValidationMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OfferValidationMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OfferValidationMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OfferValidationMessage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OfferValidationMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OfferValidationMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OfferValidationMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OfferValidationMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private com.tenx.resi.ms.contract.api.dto.OfferValidationStatus offerValidationStatus;
   private com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage offerValidationChecklist;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OfferValidationMessage() {}

  /**
   * All-args constructor.
   * @param offerValidationStatus The new value for offerValidationStatus
   * @param offerValidationChecklist The new value for offerValidationChecklist
   */
  public OfferValidationMessage(com.tenx.resi.ms.contract.api.dto.OfferValidationStatus offerValidationStatus, com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage offerValidationChecklist) {
    this.offerValidationStatus = offerValidationStatus;
    this.offerValidationChecklist = offerValidationChecklist;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return offerValidationStatus;
    case 1: return offerValidationChecklist;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: offerValidationStatus = (com.tenx.resi.ms.contract.api.dto.OfferValidationStatus)value$; break;
    case 1: offerValidationChecklist = (com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'offerValidationStatus' field.
   * @return The value of the 'offerValidationStatus' field.
   */
  public com.tenx.resi.ms.contract.api.dto.OfferValidationStatus getOfferValidationStatus() {
    return offerValidationStatus;
  }


  /**
   * Sets the value of the 'offerValidationStatus' field.
   * @param value the value to set.
   */
  public void setOfferValidationStatus(com.tenx.resi.ms.contract.api.dto.OfferValidationStatus value) {
    this.offerValidationStatus = value;
  }

  /**
   * Gets the value of the 'offerValidationChecklist' field.
   * @return The value of the 'offerValidationChecklist' field.
   */
  public com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage getOfferValidationChecklist() {
    return offerValidationChecklist;
  }


  /**
   * Sets the value of the 'offerValidationChecklist' field.
   * @param value the value to set.
   */
  public void setOfferValidationChecklist(com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage value) {
    this.offerValidationChecklist = value;
  }

  /**
   * Creates a new OfferValidationMessage RecordBuilder.
   * @return A new OfferValidationMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder newBuilder() {
    return new com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder();
  }

  /**
   * Creates a new OfferValidationMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OfferValidationMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder newBuilder(com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder other) {
    if (other == null) {
      return new com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder();
    } else {
      return new com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder(other);
    }
  }

  /**
   * Creates a new OfferValidationMessage RecordBuilder by copying an existing OfferValidationMessage instance.
   * @param other The existing instance to copy.
   * @return A new OfferValidationMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder newBuilder(com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage other) {
    if (other == null) {
      return new com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder();
    } else {
      return new com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for OfferValidationMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OfferValidationMessage>
    implements org.apache.avro.data.RecordBuilder<OfferValidationMessage> {

    private com.tenx.resi.ms.contract.api.dto.OfferValidationStatus offerValidationStatus;
    private com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage offerValidationChecklist;
    private com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage.Builder offerValidationChecklistBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.offerValidationStatus)) {
        this.offerValidationStatus = data().deepCopy(fields()[0].schema(), other.offerValidationStatus);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.offerValidationChecklist)) {
        this.offerValidationChecklist = data().deepCopy(fields()[1].schema(), other.offerValidationChecklist);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasOfferValidationChecklistBuilder()) {
        this.offerValidationChecklistBuilder = com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage.newBuilder(other.getOfferValidationChecklistBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing OfferValidationMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.offerValidationStatus)) {
        this.offerValidationStatus = data().deepCopy(fields()[0].schema(), other.offerValidationStatus);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.offerValidationChecklist)) {
        this.offerValidationChecklist = data().deepCopy(fields()[1].schema(), other.offerValidationChecklist);
        fieldSetFlags()[1] = true;
      }
      this.offerValidationChecklistBuilder = null;
    }

    /**
      * Gets the value of the 'offerValidationStatus' field.
      * @return The value.
      */
    public com.tenx.resi.ms.contract.api.dto.OfferValidationStatus getOfferValidationStatus() {
      return offerValidationStatus;
    }


    /**
      * Sets the value of the 'offerValidationStatus' field.
      * @param value The value of 'offerValidationStatus'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder setOfferValidationStatus(com.tenx.resi.ms.contract.api.dto.OfferValidationStatus value) {
      validate(fields()[0], value);
      this.offerValidationStatus = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'offerValidationStatus' field has been set.
      * @return True if the 'offerValidationStatus' field has been set, false otherwise.
      */
    public boolean hasOfferValidationStatus() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'offerValidationStatus' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder clearOfferValidationStatus() {
      offerValidationStatus = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'offerValidationChecklist' field.
      * @return The value.
      */
    public com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage getOfferValidationChecklist() {
      return offerValidationChecklist;
    }


    /**
      * Sets the value of the 'offerValidationChecklist' field.
      * @param value The value of 'offerValidationChecklist'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder setOfferValidationChecklist(com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage value) {
      validate(fields()[1], value);
      this.offerValidationChecklistBuilder = null;
      this.offerValidationChecklist = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'offerValidationChecklist' field has been set.
      * @return True if the 'offerValidationChecklist' field has been set, false otherwise.
      */
    public boolean hasOfferValidationChecklist() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'offerValidationChecklist' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage.Builder getOfferValidationChecklistBuilder() {
      if (offerValidationChecklistBuilder == null) {
        if (hasOfferValidationChecklist()) {
          setOfferValidationChecklistBuilder(com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage.newBuilder(offerValidationChecklist));
        } else {
          setOfferValidationChecklistBuilder(com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage.newBuilder());
        }
      }
      return offerValidationChecklistBuilder;
    }

    /**
     * Sets the Builder instance for the 'offerValidationChecklist' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder setOfferValidationChecklistBuilder(com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage.Builder value) {
      clearOfferValidationChecklist();
      offerValidationChecklistBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'offerValidationChecklist' field has an active Builder instance
     * @return True if the 'offerValidationChecklist' field has an active Builder instance
     */
    public boolean hasOfferValidationChecklistBuilder() {
      return offerValidationChecklistBuilder != null;
    }

    /**
      * Clears the value of the 'offerValidationChecklist' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.OfferValidationMessage.Builder clearOfferValidationChecklist() {
      offerValidationChecklist = null;
      offerValidationChecklistBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OfferValidationMessage build() {
      try {
        OfferValidationMessage record = new OfferValidationMessage();
        record.offerValidationStatus = fieldSetFlags()[0] ? this.offerValidationStatus : (com.tenx.resi.ms.contract.api.dto.OfferValidationStatus) defaultValue(fields()[0]);
        if (offerValidationChecklistBuilder != null) {
          try {
            record.offerValidationChecklist = this.offerValidationChecklistBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("offerValidationChecklist"));
            throw e;
          }
        } else {
          record.offerValidationChecklist = fieldSetFlags()[1] ? this.offerValidationChecklist : (com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OfferValidationMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<OfferValidationMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OfferValidationMessage>
    READER$ = (org.apache.avro.io.DatumReader<OfferValidationMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.offerValidationStatus == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.offerValidationStatus.toString());
    }

    if (this.offerValidationChecklist == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.offerValidationChecklist.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.offerValidationStatus = null;
      } else {
        this.offerValidationStatus = new com.tenx.resi.ms.contract.api.dto.OfferValidationStatus(in.readString());
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.offerValidationChecklist = null;
      } else {
        if (this.offerValidationChecklist == null) {
          this.offerValidationChecklist = new com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage();
        }
        this.offerValidationChecklist.customDecode(in);
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.offerValidationStatus = null;
          } else {
            this.offerValidationStatus = new com.tenx.resi.ms.contract.api.dto.OfferValidationStatus(in.readString());
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.offerValidationChecklist = null;
          } else {
            if (this.offerValidationChecklist == null) {
              this.offerValidationChecklist = new com.tenx.resi.ms.contract.api.message.offer.OfferValidationChecklistMessage();
            }
            this.offerValidationChecklist.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









