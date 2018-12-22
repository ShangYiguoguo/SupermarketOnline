package top.yangshangyi.supermarketonline.entity;

import java.util.Date;

import top.yangshangyi.supermarketonline.base.BaseEntity;

public class TbSubType extends BaseEntity{

  private static final long serialVersionUID = 7472428034456736729L;
  
  private Integer stid;
  private Integer tid;
  private String subName;
  private String subInfo;
  private String isEnable;
  private Date lastupdate;
  public TbSubType() {
    
  }
  public Integer getStid() {
    return stid;
  }
  public void setStid(Integer stid) {
    this.stid = stid;
  }
  public Integer getTid() {
    return tid;
  }
  public void setTid(Integer tid) {
    this.tid = tid;
  }
  public String getSubName() {
    return subName;
  }
  public void setSubName(String subName) {
    this.subName = subName;
  }
  public String getSubInfo() {
    return subInfo;
  }
  public void setSubInfo(String subInfo) {
    this.subInfo = subInfo;
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
    return "TbSubType [stid=" + stid + ", tid=" + tid + ", subName=" + subName + ", subInfo=" + subInfo + ", isEnable=" + isEnable + ", lastupdate=" + lastupdate + "]";
  }
  public TbSubType(Integer stid, Integer tid, String subName, String subInfo, String isEnable, Date lastupdate) {
    super();
    this.stid = stid;
    this.tid = tid;
    this.subName = subName;
    this.subInfo = subInfo;
    this.isEnable = isEnable;
    this.lastupdate = lastupdate;
  }
  
}
