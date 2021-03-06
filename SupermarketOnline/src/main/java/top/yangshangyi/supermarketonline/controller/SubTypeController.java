package top.yangshangyi.supermarketonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.yangshangyi.supermarketonline.base.BaseAdminUserController;
import top.yangshangyi.supermarketonline.model.TbSubTypeModel;
import top.yangshangyi.supermarketonline.service.SubTypeService;
import top.yangshangyi.supermarketonline.utils.JsonMessage;

/**
 * TbSubType控制器
 * 
 * @author DarkKnight
 *
 */
@RestController
@RequestMapping("/subtype")
public class SubTypeController extends BaseAdminUserController{

  @Autowired
  private SubTypeService subTypeService;

  @RequestMapping("/disable")
  public JsonMessage disable(TbSubTypeModel model) throws Exception {
    return subTypeService.disable(model);
  }

  @RequestMapping("/enable")
  public JsonMessage enable(TbSubTypeModel model) throws Exception {
    return subTypeService.enable(model);
  }

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbSubTypeModel model) throws Exception {
    return subTypeService.queryAll(model);
  }

  @RequestMapping("/add")
  public JsonMessage add(TbSubTypeModel model) throws Exception {
    return subTypeService.add(model);
  }

  @RequestMapping("/update")
  public JsonMessage update(TbSubTypeModel model) throws Exception {
    return subTypeService.update(model);
  }

}