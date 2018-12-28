package top.yangshangyi.supermarketonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.yangshangyi.supermarketonline.base.BaseAdminUserController;
import top.yangshangyi.supermarketonline.model.LogsModel;
import top.yangshangyi.supermarketonline.service.LogsService;
import top.yangshangyi.supermarketonline.utils.JsonMessage;

/**
 * TbLogs控制器
 * @author 山一哥哥
 *
 */

@RestController
@RequestMapping("/logs")
public class LogsController extends BaseAdminUserController{
  @Autowired
  private LogsService logsService;
  
  @RequestMapping("/queryAll")
  public JsonMessage queryAll(LogsModel model)throws Exception{
    return logsService.queryAll(model);
  }
}
