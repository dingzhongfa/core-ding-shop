package com.ding.shop.model;

public class GoodDo {
    // 商品Id
    private String gId;

    // 商品名
    private String gName;

    // 店铺Id
    private String sId;

    // 价格
    private Integer price;

    // 品类
    private String category;

    // 销售量
    private Integer saleSvol;

    // 库存
    private Integer reserve;

    // 描述
    private String desc;

    /**
     * 返回商品Id
     * @return 商品Id
     */
    public String getGId() {
        return gId;
    }

    /**
     * 设置商品Id
     */
    public void setGId(String gId) {
        this.gId = gId == null ? null : gId.trim();
    }

    /**
     * 返回商品名
     * @return 商品名
     */
    public String getGName() {
        return gName;
    }

    /**
     * 设置商品名
     */
    public void setGName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    /**
     * 返回店铺Id
     * @return 店铺Id
     */
    public String getSId() {
        return sId;
    }

    /**
     * 设置店铺Id
     */
    public void setSId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    /**
     * 返回价格
     * @return 价格
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置价格
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 返回品类
     * @return 品类
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置品类
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 返回销售量
     * @return 销售量
     */
    public Integer getSaleSvol() {
        return saleSvol;
    }

    /**
     * 设置销售量
     */
    public void setSaleSvol(Integer saleSvol) {
        this.saleSvol = saleSvol;
    }

    /**
     * 返回库存
     * @return 库存
     */
    public Integer getReserve() {
        return reserve;
    }

    /**
     * 设置库存
     */
    public void setReserve(Integer reserve) {
        this.reserve = reserve;
    }

    /**
     * 返回描述
     * @return 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置描述
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}