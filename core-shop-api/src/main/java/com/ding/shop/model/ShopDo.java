package com.ding.shop.model;

public class ShopDo {
    // 店铺id
    private String sId;

    // 掌柜id
    private String uId;

    // 店铺名
    private String sName;

    // 店铺等级
    private Integer sRate;

    // 用户满意度
    private String satisfy;

    /**
     * 返回店铺id
     * @return 店铺id
     */
    public String getSId() {
        return sId;
    }

    /**
     * 设置店铺id
     */
    public void setSId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    /**
     * 返回掌柜id
     * @return 掌柜id
     */
    public String getUId() {
        return uId;
    }

    /**
     * 设置掌柜id
     */
    public void setUId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 返回店铺名
     * @return 店铺名
     */
    public String getSName() {
        return sName;
    }

    /**
     * 设置店铺名
     */
    public void setSName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    /**
     * 返回店铺等级
     * @return 店铺等级
     */
    public Integer getSRate() {
        return sRate;
    }

    /**
     * 设置店铺等级
     */
    public void setSRate(Integer sRate) {
        this.sRate = sRate;
    }

    /**
     * 返回用户满意度
     * @return 用户满意度
     */
    public String getSatisfy() {
        return satisfy;
    }

    /**
     * 设置用户满意度
     */
    public void setSatisfy(String satisfy) {
        this.satisfy = satisfy == null ? null : satisfy.trim();
    }
}