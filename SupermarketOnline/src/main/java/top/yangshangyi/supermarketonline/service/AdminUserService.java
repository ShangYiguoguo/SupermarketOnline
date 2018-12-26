package top.yangshangyi.supermarketonline.service;

import top.yangshangyi.supermarketonline.model.AdminUserModel;
import top.yangshangyi.supermarketonline.utils.JsonMessage;

/**
 * -管理用户服务
 * 
 * @author 山一哥哥
 *
 */
public interface AdminUserService {
  /**
   * -用户登录
   * 
   * @param model 页面数据
   * @return 用户登录结果
   * @throws Exception 处理发生异常
   */
  JsonMessage login(AdminUserModel model) throws Exception;

  /**
   * -用户登出
   * 
   * @param model 页面数据
   * @return 用户登录结果
   * @throws Exception 处理发生异常
   */
  JsonMessage logout(AdminUserModel model) throws Exception;

  /**
   * -查询当前登录用户信息
   * 
   * @param model 页面数据
   * @return 用户登录结果
   * @throws Exception 处理发生异常
   */
  JsonMessage getUserInfo(AdminUserModel model) throws Exception;

}
