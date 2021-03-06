package top.yangshangyi.supermarketonline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.yangshangyi.supermarketonline.aop.NeedAdminUser;
import top.yangshangyi.supermarketonline.entity.TbAdminUser;
import top.yangshangyi.supermarketonline.model.TbTypeModel;
import top.yangshangyi.supermarketonline.service.TypeService;
import top.yangshangyi.supermarketonline.utils.JsonMessage;

/**
 * 
 * @author DarkKnight
 *
 */
@RestController
@RequestMapping("/type")
public class TypeController implements NeedAdminUser {
  
  
  private static final Logger log = LoggerFactory.getLogger(TypeController.class);

  
  @Autowired
  private TypeService typeService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbTypeModel model) throws Exception {
    log.debug(String.format("用户信息:%s", user));
    return typeService.queryAll(model);
  }

  @RequestMapping("/add")
  public JsonMessage add(TbTypeModel model) throws Exception {
    return typeService.add(model);
  }

  @RequestMapping("/queryByKey")
  public JsonMessage queryByKey(TbTypeModel model) throws Exception {
    return typeService.queryByKey(model);
  }

  @RequestMapping("/delete")
  public JsonMessage delete(TbTypeModel model) throws Exception {
    return typeService.delete(model);
  }

  @RequestMapping("/undelete")
  public JsonMessage undelete(TbTypeModel model) throws Exception {
    return typeService.undelete(model);
  }

  @RequestMapping("/update")
  public JsonMessage update(TbTypeModel model) throws Exception {
    return typeService.update(model);
  }

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