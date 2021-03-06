package top.yangshangyi.supermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import top.yangshangyi.supermarketonline.dao.TbLogsDAO;
import top.yangshangyi.supermarketonline.dao.TbTypeDAO;
import top.yangshangyi.supermarketonline.entity.TbLogs;
import top.yangshangyi.supermarketonline.entity.TbType;
import top.yangshangyi.supermarketonline.model.TbTypeModel;
import top.yangshangyi.supermarketonline.service.TypeService;
import top.yangshangyi.supermarketonline.utils.JsonMessage;
import top.yangshangyi.supermarketonline.utils.MyUtils;
import top.yangshangyi.supermarketonline.utils.PageBean;

/**
 * 
 * @author DarkKnight
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TypeServiceImpl implements TypeService {
  @Autowired
  private TbTypeDAO tbTypeDAO;

  @Autowired
  private TbLogsDAO tbLogsDAO;

  @Override
  public JsonMessage queryAll(TbTypeModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbType> list = (Page<TbType>) tbTypeDAO.queryAll();
    page.setPageInfo(list);
    message.getDatas().put("page", page);
    message.getDatas().put("list", list);
    return message;
  }

  @Override
  public JsonMessage add(TbTypeModel model) throws Exception {
    TbType tbType = model.getTbType();
    if (MyUtils.isEmpty(tbType.getTypeName())) {
      return JsonMessage.getFail("分类名称必须填写");
    }
    if (MyUtils.isEmpty(tbType.getTypeInfo())) {
      return JsonMessage.getFail("分类描述必须填写");
    }
    TbType check = tbTypeDAO.queryByTypeName(tbType);
    if (check != null) {
      return JsonMessage.getFail("分类名称已经存在");
    }
    int result = tbTypeDAO.add(model.getTbType());
    // 添加日志信息
    TbLogs logs = new TbLogs();
    // 操作员
    logs.setOperator(model.getTbAdminUser().getAuid().toString());
    // 类型
    logs.setLogtype("typemanage");
    // 信息
    logs.setLog(String.format("添加了:%s", model.getTbType()));
    tbLogsDAO.add(logs);
    return result == 1 ? JsonMessage.getSuccess("添加成功") : JsonMessage.getFail("添加失败");
  }

  @Override
  public JsonMessage queryByKey(TbTypeModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.put("type", tbTypeDAO.queryByKey(model.getTbType()));
    return message;
  }

  @Override
  public JsonMessage delete(TbTypeModel model) throws Exception {
    model.getTbType().setIsEnable("n");
    int result = tbTypeDAO.delete(model.getTbType());
    // 添加日志信息
    TbLogs logs = new TbLogs();
    logs.setOperator(model.getTbAdminUser().getAuid().toString());
    logs.setLogtype("typemanage");
    logs.setLog(String.format("禁用了:%s", model.getTbType()));
    tbLogsDAO.add(logs);
    return result == 1 ? JsonMessage.getSuccess("禁用成功！") : JsonMessage.getFail("禁用失败！");
  }

  @Override
  public JsonMessage undelete(TbTypeModel model) throws Exception {
    model.getTbType().setIsEnable("y");
    int result = tbTypeDAO.delete(model.getTbType());
    // 添加日志信息
    TbLogs logs = new TbLogs();
    logs.setOperator(model.getTbAdminUser().getAuid().toString());
    logs.setLogtype("typemanage");
    logs.setLog(String.format("启用了:%s", model.getTbType()));
    tbLogsDAO.add(logs);
    return result == 1 ? JsonMessage.getSuccess("启用成功！") : JsonMessage.getFail("启用失败！");
  }

  @Override
  public JsonMessage update(TbTypeModel model) throws Exception {
    int result = tbTypeDAO.update(model.getTbType());
    return result == 1 ? JsonMessage.getSuccess("修改成功！") : JsonMessage.getFail("修改失败！");
  }

}