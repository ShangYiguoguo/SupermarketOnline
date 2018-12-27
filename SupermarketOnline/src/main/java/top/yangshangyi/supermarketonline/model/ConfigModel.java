package top.yangshangyi.supermarketonline.model;

import top.yangshangyi.supermarketonline.base.BaseModel;
import top.yangshangyi.supermarketonline.entity.TbConfig;

/**
 * TbConfig的model
 * @author 山一哥哥
 *
 */
public class ConfigModel extends BaseModel{
  private static final long serialVersionUID = 1854984455014818192L;

  private TbConfig config =new TbConfig();
  public ConfigModel() {
  }
  public TbConfig getConfig() {
    return config;
  }
  public void setConfig(TbConfig config) {
    this.config = config;
  }
  
  
}
