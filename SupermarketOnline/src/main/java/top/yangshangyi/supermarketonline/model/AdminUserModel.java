package top.yangshangyi.supermarketonline.model;

import top.yangshangyi.supermarketonline.base.BaseModel;
import top.yangshangyi.supermarketonline.entity.TbAdminUser;

/**
 * - 用户管理model
 * 
 * @author 山一哥哥
 *
 */
public class AdminUserModel extends BaseModel {
  private static final long serialVersionUID = 5555593156077730527L;
  private TbAdminUser user = new TbAdminUser();
  public AdminUserModel() {
  }
  public TbAdminUser getUser() {
    return user;
  }
  public void setUser(TbAdminUser user) {
    this.user = user;
  }
  
}
