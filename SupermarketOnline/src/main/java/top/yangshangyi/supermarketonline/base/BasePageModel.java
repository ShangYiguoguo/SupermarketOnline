package top.yangshangyi.supermarketonline.base;

import top.yangshangyi.supermarketonline.utils.PageBean;

/**
 * -带分页的model基础类
 * 
 * @author 山一哥哥
 *
 */
public abstract class BasePageModel extends BaseModel {

  private static final long serialVersionUID = 6998909548933172374L;

  private PageBean page = new PageBean();

  public BasePageModel() {
  }

  public PageBean getPage() {
    return page;
  }

  public void setPage(PageBean page) {
    this.page = page;
  }

}
