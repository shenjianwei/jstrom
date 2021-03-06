/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-20")
public class SubmitOptions implements org.apache.thrift.TBase<SubmitOptions, SubmitOptions._Fields>, java.io.Serializable, Cloneable, Comparable<SubmitOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SubmitOptions");

  private static final org.apache.thrift.protocol.TField INITIAL_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("initial_status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CREDS_FIELD_DESC = new org.apache.thrift.protocol.TField("creds", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SubmitOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SubmitOptionsTupleSchemeFactory());
  }

  private TopologyInitialStatus initial_status; // required
  private Credentials creds; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TopologyInitialStatus
     */
    INITIAL_STATUS((short)1, "initial_status"),
    CREDS((short)2, "creds");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INITIAL_STATUS
          return INITIAL_STATUS;
        case 2: // CREDS
          return CREDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CREDS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INITIAL_STATUS, new org.apache.thrift.meta_data.FieldMetaData("initial_status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TopologyInitialStatus.class)));
    tmpMap.put(_Fields.CREDS, new org.apache.thrift.meta_data.FieldMetaData("creds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Credentials.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SubmitOptions.class, metaDataMap);
  }

  public SubmitOptions() {
  }

  public SubmitOptions(
    TopologyInitialStatus initial_status)
  {
    this();
    this.initial_status = initial_status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubmitOptions(SubmitOptions other) {
    if (other.is_set_initial_status()) {
      this.initial_status = other.initial_status;
    }
    if (other.is_set_creds()) {
      this.creds = new Credentials(other.creds);
    }
  }

  public SubmitOptions deepCopy() {
    return new SubmitOptions(this);
  }

  @Override
  public void clear() {
    this.initial_status = null;
    this.creds = null;
  }

  /**
   * 
   * @see TopologyInitialStatus
   */
  public TopologyInitialStatus get_initial_status() {
    return this.initial_status;
  }

  /**
   * 
   * @see TopologyInitialStatus
   */
  public void set_initial_status(TopologyInitialStatus initial_status) {
    this.initial_status = initial_status;
  }

  public void unset_initial_status() {
    this.initial_status = null;
  }

  /** Returns true if field initial_status is set (has been assigned a value) and false otherwise */
  public boolean is_set_initial_status() {
    return this.initial_status != null;
  }

  public void set_initial_status_isSet(boolean value) {
    if (!value) {
      this.initial_status = null;
    }
  }

  public Credentials get_creds() {
    return this.creds;
  }

  public void set_creds(Credentials creds) {
    this.creds = creds;
  }

  public void unset_creds() {
    this.creds = null;
  }

  /** Returns true if field creds is set (has been assigned a value) and false otherwise */
  public boolean is_set_creds() {
    return this.creds != null;
  }

  public void set_creds_isSet(boolean value) {
    if (!value) {
      this.creds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INITIAL_STATUS:
      if (value == null) {
        unset_initial_status();
      } else {
        set_initial_status((TopologyInitialStatus)value);
      }
      break;

    case CREDS:
      if (value == null) {
        unset_creds();
      } else {
        set_creds((Credentials)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INITIAL_STATUS:
      return get_initial_status();

    case CREDS:
      return get_creds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INITIAL_STATUS:
      return is_set_initial_status();
    case CREDS:
      return is_set_creds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubmitOptions)
      return this.equals((SubmitOptions)that);
    return false;
  }

  public boolean equals(SubmitOptions that) {
    if (that == null)
      return false;

    boolean this_present_initial_status = true && this.is_set_initial_status();
    boolean that_present_initial_status = true && that.is_set_initial_status();
    if (this_present_initial_status || that_present_initial_status) {
      if (!(this_present_initial_status && that_present_initial_status))
        return false;
      if (!this.initial_status.equals(that.initial_status))
        return false;
    }

    boolean this_present_creds = true && this.is_set_creds();
    boolean that_present_creds = true && that.is_set_creds();
    if (this_present_creds || that_present_creds) {
      if (!(this_present_creds && that_present_creds))
        return false;
      if (!this.creds.equals(that.creds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_initial_status = true && (is_set_initial_status());
    list.add(present_initial_status);
    if (present_initial_status)
      list.add(initial_status.getValue());

    boolean present_creds = true && (is_set_creds());
    list.add(present_creds);
    if (present_creds)
      list.add(creds);

    return list.hashCode();
  }

  @Override
  public int compareTo(SubmitOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_initial_status()).compareTo(other.is_set_initial_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_initial_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.initial_status, other.initial_status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_creds()).compareTo(other.is_set_creds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_creds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creds, other.creds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SubmitOptions(");
    boolean first = true;

    sb.append("initial_status:");
    if (this.initial_status == null) {
      sb.append("null");
    } else {
      sb.append(this.initial_status);
    }
    first = false;
    if (is_set_creds()) {
      if (!first) sb.append(", ");
      sb.append("creds:");
      if (this.creds == null) {
        sb.append("null");
      } else {
        sb.append(this.creds);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!is_set_initial_status()) {
      throw new TProtocolException("Required field 'initial_status' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (creds != null) {
      creds.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SubmitOptionsStandardSchemeFactory implements SchemeFactory {
    public SubmitOptionsStandardScheme getScheme() {
      return new SubmitOptionsStandardScheme();
    }
  }

  private static class SubmitOptionsStandardScheme extends StandardScheme<SubmitOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SubmitOptions struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INITIAL_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.initial_status = backtype.storm.generated.TopologyInitialStatus.findByValue(iprot.readI32());
              struct.set_initial_status_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREDS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.creds = new Credentials();
              struct.creds.read(iprot);
              struct.set_creds_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SubmitOptions struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.initial_status != null) {
        oprot.writeFieldBegin(INITIAL_STATUS_FIELD_DESC);
        oprot.writeI32(struct.initial_status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.creds != null) {
        if (struct.is_set_creds()) {
          oprot.writeFieldBegin(CREDS_FIELD_DESC);
          struct.creds.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SubmitOptionsTupleSchemeFactory implements SchemeFactory {
    public SubmitOptionsTupleScheme getScheme() {
      return new SubmitOptionsTupleScheme();
    }
  }

  private static class SubmitOptionsTupleScheme extends TupleScheme<SubmitOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SubmitOptions struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.initial_status.getValue());
      BitSet optionals = new BitSet();
      if (struct.is_set_creds()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_creds()) {
        struct.creds.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SubmitOptions struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.initial_status = backtype.storm.generated.TopologyInitialStatus.findByValue(iprot.readI32());
      struct.set_initial_status_isSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.creds = new Credentials();
        struct.creds.read(iprot);
        struct.set_creds_isSet(true);
      }
    }
  }

}

