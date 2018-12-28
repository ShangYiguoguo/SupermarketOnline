package top.yangshangyi.supermarketonline.service;

import top.yangshangyi.supermarketonline.model.LogsModel;
import top.yangshangyi.supermarketonline.utils.JsonMessage;

/**
 * Logs的Service层
 * @author 山一哥哥
 *
 */
public interface LogsService {

  /**
   * -查询TbLos的信息
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage queryAll(LogsModel model) throws Exception;

}
