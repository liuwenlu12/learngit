package device.demo.models.device;

import witparking.core.data.mybatis.mapper.mapper.annotation.NameStyle;
import witparking.core.data.mybatis.mapper.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "device")
@NameStyle(Style.normal)
public class Device implements Serializable {
  @Id
  private String id;
  private String statusId;
  private String baseInfoId;
  private long status;
  private String propsId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }


  public String getBaseInfoId() {
    return baseInfoId;
  }

  public void setBaseInfoId(String baseInfoId) {
    this.baseInfoId = baseInfoId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getPropsId() {
    return propsId;
  }

  public void setPropsId(String propsId) {
    this.propsId = propsId;
  }

  @Override
  public String toString() {
    return "Device{" +
            "id='" + id + '\'' +
            ", statusId='" + statusId + '\'' +
            ", baseInfoId='" + baseInfoId + '\'' +
            ", status=" + status +
            ", propsId='" + propsId + '\'' +
            '}';
  }
}
