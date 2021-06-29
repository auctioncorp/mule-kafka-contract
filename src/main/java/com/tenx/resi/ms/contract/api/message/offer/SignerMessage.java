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
public class SignerMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4106378106351021101L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SignerMessage\",\"namespace\":\"com.tenx.resi.ms.contract.api.message.offer\",\"fields\":[{\"name\":\"signerId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"signerName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"signerTitle\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"signerTitleOther\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"percentStake\",\"type\":[\"null\",{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}],\"default\":null},{\"name\":\"isSigner\",\"type\":\"boolean\"},{\"name\":\"signerEmail\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SignerMessage> ENCODER =
      new BinaryMessageEncoder<SignerMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SignerMessage> DECODER =
      new BinaryMessageDecoder<SignerMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SignerMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SignerMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SignerMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SignerMessage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SignerMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SignerMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SignerMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SignerMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Long signerId;
   private java.lang.CharSequence signerName;
   private java.lang.CharSequence signerTitle;
   private java.lang.CharSequence signerTitleOther;
   private java.math.BigDecimal percentStake;
   private boolean isSigner;
   private java.lang.CharSequence signerEmail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SignerMessage() {}

  /**
   * All-args constructor.
   * @param signerId The new value for signerId
   * @param signerName The new value for signerName
   * @param signerTitle The new value for signerTitle
   * @param signerTitleOther The new value for signerTitleOther
   * @param percentStake The new value for percentStake
   * @param isSigner The new value for isSigner
   * @param signerEmail The new value for signerEmail
   */
  public SignerMessage(java.lang.Long signerId, java.lang.CharSequence signerName, java.lang.CharSequence signerTitle, java.lang.CharSequence signerTitleOther, java.math.BigDecimal percentStake, java.lang.Boolean isSigner, java.lang.CharSequence signerEmail) {
    this.signerId = signerId;
    this.signerName = signerName;
    this.signerTitle = signerTitle;
    this.signerTitleOther = signerTitleOther;
    this.percentStake = percentStake;
    this.isSigner = isSigner;
    this.signerEmail = signerEmail;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return signerId;
    case 1: return signerName;
    case 2: return signerTitle;
    case 3: return signerTitleOther;
    case 4: return percentStake;
    case 5: return isSigner;
    case 6: return signerEmail;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: signerId = (java.lang.Long)value$; break;
    case 1: signerName = (java.lang.CharSequence)value$; break;
    case 2: signerTitle = (java.lang.CharSequence)value$; break;
    case 3: signerTitleOther = (java.lang.CharSequence)value$; break;
    case 4: percentStake = (java.math.BigDecimal)value$; break;
    case 5: isSigner = (java.lang.Boolean)value$; break;
    case 6: signerEmail = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'signerId' field.
   * @return The value of the 'signerId' field.
   */
  public java.lang.Long getSignerId() {
    return signerId;
  }


  /**
   * Sets the value of the 'signerId' field.
   * @param value the value to set.
   */
  public void setSignerId(java.lang.Long value) {
    this.signerId = value;
  }

  /**
   * Gets the value of the 'signerName' field.
   * @return The value of the 'signerName' field.
   */
  public java.lang.CharSequence getSignerName() {
    return signerName;
  }


  /**
   * Sets the value of the 'signerName' field.
   * @param value the value to set.
   */
  public void setSignerName(java.lang.CharSequence value) {
    this.signerName = value;
  }

  /**
   * Gets the value of the 'signerTitle' field.
   * @return The value of the 'signerTitle' field.
   */
  public java.lang.CharSequence getSignerTitle() {
    return signerTitle;
  }


  /**
   * Sets the value of the 'signerTitle' field.
   * @param value the value to set.
   */
  public void setSignerTitle(java.lang.CharSequence value) {
    this.signerTitle = value;
  }

  /**
   * Gets the value of the 'signerTitleOther' field.
   * @return The value of the 'signerTitleOther' field.
   */
  public java.lang.CharSequence getSignerTitleOther() {
    return signerTitleOther;
  }


  /**
   * Sets the value of the 'signerTitleOther' field.
   * @param value the value to set.
   */
  public void setSignerTitleOther(java.lang.CharSequence value) {
    this.signerTitleOther = value;
  }

  /**
   * Gets the value of the 'percentStake' field.
   * @return The value of the 'percentStake' field.
   */
  public java.math.BigDecimal getPercentStake() {
    return percentStake;
  }


  /**
   * Sets the value of the 'percentStake' field.
   * @param value the value to set.
   */
  public void setPercentStake(java.math.BigDecimal value) {
    this.percentStake = value;
  }

  /**
   * Gets the value of the 'isSigner' field.
   * @return The value of the 'isSigner' field.
   */
  public boolean getIsSigner() {
    return isSigner;
  }


  /**
   * Sets the value of the 'isSigner' field.
   * @param value the value to set.
   */
  public void setIsSigner(boolean value) {
    this.isSigner = value;
  }

  /**
   * Gets the value of the 'signerEmail' field.
   * @return The value of the 'signerEmail' field.
   */
  public java.lang.CharSequence getSignerEmail() {
    return signerEmail;
  }


  /**
   * Sets the value of the 'signerEmail' field.
   * @param value the value to set.
   */
  public void setSignerEmail(java.lang.CharSequence value) {
    this.signerEmail = value;
  }

  /**
   * Creates a new SignerMessage RecordBuilder.
   * @return A new SignerMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder newBuilder() {
    return new com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder();
  }

  /**
   * Creates a new SignerMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SignerMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder newBuilder(com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder other) {
    if (other == null) {
      return new com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder();
    } else {
      return new com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder(other);
    }
  }

  /**
   * Creates a new SignerMessage RecordBuilder by copying an existing SignerMessage instance.
   * @param other The existing instance to copy.
   * @return A new SignerMessage RecordBuilder
   */
  public static com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder newBuilder(com.tenx.resi.ms.contract.api.message.offer.SignerMessage other) {
    if (other == null) {
      return new com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder();
    } else {
      return new com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for SignerMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SignerMessage>
    implements org.apache.avro.data.RecordBuilder<SignerMessage> {

    private java.lang.Long signerId;
    private java.lang.CharSequence signerName;
    private java.lang.CharSequence signerTitle;
    private java.lang.CharSequence signerTitleOther;
    private java.math.BigDecimal percentStake;
    private boolean isSigner;
    private java.lang.CharSequence signerEmail;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.signerId)) {
        this.signerId = data().deepCopy(fields()[0].schema(), other.signerId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.signerName)) {
        this.signerName = data().deepCopy(fields()[1].schema(), other.signerName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.signerTitle)) {
        this.signerTitle = data().deepCopy(fields()[2].schema(), other.signerTitle);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.signerTitleOther)) {
        this.signerTitleOther = data().deepCopy(fields()[3].schema(), other.signerTitleOther);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.percentStake)) {
        this.percentStake = data().deepCopy(fields()[4].schema(), other.percentStake);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.isSigner)) {
        this.isSigner = data().deepCopy(fields()[5].schema(), other.isSigner);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.signerEmail)) {
        this.signerEmail = data().deepCopy(fields()[6].schema(), other.signerEmail);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing SignerMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tenx.resi.ms.contract.api.message.offer.SignerMessage other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.signerId)) {
        this.signerId = data().deepCopy(fields()[0].schema(), other.signerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.signerName)) {
        this.signerName = data().deepCopy(fields()[1].schema(), other.signerName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.signerTitle)) {
        this.signerTitle = data().deepCopy(fields()[2].schema(), other.signerTitle);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.signerTitleOther)) {
        this.signerTitleOther = data().deepCopy(fields()[3].schema(), other.signerTitleOther);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.percentStake)) {
        this.percentStake = data().deepCopy(fields()[4].schema(), other.percentStake);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isSigner)) {
        this.isSigner = data().deepCopy(fields()[5].schema(), other.isSigner);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.signerEmail)) {
        this.signerEmail = data().deepCopy(fields()[6].schema(), other.signerEmail);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'signerId' field.
      * @return The value.
      */
    public java.lang.Long getSignerId() {
      return signerId;
    }


    /**
      * Sets the value of the 'signerId' field.
      * @param value The value of 'signerId'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder setSignerId(java.lang.Long value) {
      validate(fields()[0], value);
      this.signerId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'signerId' field has been set.
      * @return True if the 'signerId' field has been set, false otherwise.
      */
    public boolean hasSignerId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'signerId' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder clearSignerId() {
      signerId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'signerName' field.
      * @return The value.
      */
    public java.lang.CharSequence getSignerName() {
      return signerName;
    }


    /**
      * Sets the value of the 'signerName' field.
      * @param value The value of 'signerName'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder setSignerName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.signerName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'signerName' field has been set.
      * @return True if the 'signerName' field has been set, false otherwise.
      */
    public boolean hasSignerName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'signerName' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder clearSignerName() {
      signerName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'signerTitle' field.
      * @return The value.
      */
    public java.lang.CharSequence getSignerTitle() {
      return signerTitle;
    }


    /**
      * Sets the value of the 'signerTitle' field.
      * @param value The value of 'signerTitle'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder setSignerTitle(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.signerTitle = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'signerTitle' field has been set.
      * @return True if the 'signerTitle' field has been set, false otherwise.
      */
    public boolean hasSignerTitle() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'signerTitle' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder clearSignerTitle() {
      signerTitle = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'signerTitleOther' field.
      * @return The value.
      */
    public java.lang.CharSequence getSignerTitleOther() {
      return signerTitleOther;
    }


    /**
      * Sets the value of the 'signerTitleOther' field.
      * @param value The value of 'signerTitleOther'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder setSignerTitleOther(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.signerTitleOther = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'signerTitleOther' field has been set.
      * @return True if the 'signerTitleOther' field has been set, false otherwise.
      */
    public boolean hasSignerTitleOther() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'signerTitleOther' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder clearSignerTitleOther() {
      signerTitleOther = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'percentStake' field.
      * @return The value.
      */
    public java.math.BigDecimal getPercentStake() {
      return percentStake;
    }


    /**
      * Sets the value of the 'percentStake' field.
      * @param value The value of 'percentStake'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder setPercentStake(java.math.BigDecimal value) {
      validate(fields()[4], value);
      this.percentStake = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'percentStake' field has been set.
      * @return True if the 'percentStake' field has been set, false otherwise.
      */
    public boolean hasPercentStake() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'percentStake' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder clearPercentStake() {
      percentStake = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'isSigner' field.
      * @return The value.
      */
    public boolean getIsSigner() {
      return isSigner;
    }


    /**
      * Sets the value of the 'isSigner' field.
      * @param value The value of 'isSigner'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder setIsSigner(boolean value) {
      validate(fields()[5], value);
      this.isSigner = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'isSigner' field has been set.
      * @return True if the 'isSigner' field has been set, false otherwise.
      */
    public boolean hasIsSigner() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'isSigner' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder clearIsSigner() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'signerEmail' field.
      * @return The value.
      */
    public java.lang.CharSequence getSignerEmail() {
      return signerEmail;
    }


    /**
      * Sets the value of the 'signerEmail' field.
      * @param value The value of 'signerEmail'.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder setSignerEmail(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.signerEmail = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'signerEmail' field has been set.
      * @return True if the 'signerEmail' field has been set, false otherwise.
      */
    public boolean hasSignerEmail() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'signerEmail' field.
      * @return This builder.
      */
    public com.tenx.resi.ms.contract.api.message.offer.SignerMessage.Builder clearSignerEmail() {
      signerEmail = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SignerMessage build() {
      try {
        SignerMessage record = new SignerMessage();
        record.signerId = fieldSetFlags()[0] ? this.signerId : (java.lang.Long) defaultValue(fields()[0]);
        record.signerName = fieldSetFlags()[1] ? this.signerName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.signerTitle = fieldSetFlags()[2] ? this.signerTitle : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.signerTitleOther = fieldSetFlags()[3] ? this.signerTitleOther : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.percentStake = fieldSetFlags()[4] ? this.percentStake : (java.math.BigDecimal) defaultValue(fields()[4]);
        record.isSigner = fieldSetFlags()[5] ? this.isSigner : (java.lang.Boolean) defaultValue(fields()[5]);
        record.signerEmail = fieldSetFlags()[6] ? this.signerEmail : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SignerMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<SignerMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SignerMessage>
    READER$ = (org.apache.avro.io.DatumReader<SignerMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.signerId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.signerId);
    }

    if (this.signerName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.signerName);
    }

    if (this.signerTitle == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.signerTitle);
    }

    if (this.signerTitleOther == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.signerTitleOther);
    }

    if (this.percentStake == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.percentStake.toString());
    }

    out.writeBoolean(this.isSigner);

    if (this.signerEmail == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.signerEmail);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.signerId = null;
      } else {
        this.signerId = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.signerName = null;
      } else {
        this.signerName = in.readString(this.signerName instanceof Utf8 ? (Utf8)this.signerName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.signerTitle = null;
      } else {
        this.signerTitle = in.readString(this.signerTitle instanceof Utf8 ? (Utf8)this.signerTitle : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.signerTitleOther = null;
      } else {
        this.signerTitleOther = in.readString(this.signerTitleOther instanceof Utf8 ? (Utf8)this.signerTitleOther : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.percentStake = null;
      } else {
        this.percentStake = new java.math.BigDecimal(in.readString());
      }

      this.isSigner = in.readBoolean();

      if (in.readIndex() != 1) {
        in.readNull();
        this.signerEmail = null;
      } else {
        this.signerEmail = in.readString(this.signerEmail instanceof Utf8 ? (Utf8)this.signerEmail : null);
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.signerId = null;
          } else {
            this.signerId = in.readLong();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.signerName = null;
          } else {
            this.signerName = in.readString(this.signerName instanceof Utf8 ? (Utf8)this.signerName : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.signerTitle = null;
          } else {
            this.signerTitle = in.readString(this.signerTitle instanceof Utf8 ? (Utf8)this.signerTitle : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.signerTitleOther = null;
          } else {
            this.signerTitleOther = in.readString(this.signerTitleOther instanceof Utf8 ? (Utf8)this.signerTitleOther : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.percentStake = null;
          } else {
            this.percentStake = new java.math.BigDecimal(in.readString());
          }
          break;

        case 5:
          this.isSigner = in.readBoolean();
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.signerEmail = null;
          } else {
            this.signerEmail = in.readString(this.signerEmail instanceof Utf8 ? (Utf8)this.signerEmail : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










