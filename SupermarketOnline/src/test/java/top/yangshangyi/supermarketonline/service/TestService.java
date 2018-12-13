package top.yangshangyi.supermarketonline.service;

import top.yangshangyi.supermarketonline.utils.JsonMessage;
import top.yangshangyi.supermarketonline.utils.PageBean;

/**
 * - 测试服务
 *
 * @author DarkKnight
 *
 */
public interface TestService {

  /**
   * -分页查询token
   *
   * @param page
   * @return
   * @throws Exception
   */
  JsonMessage queryTokens(PageBean page) throws Exception;

}
