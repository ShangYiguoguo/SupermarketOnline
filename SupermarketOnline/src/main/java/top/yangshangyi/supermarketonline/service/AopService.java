package top.yangshangyi.supermarketonline.service;

import top.yangshangyi.supermarketonline.entity.TbAdminUser;
import top.yangshangyi.supermarketonline.entity.TbToken;

/**
 * -切面用的服务类
 *
 * @author DarkKnight
 *
 */
public interface AopService {

  /**
   * -创建或者更新token
   *
   * @param token 客户端传入的token
   * @return
   * @throws Exception
   */
  TbToken createOrUpdateToken(TbToken token) throws Exception;

  /**
   * -查询登录用户信息
   * 
   * @param token
   * @return
   * @throws Exception
   */
  TbAdminUser checkAdminUser(TbToken token) throws Exception;

}
