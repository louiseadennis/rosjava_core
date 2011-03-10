/* Auto-generated by genmsg_java.py for file /opt/ros/unstable/stacks/common_msgs/sensor_msgs/msg/Image.msg */

package org.ros.message.sensor;

import org.ros.message.Message;
import org.ros.message.std.Header;

import java.nio.ByteBuffer;

public class Image extends Message {

  public Header header = new Header();
  public long height;
  public long width;
  public java.lang.String encoding = new java.lang.String();
  public short is_bigendian;
  public long step;
  public byte[] data = new byte[0];

  public Image() {
  }

  public static java.lang.String __s_getDataType() {
    return "sensor_msgs/Image";
  }

  public java.lang.String getDataType() {
    return __s_getDataType();
  }

  public static java.lang.String __s_getMD5Sum() {
    return "060021388200f6f0f447d0fcd9c64743";
  }

  public java.lang.String getMD5Sum() {
    return __s_getMD5Sum();
  }

  public static java.lang.String __s_getMessageDefinition() {
    return "# This message contains an uncompressed image\n"
        + "# (0, 0) is at top-left corner of image\n" + "#\n" + "\n"
        + "Header header        # Header timestamp should be acquisition time of image\n"
        + "                     # Header frame_id should be optical frame of camera\n"
        + "                     # origin of frame should be optical center of cameara\n"
        + "                     # +x should point to the right in the image\n"
        + "                     # +y should point down in the image\n"
        + "                     # +z should point into to plane of the image\n"
        + "                     # If the frame_id here and the frame_id of the CameraInfo\n"
        + "                     # message associated with the image conflict\n"
        + "                     # the behavior is undefined\n" + "\n"
        + "uint32 height         # image height, that is, number of rows\n"
        + "uint32 width          # image width, that is, number of columns\n" + "\n"
        + "# The legal values for encoding are in file src/image_encodings.cpp\n"
        + "# If you want to standardize a new string format, join\n"
        + "# ros-users@lists.sourceforge.net and send an email proposing a new encoding.\n" + "\n"
        + "string encoding       # Encoding of pixels -- channel meaning, ordering, size\n"
        + "                      # taken from the list of strings in src/image_encodings.cpp\n"
        + "\n" + "uint8 is_bigendian    # is this data bigendian?\n"
        + "uint32 step           # Full row length in bytes\n"
        + "uint8[] data          # actual matrix data, size is (step * rows)\n" + "\n"
        + "================================================================================\n"
        + "MSG: std_msgs/Header\n" + "# Standard metadata for higher-level stamped data types.\n"
        + "# This is generally used to communicate timestamped data \n"
        + "# in a particular coordinate frame.\n" + "# \n"
        + "# sequence ID: consecutively increasing ID \n" + "uint32 seq\n"
        + "#Two-integer timestamp that is expressed as:\n"
        + "# * stamp.secs: seconds (stamp_secs) since epoch\n"
        + "# * stamp.nsecs: nanoseconds since stamp_secs\n"
        + "# time-handling sugar is provided by the client library\n" + "time stamp\n"
        + "#Frame this data is associated with\n" + "# 0: no frame\n" + "# 1: global frame\n"
        + "string frame_id\n" + "\n" + "";
  }

  public java.lang.String getMessageDefinition() {
    return __s_getMessageDefinition();
  }

  public Image clone() {
    Image c = new Image();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 4; // height
    __l += 4; // width
    __l += 4 + encoding.length();
    __l += 1; // is_bigendian
    __l += 4; // step
    __l += 4 + data.length * 1; // data
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    bb.putInt((int) height);
    bb.putInt((int) width);
    Serialization.writeString(bb, encoding);
    bb.put((byte) is_bigendian);
    bb.putInt((int) step);
    bb.putInt(data.length);
    for (byte val : data) {
      bb.put(val);
    }
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    height = (long) (bb.getInt() & 0xffffffff);
    width = (long) (bb.getInt() & 0xffffffff);
    encoding = Serialization.readString(bb);
    is_bigendian = (short) (bb.get() & 0xff);
    step = (long) (bb.getInt() & 0xffffffff);

    int __data_len = bb.getInt();
  
    data = new byte[__data_len];
    bb.get(data);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if (!(o instanceof Image))
      return false;
    Image other = (Image) o;
    return header.equals(other.header) && height == other.height && width == other.width
        && encoding.equals(other.encoding) && is_bigendian == other.is_bigendian
        && step == other.step && java.util.Arrays.equals(data, other.data) && true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (int) (this.height ^ (this.height >>> 32));
    result = prime * result + (int) (this.width ^ (this.width >>> 32));
    result = prime * result + (this.encoding == null ? 0 : this.encoding.hashCode());
    result = prime * result + this.is_bigendian;
    result = prime * result + (int) (this.step ^ (this.step >>> 32));
    result = prime * result + java.util.Arrays.hashCode(this.data);
    return result;
  }

} // class Image

