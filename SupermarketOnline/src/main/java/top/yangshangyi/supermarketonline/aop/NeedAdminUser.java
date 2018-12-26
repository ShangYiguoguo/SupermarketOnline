package top.yangshangyi.supermarketonline.aop;

import top.yangshangyi.supermarketonline.entity.TbAdminUser;

/**
 * -需要登录的接口定义
 * @author 山一哥哥
 *
 */
public interface NeedAdminUser {
  /**
   * 
   * -设置登录用户
   * @param user
   */
  public void setUser(TbAdminUser user);
  
  /**
   * -获取登录用户信息
   * @return
   */
  public TbAdminUser getUser();
}
