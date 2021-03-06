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
public class EscrowCompanyMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2605098412273976722L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EscrowCompanyMessage\",\"namespace\":\"com.tenx.resi.ms.contract.api.message.offer\",\"fields\":[{\"name\":\"escrowCompanyId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"escrowCompanyParty\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"PartyMessage\",\"fields\":[{\"name\":\"partyId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"partyType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"participantType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"firstName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"lastName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"middleName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"noMiddleName\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"dob\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"companyName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"addressType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"streetNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"streetName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"streetUnit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"city\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"postalCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"emailAddress\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"phoneType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"phoneNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"licenseNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"licenseState\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"licenseType\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"escrowCompanyContact\",\"type\":[\"null\",\"PartyMessage\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EscrowCompanyMessage> ENCODER =
      new BinaryMessageEncoder<EscrowCompanyMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EscrowCompanyMessage> DECODER =
      new BinaryMessageDecoder<EscrowCompanyMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EscrowCompanyMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EscrowCompanyMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EscrowCompanyMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EscrowCompanyMessage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EscrowCompanyMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EscrowCompanyMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EscrowCompanyMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EscrowCompanyMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Long escrowCompanyId;
   private com.tenx.resi.ms.contract.api.message.offer.PartyMessage escrowCompanyParty;
   private com.tenx.resi.ms.contract.api.message.offer.PartyMessage escrowCompanyContact;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EscrowCompanyMessage() {}

  /**
   * All-args constructor.
   * @param escrowCompanyId The new value for escrowCompanyId
   * @param escrowCompanyParty The new value for escrowCompanyParty
   * @param escrowCompanyContact The new value for escrowCompanyContact
   */
  public EscrowCompanyMessage(java.lang.Long escrowCompanyId, com.tenx.resi.ms.contract.api.message.offer.PartyMessage escrowCompanyParty, com.tenx.resi.ms.contract.api.message.offer.PartyMessage escrowCompanyContact) {
    this.escrowCompanyId = escrowCompanyId;
    this.escrowCompanyParty = escrowCompanyParty;
    this.escrowCompanyContact = escrowCompanyContact;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return escrowCompanyId;
    case 1: return escrowCompanyParty;
    case 2: return escrowCompanyContact;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: escrowCompanyId = (java.lang.Long)value$; break;
    case 1: escrowCompanyParty = (com.tenx.resi.ms.contract.api.message.offer.PartyMessage)value$; break;
    case 2: escrowCompanyContact = (com.tenx.resi.ms.contract.api.message.offer.PartyMessage)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'escrowCompanyId' field.
   * @return The value of the 'escrowCompanyId' field.
   */
  public java.lang.Long getEscrowCompanyId() {
    return escrowCompanyId;
  }


  /**
   * Sets the value of the 'escrowCompanyId' field.
   * @param value the value to set.
   */
  public void setEscrowCompanyId(java.lang.Long value) {
    this.escrowCompanyId = value;
  }

  /**
   * Gets the value of the 'escrowCompanyParty' field.
   * @return The value of the 'escrowCompanyParty' field.
   */
  public com.tenx.resi.ms.contract.api.message.offer.PartyMessage getEscrowCompanyParty() {
    return escrowCompanyParty;
  }


  /**
   * Sets the value of the 'escrowCompanyParty' field.
   * @param value the value to set.
   */
  public void setEscrowCompanyParty(com.tenx.resi.ms.contract.api.message.offer.PartyMessage value) {
    this.escrowCompanyParty = value;
  }

  /**
   * Gets the value of the 'escrowCompanyContact' field.
   * @return The value of the 'escrowCompanyContact' field.
   */
  public com.tenx.resi.ms.contract.api.message.offer.PartyMessage getEscrowCompanyContact() {
    return escrowCompanyContact;
  }


  /**
   * Sets the value of the 'escrowCompanyContact' field.
   * @param value the value to set.
   */
  public void setEscrowCompanyContact(com.tenx.resi.ms.contract.api.message.offer.PartyMessage value) {
    this.escrowCompanyContact = value;
  }

  /**
   * Creates a new EscrowCompanyMessage RecordBuilder.
   * @return A new EscrowCompanyMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder newBuilder() {
    return new com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder();
  }

  /**
   * Creates a new EscrowCompanyMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EscrowCompanyMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder newBuilder(com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder other) {
    if (other == null) {
      return new com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder();
    } else {
      return new com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder(other);
    }
  }

  /**
   * Creates a new EscrowCompanyMessage RecordBuilder by copying an existing EscrowCompanyMessage instance.
   * @param other The existing instance to copy.
   * @return A new EscrowCompanyMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder newBuilder(com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage other) {
    if (other == null) {
      return new com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder();
    } else {
      return new com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for EscrowCompanyMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EscrowCompanyMessage>
    implements org.apache.avro.data.RecordBuilder<EscrowCompanyMessage> {

    private java.lang.Long escrowCompanyId;
    private com.tenx.resi.ms.contract.api.message.offer.PartyMessage escrowCompanyParty;
    private com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder escrowCompanyPartyBuilder;
    private com.tenx.resi.ms.contract.api.message.offer.PartyMessage escrowCompanyContact;
    private com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder escrowCompanyContactBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.escrowCompanyId)) {
        this.escrowCompanyId = data().deepCopy(fields()[0].schema(), other.escrowCompanyId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.escrowCompanyParty)) {
        this.escrowCompanyParty = data().deepCopy(fields()[1].schema(), other.escrowCompanyParty);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasEscrowCompanyPartyBuilder()) {
        this.escrowCompanyPartyBuilder = com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder(other.getEscrowCompanyPartyBuilder());
      }
      if (isValidValue(fields()[2], other.escrowCompanyContact)) {
        this.escrowCompanyContact = data().deepCopy(fields()[2].schema(), other.escrowCompanyContact);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasEscrowCompanyContactBuilder()) {
        this.escrowCompanyContactBuilder = com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder(other.getEscrowCompanyContactBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing EscrowCompanyMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.escrowCompanyId)) {
        this.escrowCompanyId = data().deepCopy(fields()[0].schema(), other.escrowCompanyId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.escrowCompanyParty)) {
        this.escrowCompanyParty = data().deepCopy(fields()[1].schema(), other.escrowCompanyParty);
        fieldSetFlags()[1] = true;
      }
      this.escrowCompanyPartyBuilder = null;
      if (isValidValue(fields()[2], other.escrowCompanyContact)) {
        this.escrowCompanyContact = data().deepCopy(fields()[2].schema(), other.escrowCompanyContact);
        fieldSetFlags()[2] = true;
      }
      this.escrowCompanyContactBuilder = null;
    }

    /**
      * Gets the value of the 'escrowCompanyId' field.
      * @return The value.
      */
    public java.lang.Long getEscrowCompanyId() {
      return escrowCompanyId;
    }


    /**
      * Sets the value of the 'escrowCompanyId' field.
      * @param value The value of 'escrowCompanyId'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder setEscrowCompanyId(java.lang.Long value) {
      validate(fields()[0], value);
      this.escrowCompanyId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'escrowCompanyId' field has been set.
      * @return True if the 'escrowCompanyId' field has been set, false otherwise.
      */
    public boolean hasEscrowCompanyId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'escrowCompanyId' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder clearEscrowCompanyId() {
      escrowCompanyId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'escrowCompanyParty' field.
      * @return The value.
      */
    public com.tenx.resi.ms.contract.api.message.offer.PartyMessage getEscrowCompanyParty() {
      return escrowCompanyParty;
    }


    /**
      * Sets the value of the 'escrowCompanyParty' field.
      * @param value The value of 'escrowCompanyParty'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder setEscrowCompanyParty(com.tenx.resi.ms.contract.api.message.offer.PartyMessage value) {
      validate(fields()[1], value);
      this.escrowCompanyPartyBuilder = null;
      this.escrowCompanyParty = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'escrowCompanyParty' field has been set.
      * @return True if the 'escrowCompanyParty' field has been set, false otherwise.
      */
    public boolean hasEscrowCompanyParty() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'escrowCompanyParty' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder getEscrowCompanyPartyBuilder() {
      if (escrowCompanyPartyBuilder == null) {
        if (hasEscrowCompanyParty()) {
          setEscrowCompanyPartyBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder(escrowCompanyParty));
        } else {
          setEscrowCompanyPartyBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder());
        }
      }
      return escrowCompanyPartyBuilder;
    }

    /**
     * Sets the Builder instance for the 'escrowCompanyParty' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder setEscrowCompanyPartyBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder value) {
      clearEscrowCompanyParty();
      escrowCompanyPartyBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'escrowCompanyParty' field has an active Builder instance
     * @return True if the 'escrowCompanyParty' field has an active Builder instance
     */
    public boolean hasEscrowCompanyPartyBuilder() {
      return escrowCompanyPartyBuilder != null;
    }

    /**
      * Clears the value of the 'escrowCompanyParty' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder clearEscrowCompanyParty() {
      escrowCompanyParty = null;
      escrowCompanyPartyBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'escrowCompanyContact' field.
      * @return The value.
      */
    public com.tenx.resi.ms.contract.api.message.offer.PartyMessage getEscrowCompanyContact() {
      return escrowCompanyContact;
    }


    /**
      * Sets the value of the 'escrowCompanyContact' field.
      * @param value The value of 'escrowCompanyContact'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder setEscrowCompanyContact(com.tenx.resi.ms.contract.api.message.offer.PartyMessage value) {
      validate(fields()[2], value);
      this.escrowCompanyContactBuilder = null;
      this.escrowCompanyContact = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'escrowCompanyContact' field has been set.
      * @return True if the 'escrowCompanyContact' field has been set, false otherwise.
      */
    public boolean hasEscrowCompanyContact() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'escrowCompanyContact' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder getEscrowCompanyContactBuilder() {
      if (escrowCompanyContactBuilder == null) {
        if (hasEscrowCompanyContact()) {
          setEscrowCompanyContactBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder(escrowCompanyContact));
        } else {
          setEscrowCompanyContactBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder());
        }
      }
      return escrowCompanyContactBuilder;
    }

    /**
     * Sets the Builder instance for the 'escrowCompanyContact' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder setEscrowCompanyContactBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder value) {
      clearEscrowCompanyContact();
      escrowCompanyContactBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'escrowCompanyContact' field has an active Builder instance
     * @return True if the 'escrowCompanyContact' field has an active Builder instance
     */
    public boolean hasEscrowCompanyContactBuilder() {
      return escrowCompanyContactBuilder != null;
    }

    /**
      * Clears the value of the 'escrowCompanyContact' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.EscrowCompanyMessage.Builder clearEscrowCompanyContact() {
      escrowCompanyContact = null;
      escrowCompanyContactBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EscrowCompanyMessage build() {
      try {
        EscrowCompanyMessage record = new EscrowCompanyMessage();
        record.escrowCompanyId = fieldSetFlags()[0] ? this.escrowCompanyId : (java.lang.Long) defaultValue(fields()[0]);
        if (escrowCompanyPartyBuilder != null) {
          try {
            record.escrowCompanyParty = this.escrowCompanyPartyBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("escrowCompanyParty"));
            throw e;
          }
        } else {
          record.escrowCompanyParty = fieldSetFlags()[1] ? this.escrowCompanyParty : (com.tenx.resi.ms.contract.api.message.offer.PartyMessage) defaultValue(fields()[1]);
        }
        if (escrowCompanyContactBuilder != null) {
          try {
            record.escrowCompanyContact = this.escrowCompanyContactBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("escrowCompanyContact"));
            throw e;
          }
        } else {
          record.escrowCompanyContact = fieldSetFlags()[2] ? this.escrowCompanyContact : (com.tenx.resi.ms.contract.api.message.offer.PartyMessage) defaultValue(fields()[2]);
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
  private static final org.apache.avro.io.DatumWriter<EscrowCompanyMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<EscrowCompanyMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EscrowCompanyMessage>
    READER$ = (org.apache.avro.io.DatumReader<EscrowCompanyMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.escrowCompanyId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.escrowCompanyId);
    }

    if (this.escrowCompanyParty == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.escrowCompanyParty.customEncode(out);
    }

    if (this.escrowCompanyContact == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.escrowCompanyContact.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.escrowCompanyId = null;
      } else {
        this.escrowCompanyId = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.escrowCompanyParty = null;
      } else {
        if (this.escrowCompanyParty == null) {
          this.escrowCompanyParty = new com.tenx.resi.ms.contract.api.message.offer.PartyMessage();
        }
        this.escrowCompanyParty.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.escrowCompanyContact = null;
      } else {
        if (this.escrowCompanyContact == null) {
          this.escrowCompanyContact = new com.tenx.resi.ms.contract.api.message.offer.PartyMessage();
        }
        this.escrowCompanyContact.customDecode(in);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.escrowCompanyId = null;
          } else {
            this.escrowCompanyId = in.readLong();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.escrowCompanyParty = null;
          } else {
            if (this.escrowCompanyParty == null) {
              this.escrowCompanyParty = new com.tenx.resi.ms.contract.api.message.offer.PartyMessage();
            }
            this.escrowCompanyParty.customDecode(in);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.escrowCompanyContact = null;
          } else {
            if (this.escrowCompanyContact == null) {
              this.escrowCompanyContact = new com.tenx.resi.ms.contract.api.message.offer.PartyMessage();
            }
            this.escrowCompanyContact.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










