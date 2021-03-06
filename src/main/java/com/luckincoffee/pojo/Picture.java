package com.luckincoffee.pojo;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:41
 * @Description: 图片实体类
 */
public class Picture {
    public String SHOW="show";
    public String DETAIL="detail";
    /**
     * 图片ID
     */
    private int id;
    /**
     * 图片对应的商品ID
     */
    private int productId;
    /**
     * 图片类型："show":展示图片;"detail":细节图
     */
    private String type;
    /**
     * 图片所在的地址
     */
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
