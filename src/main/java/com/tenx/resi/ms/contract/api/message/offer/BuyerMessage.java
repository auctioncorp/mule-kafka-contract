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
public class BuyerMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5492174398617393363L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BuyerMessage\",\"namespace\":\"com.tenx.resi.ms.contract.api.message.offer\",\"fields\":[{\"name\":\"buyerId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"buyerParty\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"PartyMessage\",\"fields\":[{\"name\":\"partyId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"partyType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"participantType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"firstName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"lastName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"middleName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"noMiddleName\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"dob\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"companyName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"addressType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"streetNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"streetName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"streetUnit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"city\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"postalCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"emailAddress\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"phoneType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"phoneNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"licenseNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"licenseState\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"licenseType\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"maritalStatus\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"primaryFlag\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isInternationalBuyer\",\"type\":\"boolean\"},{\"name\":\"isSpouseOnContract\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"spouseName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"spouseEmailAddress\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"spouseMaritalStatus\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BuyerMessage> ENCODER =
      new BinaryMessageEncoder<BuyerMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BuyerMessage> DECODER =
      new BinaryMessageDecoder<BuyerMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<BuyerMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<BuyerMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<BuyerMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BuyerMessage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this BuyerMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a BuyerMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a BuyerMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static BuyerMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Long buyerId;
   private com.tenx.resi.ms.contract.api.message.offer.PartyMessage buyerParty;
   private java.lang.CharSequence maritalStatus;
   private java.lang.Boolean primaryFlag;
   private boolean isInternationalBuyer;
   private java.lang.Boolean isSpouseOnContract;
   private java.lang.CharSequence spouseName;
   private java.lang.CharSequence spouseEmailAddress;
   private java.lang.CharSequence spouseMaritalStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BuyerMessage() {}

  /**
   * All-args constructor.
   * @param buyerId The new value for buyerId
   * @param buyerParty The new value for buyerParty
   * @param maritalStatus The new value for maritalStatus
   * @param primaryFlag The new value for primaryFlag
   * @param isInternationalBuyer The new value for isInternationalBuyer
   * @param isSpouseOnContract The new value for isSpouseOnContract
   * @param spouseName The new value for spouseName
   * @param spouseEmailAddress The new value for spouseEmailAddress
   * @param spouseMaritalStatus The new value for spouseMaritalStatus
   */
  public BuyerMessage(java.lang.Long buyerId, com.tenx.resi.ms.contract.api.message.offer.PartyMessage buyerParty, java.lang.CharSequence maritalStatus, java.lang.Boolean primaryFlag, java.lang.Boolean isInternationalBuyer, java.lang.Boolean isSpouseOnContract, java.lang.CharSequence spouseName, java.lang.CharSequence spouseEmailAddress, java.lang.CharSequence spouseMaritalStatus) {
    this.buyerId = buyerId;
    this.buyerParty = buyerParty;
    this.maritalStatus = maritalStatus;
    this.primaryFlag = primaryFlag;
    this.isInternationalBuyer = isInternationalBuyer;
    this.isSpouseOnContract = isSpouseOnContract;
    this.spouseName = spouseName;
    this.spouseEmailAddress = spouseEmailAddress;
    this.spouseMaritalStatus = spouseMaritalStatus;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return buyerId;
    case 1: return buyerParty;
    case 2: return maritalStatus;
    case 3: return primaryFlag;
    case 4: return isInternationalBuyer;
    case 5: return isSpouseOnContract;
    case 6: return spouseName;
    case 7: return spouseEmailAddress;
    case 8: return spouseMaritalStatus;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: buyerId = (java.lang.Long)value$; break;
    case 1: buyerParty = (com.tenx.resi.ms.contract.api.message.offer.PartyMessage)value$; break;
    case 2: maritalStatus = (java.lang.CharSequence)value$; break;
    case 3: primaryFlag = (java.lang.Boolean)value$; break;
    case 4: isInternationalBuyer = (java.lang.Boolean)value$; break;
    case 5: isSpouseOnContract = (java.lang.Boolean)value$; break;
    case 6: spouseName = (java.lang.CharSequence)value$; break;
    case 7: spouseEmailAddress = (java.lang.CharSequence)value$; break;
    case 8: spouseMaritalStatus = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'buyerId' field.
   * @return The value of the 'buyerId' field.
   */
  public java.lang.Long getBuyerId() {
    return buyerId;
  }


  /**
   * Sets the value of the 'buyerId' field.
   * @param value the value to set.
   */
  public void setBuyerId(java.lang.Long value) {
    this.buyerId = value;
  }

  /**
   * Gets the value of the 'buyerParty' field.
   * @return The value of the 'buyerParty' field.
   */
  public com.tenx.resi.ms.contract.api.message.offer.PartyMessage getBuyerParty() {
    return buyerParty;
  }


  /**
   * Sets the value of the 'buyerParty' field.
   * @param value the value to set.
   */
  public void setBuyerParty(com.tenx.resi.ms.contract.api.message.offer.PartyMessage value) {
    this.buyerParty = value;
  }

  /**
   * Gets the value of the 'maritalStatus' field.
   * @return The value of the 'maritalStatus' field.
   */
  public java.lang.CharSequence getMaritalStatus() {
    return maritalStatus;
  }


  /**
   * Sets the value of the 'maritalStatus' field.
   * @param value the value to set.
   */
  public void setMaritalStatus(java.lang.CharSequence value) {
    this.maritalStatus = value;
  }

  /**
   * Gets the value of the 'primaryFlag' field.
   * @return The value of the 'primaryFlag' field.
   */
  public java.lang.Boolean getPrimaryFlag() {
    return primaryFlag;
  }


  /**
   * Sets the value of the 'primaryFlag' field.
   * @param value the value to set.
   */
  public void setPrimaryFlag(java.lang.Boolean value) {
    this.primaryFlag = value;
  }

  /**
   * Gets the value of the 'isInternationalBuyer' field.
   * @return The value of the 'isInternationalBuyer' field.
   */
  public boolean getIsInternationalBuyer() {
    return isInternationalBuyer;
  }


  /**
   * Sets the value of the 'isInternationalBuyer' field.
   * @param value the value to set.
   */
  public void setIsInternationalBuyer(boolean value) {
    this.isInternationalBuyer = value;
  }

  /**
   * Gets the value of the 'isSpouseOnContract' field.
   * @return The value of the 'isSpouseOnContract' field.
   */
  public java.lang.Boolean getIsSpouseOnContract() {
    return isSpouseOnContract;
  }


  /**
   * Sets the value of the 'isSpouseOnContract' field.
   * @param value the value to set.
   */
  public void setIsSpouseOnContract(java.lang.Boolean value) {
    this.isSpouseOnContract = value;
  }

  /**
   * Gets the value of the 'spouseName' field.
   * @return The value of the 'spouseName' field.
   */
  public java.lang.CharSequence getSpouseName() {
    return spouseName;
  }


  /**
   * Sets the value of the 'spouseName' field.
   * @param value the value to set.
   */
  public void setSpouseName(java.lang.CharSequence value) {
    this.spouseName = value;
  }

  /**
   * Gets the value of the 'spouseEmailAddress' field.
   * @return The value of the 'spouseEmailAddress' field.
   */
  public java.lang.CharSequence getSpouseEmailAddress() {
    return spouseEmailAddress;
  }


  /**
   * Sets the value of the 'spouseEmailAddress' field.
   * @param value the value to set.
   */
  public void setSpouseEmailAddress(java.lang.CharSequence value) {
    this.spouseEmailAddress = value;
  }

  /**
   * Gets the value of the 'spouseMaritalStatus' field.
   * @return The value of the 'spouseMaritalStatus' field.
   */
  public java.lang.CharSequence getSpouseMaritalStatus() {
    return spouseMaritalStatus;
  }


  /**
   * Sets the value of the 'spouseMaritalStatus' field.
   * @param value the value to set.
   */
  public void setSpouseMaritalStatus(java.lang.CharSequence value) {
    this.spouseMaritalStatus = value;
  }

  /**
   * Creates a new BuyerMessage RecordBuilder.
   * @return A new BuyerMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder newBuilder() {
    return new com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder();
  }

  /**
   * Creates a new BuyerMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BuyerMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder newBuilder(com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder other) {
    if (other == null) {
      return new com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder();
    } else {
      return new com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder(other);
    }
  }

  /**
   * Creates a new BuyerMessage RecordBuilder by copying an existing BuyerMessage instance.
   * @param other The existing instance to copy.
   * @return A new BuyerMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder newBuilder(com.tenx.resi.ms.contract.api.message.offer.BuyerMessage other) {
    if (other == null) {
      return new com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder();
    } else {
      return new com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for BuyerMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BuyerMessage>
    implements org.apache.avro.data.RecordBuilder<BuyerMessage> {

    private java.lang.Long buyerId;
    private com.tenx.resi.ms.contract.api.message.offer.PartyMessage buyerParty;
    private com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder buyerPartyBuilder;
    private java.lang.CharSequence maritalStatus;
    private java.lang.Boolean primaryFlag;
    private boolean isInternationalBuyer;
    private java.lang.Boolean isSpouseOnContract;
    private java.lang.CharSequence spouseName;
    private java.lang.CharSequence spouseEmailAddress;
    private java.lang.CharSequence spouseMaritalStatus;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.buyerId)) {
        this.buyerId = data().deepCopy(fields()[0].schema(), other.buyerId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.buyerParty)) {
        this.buyerParty = data().deepCopy(fields()[1].schema(), other.buyerParty);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasBuyerPartyBuilder()) {
        this.buyerPartyBuilder = com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder(other.getBuyerPartyBuilder());
      }
      if (isValidValue(fields()[2], other.maritalStatus)) {
        this.maritalStatus = data().deepCopy(fields()[2].schema(), other.maritalStatus);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.primaryFlag)) {
        this.primaryFlag = data().deepCopy(fields()[3].schema(), other.primaryFlag);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.isInternationalBuyer)) {
        this.isInternationalBuyer = data().deepCopy(fields()[4].schema(), other.isInternationalBuyer);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.isSpouseOnContract)) {
        this.isSpouseOnContract = data().deepCopy(fields()[5].schema(), other.isSpouseOnContract);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.spouseName)) {
        this.spouseName = data().deepCopy(fields()[6].schema(), other.spouseName);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.spouseEmailAddress)) {
        this.spouseEmailAddress = data().deepCopy(fields()[7].schema(), other.spouseEmailAddress);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.spouseMaritalStatus)) {
        this.spouseMaritalStatus = data().deepCopy(fields()[8].schema(), other.spouseMaritalStatus);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing BuyerMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tenx.resi.ms.contract.api.message.offer.BuyerMessage other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.buyerId)) {
        this.buyerId = data().deepCopy(fields()[0].schema(), other.buyerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.buyerParty)) {
        this.buyerParty = data().deepCopy(fields()[1].schema(), other.buyerParty);
        fieldSetFlags()[1] = true;
      }
      this.buyerPartyBuilder = null;
      if (isValidValue(fields()[2], other.maritalStatus)) {
        this.maritalStatus = data().deepCopy(fields()[2].schema(), other.maritalStatus);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.primaryFlag)) {
        this.primaryFlag = data().deepCopy(fields()[3].schema(), other.primaryFlag);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isInternationalBuyer)) {
        this.isInternationalBuyer = data().deepCopy(fields()[4].schema(), other.isInternationalBuyer);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isSpouseOnContract)) {
        this.isSpouseOnContract = data().deepCopy(fields()[5].schema(), other.isSpouseOnContract);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.spouseName)) {
        this.spouseName = data().deepCopy(fields()[6].schema(), other.spouseName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.spouseEmailAddress)) {
        this.spouseEmailAddress = data().deepCopy(fields()[7].schema(), other.spouseEmailAddress);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.spouseMaritalStatus)) {
        this.spouseMaritalStatus = data().deepCopy(fields()[8].schema(), other.spouseMaritalStatus);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'buyerId' field.
      * @return The value.
      */
    public java.lang.Long getBuyerId() {
      return buyerId;
    }


    /**
      * Sets the value of the 'buyerId' field.
      * @param value The value of 'buyerId'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setBuyerId(java.lang.Long value) {
      validate(fields()[0], value);
      this.buyerId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'buyerId' field has been set.
      * @return True if the 'buyerId' field has been set, false otherwise.
      */
    public boolean hasBuyerId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'buyerId' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearBuyerId() {
      buyerId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'buyerParty' field.
      * @return The value.
      */
    public com.tenx.resi.ms.contract.api.message.offer.PartyMessage getBuyerParty() {
      return buyerParty;
    }


    /**
      * Sets the value of the 'buyerParty' field.
      * @param value The value of 'buyerParty'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setBuyerParty(com.tenx.resi.ms.contract.api.message.offer.PartyMessage value) {
      validate(fields()[1], value);
      this.buyerPartyBuilder = null;
      this.buyerParty = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'buyerParty' field has been set.
      * @return True if the 'buyerParty' field has been set, false otherwise.
      */
    public boolean hasBuyerParty() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'buyerParty' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder getBuyerPartyBuilder() {
      if (buyerPartyBuilder == null) {
        if (hasBuyerParty()) {
          setBuyerPartyBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder(buyerParty));
        } else {
          setBuyerPartyBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.newBuilder());
        }
      }
      return buyerPartyBuilder;
    }

    /**
     * Sets the Builder instance for the 'buyerParty' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setBuyerPartyBuilder(com.tenx.resi.ms.contract.api.message.offer.PartyMessage.Builder value) {
      clearBuyerParty();
      buyerPartyBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'buyerParty' field has an active Builder instance
     * @return True if the 'buyerParty' field has an active Builder instance
     */
    public boolean hasBuyerPartyBuilder() {
      return buyerPartyBuilder != null;
    }

    /**
      * Clears the value of the 'buyerParty' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearBuyerParty() {
      buyerParty = null;
      buyerPartyBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'maritalStatus' field.
      * @return The value.
      */
    public java.lang.CharSequence getMaritalStatus() {
      return maritalStatus;
    }


    /**
      * Sets the value of the 'maritalStatus' field.
      * @param value The value of 'maritalStatus'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setMaritalStatus(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.maritalStatus = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'maritalStatus' field has been set.
      * @return True if the 'maritalStatus' field has been set, false otherwise.
      */
    public boolean hasMaritalStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'maritalStatus' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearMaritalStatus() {
      maritalStatus = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'primaryFlag' field.
      * @return The value.
      */
    public java.lang.Boolean getPrimaryFlag() {
      return primaryFlag;
    }


    /**
      * Sets the value of the 'primaryFlag' field.
      * @param value The value of 'primaryFlag'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setPrimaryFlag(java.lang.Boolean value) {
      validate(fields()[3], value);
      this.primaryFlag = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'primaryFlag' field has been set.
      * @return True if the 'primaryFlag' field has been set, false otherwise.
      */
    public boolean hasPrimaryFlag() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'primaryFlag' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearPrimaryFlag() {
      primaryFlag = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'isInternationalBuyer' field.
      * @return The value.
      */
    public boolean getIsInternationalBuyer() {
      return isInternationalBuyer;
    }


    /**
      * Sets the value of the 'isInternationalBuyer' field.
      * @param value The value of 'isInternationalBuyer'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setIsInternationalBuyer(boolean value) {
      validate(fields()[4], value);
      this.isInternationalBuyer = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'isInternationalBuyer' field has been set.
      * @return True if the 'isInternationalBuyer' field has been set, false otherwise.
      */
    public boolean hasIsInternationalBuyer() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'isInternationalBuyer' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearIsInternationalBuyer() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'isSpouseOnContract' field.
      * @return The value.
      */
    public java.lang.Boolean getIsSpouseOnContract() {
      return isSpouseOnContract;
    }


    /**
      * Sets the value of the 'isSpouseOnContract' field.
      * @param value The value of 'isSpouseOnContract'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setIsSpouseOnContract(java.lang.Boolean value) {
      validate(fields()[5], value);
      this.isSpouseOnContract = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'isSpouseOnContract' field has been set.
      * @return True if the 'isSpouseOnContract' field has been set, false otherwise.
      */
    public boolean hasIsSpouseOnContract() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'isSpouseOnContract' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearIsSpouseOnContract() {
      isSpouseOnContract = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'spouseName' field.
      * @return The value.
      */
    public java.lang.CharSequence getSpouseName() {
      return spouseName;
    }


    /**
      * Sets the value of the 'spouseName' field.
      * @param value The value of 'spouseName'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setSpouseName(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.spouseName = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'spouseName' field has been set.
      * @return True if the 'spouseName' field has been set, false otherwise.
      */
    public boolean hasSpouseName() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'spouseName' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearSpouseName() {
      spouseName = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'spouseEmailAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getSpouseEmailAddress() {
      return spouseEmailAddress;
    }


    /**
      * Sets the value of the 'spouseEmailAddress' field.
      * @param value The value of 'spouseEmailAddress'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setSpouseEmailAddress(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.spouseEmailAddress = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'spouseEmailAddress' field has been set.
      * @return True if the 'spouseEmailAddress' field has been set, false otherwise.
      */
    public boolean hasSpouseEmailAddress() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'spouseEmailAddress' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearSpouseEmailAddress() {
      spouseEmailAddress = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'spouseMaritalStatus' field.
      * @return The value.
      */
    public java.lang.CharSequence getSpouseMaritalStatus() {
      return spouseMaritalStatus;
    }


    /**
      * Sets the value of the 'spouseMaritalStatus' field.
      * @param value The value of 'spouseMaritalStatus'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder setSpouseMaritalStatus(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.spouseMaritalStatus = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'spouseMaritalStatus' field has been set.
      * @return True if the 'spouseMaritalStatus' field has been set, false otherwise.
      */
    public boolean hasSpouseMaritalStatus() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'spouseMaritalStatus' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.BuyerMessage.Builder clearSpouseMaritalStatus() {
      spouseMaritalStatus = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BuyerMessage build() {
      try {
        BuyerMessage record = new BuyerMessage();
        record.buyerId = fieldSetFlags()[0] ? this.buyerId : (java.lang.Long) defaultValue(fields()[0]);
        if (buyerPartyBuilder != null) {
          try {
            record.buyerParty = this.buyerPartyBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("buyerParty"));
            throw e;
          }
        } else {
          record.buyerParty = fieldSetFlags()[1] ? this.buyerParty : (com.tenx.resi.ms.contract.api.message.offer.PartyMessage) defaultValue(fields()[1]);
        }
        record.maritalStatus = fieldSetFlags()[2] ? this.maritalStatus : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.primaryFlag = fieldSetFlags()[3] ? this.primaryFlag : (java.lang.Boolean) defaultValue(fields()[3]);
        record.isInternationalBuyer = fieldSetFlags()[4] ? this.isInternationalBuyer : (java.lang.Boolean) defaultValue(fields()[4]);
        record.isSpouseOnContract = fieldSetFlags()[5] ? this.isSpouseOnContract : (java.lang.Boolean) defaultValue(fields()[5]);
        record.spouseName = fieldSetFlags()[6] ? this.spouseName : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.spouseEmailAddress = fieldSetFlags()[7] ? this.spouseEmailAddress : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.spouseMaritalStatus = fieldSetFlags()[8] ? this.spouseMaritalStatus : (java.lang.CharSequence) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BuyerMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<BuyerMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BuyerMessage>
    READER$ = (org.apache.avro.io.DatumReader<BuyerMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.buyerId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.buyerId);
    }

    if (this.buyerParty == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.buyerParty.customEncode(out);
    }

    if (this.maritalStatus == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.maritalStatus);
    }

    if (this.primaryFlag == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeBoolean(this.primaryFlag);
    }

    out.writeBoolean(this.isInternationalBuyer);

    if (this.isSpouseOnContract == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeBoolean(this.isSpouseOnContract);
    }

    if (this.spouseName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.spouseName);
    }

    if (this.spouseEmailAddress == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.spouseEmailAddress);
    }

    if (this.spouseMaritalStatus == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.spouseMaritalStatus);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.buyerId = null;
      } else {
        this.buyerId = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.buyerParty = null;
      } else {
        if (this.buyerParty == null) {
          this.buyerParty = new com.tenx.resi.ms.contract.api.message.offer.PartyMessage();
        }
        this.buyerParty.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.maritalStatus = null;
      } else {
        this.maritalStatus = in.readString(this.maritalStatus instanceof Utf8 ? (Utf8)this.maritalStatus : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.primaryFlag = null;
      } else {
        this.primaryFlag = in.readBoolean();
      }

      this.isInternationalBuyer = in.readBoolean();

      if (in.readIndex() != 1) {
        in.readNull();
        this.isSpouseOnContract = null;
      } else {
        this.isSpouseOnContract = in.readBoolean();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.spouseName = null;
      } else {
        this.spouseName = in.readString(this.spouseName instanceof Utf8 ? (Utf8)this.spouseName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.spouseEmailAddress = null;
      } else {
        this.spouseEmailAddress = in.readString(this.spouseEmailAddress instanceof Utf8 ? (Utf8)this.spouseEmailAddress : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.spouseMaritalStatus = null;
      } else {
        this.spouseMaritalStatus = in.readString(this.spouseMaritalStatus instanceof Utf8 ? (Utf8)this.spouseMaritalStatus : null);
      }

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.buyerId = null;
          } else {
            this.buyerId = in.readLong();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.buyerParty = null;
          } else {
            if (this.buyerParty == null) {
              this.buyerParty = new com.tenx.resi.ms.contract.api.message.offer.PartyMessage();
            }
            this.buyerParty.customDecode(in);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.maritalStatus = null;
          } else {
            this.maritalStatus = in.readString(this.maritalStatus instanceof Utf8 ? (Utf8)this.maritalStatus : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.primaryFlag = null;
          } else {
            this.primaryFlag = in.readBoolean();
          }
          break;

        case 4:
          this.isInternationalBuyer = in.readBoolean();
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.isSpouseOnContract = null;
          } else {
            this.isSpouseOnContract = in.readBoolean();
          }
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.spouseName = null;
          } else {
            this.spouseName = in.readString(this.spouseName instanceof Utf8 ? (Utf8)this.spouseName : null);
          }
          break;

        case 7:
          if (in.readIndex() != 1) {
            in.readNull();
            this.spouseEmailAddress = null;
          } else {
            this.spouseEmailAddress = in.readString(this.spouseEmailAddress instanceof Utf8 ? (Utf8)this.spouseEmailAddress : null);
          }
          break;

        case 8:
          if (in.readIndex() != 1) {
            in.readNull();
            this.spouseMaritalStatus = null;
          } else {
            this.spouseMaritalStatus = in.readString(this.spouseMaritalStatus instanceof Utf8 ? (Utf8)this.spouseMaritalStatus : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










