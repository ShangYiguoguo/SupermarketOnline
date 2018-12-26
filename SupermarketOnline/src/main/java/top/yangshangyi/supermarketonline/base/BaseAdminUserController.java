package top.yangshangyi.supermarketonline.base;

import top.yangshangyi.supermarketonline.aop.NeedAdminUser;
import top.yangshangyi.supermarketonline.entity.TbAdminUser;

public abstract class BaseAdminUserController implements NeedAdminUser{

  /**
   * -登录用户信息===========================================================
   */
  private TbAdminUser user;

  @Override
  public void setUser(TbAdminUser user) {
    this.user = user;

  }

  @Override
  public TbAdminUser getUser() {
    return user;
  }
/**
 * -登录用户信息===========================================================
 */
}
