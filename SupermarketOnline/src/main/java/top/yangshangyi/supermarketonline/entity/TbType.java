package top.yangshangyi.supermarketonline.entity;

import java.util.Date;

import top.yangshangyi.supermarketonline.base.BaseEntity;

public class TbType extends BaseEntity{

  private static final long serialVersionUID = -1516047841295812725L;
  private Integer tid;
  private String typeName;
  private String typeInfo;
  private String isEnable;
  private Date lastupdate;
  public TbType() {
  }
  public Integer getTid() {
    return tid;
  }
  public void setTid(Integer tid) {
    this.tid = tid;
  }
  public String getTypeName() {
    return typeName;
  }
  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }
  public String getTypeInfo() {
    return typeInfo;
  }
  public void setTypeInfo(String typeInfo) {
    this.typeInfo = typeInfo;
  }
  public String getIsEnable() {
    return isEnable;
  }
  public void setIsEnable(String isEnable) {
    this.isEnable = isEnable;
  }
  public Date getLastupdate() {
    return lastupdate;
  }
  public void setLastupdate(Date lastupdate) {
    this.lastupdate = lastupdate;
  }
  @Override
  public String toString() {
    return "TbType [tid=" + tid + ", typeName=" + typeName + ", typeInfo=" + typeInfo + ", isEnable=" + isEnable + ", lastupdate=" + lastupdate + "]";
  }
  public TbType(Integer tid, String typeName, String typeInfo, String isEnable, Date lastupdate) {
    super();
    this.tid = tid;
    this.typeName = typeName;
    this.typeInfo = typeInfo;
    this.isEnable = isEnable;
    this.lastupdate = lastupdate;
  }
  
}
