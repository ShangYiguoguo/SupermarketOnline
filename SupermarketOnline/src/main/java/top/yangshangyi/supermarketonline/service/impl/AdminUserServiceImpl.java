package top.yangshangyi.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.yangshangyi.supermarketonline.dao.TbAdminUserDAO;
import top.yangshangyi.supermarketonline.entity.TbAdminUser;
import top.yangshangyi.supermarketonline.entity.TbTokenInfo;
import top.yangshangyi.supermarketonline.model.AdminUserModel;
import top.yangshangyi.supermarketonline.service.AdminUserService;
import top.yangshangyi.supermarketonline.utils.JsonMessage;
import top.yangshangyi.supermarketonline.utils.MyUtils;

/**
 * -管理用户服务实现
 * 
 * @author 山一哥哥
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AdminUserServiceImpl implements AdminUserService {
  @Autowired
  private TbAdminUserDAO tbAdminUserDAO;

  @Override
  public JsonMessage login(AdminUserModel model) throws Exception {
    TbAdminUser user = model.getUser();
    if (MyUtils.isEmpty(user.getUsername())) {
      return JsonMessage.getFail("用户名必须填写");
    }
    if (MyUtils.isEmpty(user.getPassword())) {
      return JsonMessage.getFail("密码必须填写");
    }
    TbAdminUser suser = tbAdminUserDAO.queryByUsername(user);
    if (suser == null) {
      return JsonMessage.getFail("用户名不存在");
    }
    if (!"y".equalsIgnoreCase(suser.getIsEnable())) {
      return JsonMessage.getFail("用户已经冻结");
    }
    if (!suser.getPassword().equalsIgnoreCase(user.getPassword())) {
      return JsonMessage.getFail("密码错误");
    }
    // 登录成功需要添加tokeninfo
    TbTokenInfo tokenInfo = model.makeTbTokenInfo();
    tokenInfo.setInfo(suser.getAuid() + "");
    // 检查是否存在token中是否存在
    TbAdminUser tuser = tbAdminUserDAO.queryTokenUser(tokenInfo);
    if (tuser != null) {
      // 存在就删除
      tbAdminUserDAO.deleteTokenUser(tokenInfo);
    }
    tbAdminUserDAO.saveUserToToken(tokenInfo);
    return JsonMessage.getSuccess("登录成功");
  }

  @Override
  public JsonMessage getUserInfo(AdminUserModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    TbAdminUser user = tbAdminUserDAO.queryTokenUser(model.makeTbTokenInfo());
    if (user != null) {
      user.setAuid(null);
      user.setPassword(null);
    }
    message.put("user", user);
    return message;
  }

  @Override
  public JsonMessage logout(AdminUserModel model) throws Exception {
    tbAdminUserDAO.deleteTokenUser(model.makeTbTokenInfo());
    return JsonMessage.getSuccess("登出成功");
  }
}
