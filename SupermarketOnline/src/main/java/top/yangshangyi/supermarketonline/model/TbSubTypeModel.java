package top.yangshangyi.supermarketonline.model;

import top.yangshangyi.supermarketonline.base.BasePageModel;
import top.yangshangyi.supermarketonline.entity.TbSubType;

/**
 * TbSubType模型层
 * 
 * @author DarkKnight
 *
 */
public class TbSubTypeModel extends BasePageModel {

  private static final long serialVersionUID = -2295604230705488333L;

  private TbSubType subType = new TbSubType();

  public TbSubTypeModel() {
  }

  public TbSubType getSubType() {
    return subType;
  }

  public void setSubType(TbSubType subType) {
    this.subType = subType;
  }
  
}