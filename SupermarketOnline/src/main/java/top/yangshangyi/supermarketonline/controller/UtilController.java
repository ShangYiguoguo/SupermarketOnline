package top.yangshangyi.supermarketonline.controller;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.yangshangyi.supermarketonline.entity.TbTokenInfo;
import top.yangshangyi.supermarketonline.model.ConfigModel;
import top.yangshangyi.supermarketonline.model.UtilModel;
import top.yangshangyi.supermarketonline.service.ConfigService;
import top.yangshangyi.supermarketonline.service.UtilService;
import top.yangshangyi.supermarketonline.utils.ImageCode;
import top.yangshangyi.supermarketonline.utils.JsonMessage;

/**
 * -工具类控制器
 *
 * @author DarkKnight
 *
 */
@RestController
@RequestMapping("/util")
public class UtilController {

  @Autowired
  private UtilService utilService;
  @Autowired
  private ConfigService configService;

  @RequestMapping("/validate.jpg")
  public void imageCode(UtilModel model, HttpServletResponse response) throws Exception {
    // http://127.0.0.1:14000/util/validate.jpg?token=5bc8c8a6-63c7-421e-905b-a89a9fd1bb63
    TbTokenInfo tokenInfo = model.makeTbTokenInfo();
    ImageIO.write(ImageCode.makeImage(utilService.imageCode(tokenInfo)), "jpeg", response.getOutputStream());
  }

  @RequestMapping("/queryWebConfig")
  public JsonMessage queryWebConfig(ConfigModel model) throws Exception {
    return configService.queryWebConfig(model);
  }
}
