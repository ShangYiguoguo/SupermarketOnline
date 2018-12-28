package top.yangshangyi.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.yangshangyi.supermarketonline.dao.TbConfigDAO;
import top.yangshangyi.supermarketonline.dao.TbLogsDAO;
import top.yangshangyi.supermarketonline.entity.TbLogs;
import top.yangshangyi.supermarketonline.model.ConfigModel;
import top.yangshangyi.supermarketonline.service.ConfigService;
import top.yangshangyi.supermarketonline.utils.JsonMessage;

/**
 * ConfigService实现类
 * 
 * @author DarkKnight
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ConfigServiceImpl implements ConfigService {
  @Autowired
  private TbConfigDAO tbConfigDAO;

  @Autowired
  private TbLogsDAO tbLogsDAO;
  @Override
  public JsonMessage queryWebConfig(ConfigModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.put("title", tbConfigDAO.queryTitle());
    return message;
  }

  @Override
  public JsonMessage queryConfig(ConfigModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.put("tokenTimeout", tbConfigDAO.queryTokenTimeout());
    message.put("title", tbConfigDAO.queryTitle());
    return message;
  }

  @Override
  public JsonMessage updateTokenTimeout(ConfigModel model) throws Exception {
    int result = tbConfigDAO.updateTokenTimeout(model.getConfig());
    TbLogs logs = new TbLogs();
    logs.setOperator(model.getTbAdminUser().getAuid().toString());
    logs.setLogtype("subtypemanage");
    logs.setLog(String.format("修改了:%s", model.getConfig()));
    tbLogsDAO.add(logs);
    return result == 1 ? JsonMessage.getSuccess("修改成功") : JsonMessage.getFail("修改失败");
  }

  @Override
  public JsonMessage updateTitle(ConfigModel model) throws Exception {
    int result = tbConfigDAO.updateTitle(model.getConfig());
    TbLogs logs = new TbLogs();
    logs.setOperator(model.getTbAdminUser().getAuid().toString());
    logs.setLogtype("subtypemanage");
    logs.setLog(String.format("修改了:%s", model.getConfig()));
    tbLogsDAO.add(logs);
    return result == 1 ? JsonMessage.getSuccess("修改成功") : JsonMessage.getFail("修改失败");
  }

}