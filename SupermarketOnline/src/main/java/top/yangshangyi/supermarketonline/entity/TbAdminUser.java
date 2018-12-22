package top.yangshangyi.supermarketonline.entity;

import java.util.Date;

import top.yangshangyi.supermarketonline.base.BaseEntity;

public class TbAdminUser extends BaseEntity{
  private static final long serialVersionUID = -1673165168965076836L;
  private Integer auid;
  private String username;
  private String password;
  private String nickname;
  private String isEnable;
  private Date lastupdate;
  public TbAdminUser() {
  
  }
  public Integer getAuid() {
    return auid;
  }
  public void setAuid(Integer auid) {
    this.auid = auid;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
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
    return "TbAdminUser [auid=" + auid + ", username=" + username + ", password=" + password + ", nickname=" + nickname + ", isEnable=" + isEnable + ", lastupdate=" + lastupdate + "]";
  }
  public TbAdminUser(Integer auid, String username, String password, String nickname, String isEnable, Date lastupdate) {
    super();
    this.auid = auid;
    this.username = username;
    this.password = password;
    this.nickname = nickname;
    this.isEnable = isEnable;
    this.lastupdate = lastupdate;
  }
  
}
