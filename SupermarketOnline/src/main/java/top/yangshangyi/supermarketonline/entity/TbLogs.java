package top.yangshangyi.supermarketonline.entity;

import java.util.Date;

import top.yangshangyi.supermarketonline.base.BaseEntity;

public class TbLogs extends BaseEntity {
  private static final long serialVersionUID = 6664528688940813017L;
  private Integer lid;
  private String operator;
  private String log;
  private String logtype;
  private Date lastupdate;

  public TbLogs() {

  }

  public Integer getLid() {
    return lid;
  }

  public void setLid(Integer lid) {
    this.lid = lid;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public String getLog() {
    return log;
  }

  public void setLog(String log) {
    this.log = log;
  }

  public String getLogtype() {
    return logtype;
  }

  public void setLogtype(String logtype) {
    this.logtype = logtype;
  }

  public Date getLastupdate() {
    return lastupdate;
  }

  public void setLastupdate(Date lastupdate) {
    this.lastupdate = lastupdate;
  }

  @Override
  public String toString() {
    return "TbLogs [lid=" + lid + ", operator=" + operator + ", log=" + log + ", logtype=" + logtype + ", lastupdate=" + lastupdate + "]";
  }

  public TbLogs(Integer lid, String operator, String log, String logtype, Date lastupdate) {
    super();
    this.lid = lid;
    this.operator = operator;
    this.log = log;
    this.logtype = logtype;
    this.lastupdate = lastupdate;
  }

}
