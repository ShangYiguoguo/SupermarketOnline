package top.yangshangyi.supermarketonline.model;

import top.yangshangyi.supermarketonline.base.BasePageModel;
import top.yangshangyi.supermarketonline.entity.TbLogs;

/**
 * TbLogs的model
 * @author 山一哥哥
 *
 */
public class LogsModel extends BasePageModel{
  private static final long serialVersionUID = -7730328187342648985L;
  private TbLogs tbLogs =new TbLogs();
  
  public LogsModel() {
  }

  public TbLogs getTbLogs() {
    return tbLogs;
  }

  public void setTbLogs(TbLogs tbLogs) {
    this.tbLogs = tbLogs;
  }
  
}
