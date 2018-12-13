package top.yangshangyi.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.yangshangyi.supermarketonline.config.MyConfig;
import top.yangshangyi.supermarketonline.converter.DateConverter;
import top.yangshangyi.supermarketonline.dao.UtilsDAO;
import top.yangshangyi.supermarketonline.service.IndexService;
import top.yangshangyi.supermarketonline.utils.JsonMessage;

/**
 *
 * @author DarkKnight
 *
 */
@Service
public class IndexServiceImpl implements IndexService {
  @Autowired
  private MyConfig myConfig;
  @Autowired
  private UtilsDAO utilsDAO;

  @Override
  public JsonMessage index() throws Exception {
    JsonMessage message = JsonMessage.getSuccess(String.format("欢迎使用%s，%s", myConfig.appName, DateConverter.SDF_LONG.format(utilsDAO.queryTime())));
    return message;
  }

}
