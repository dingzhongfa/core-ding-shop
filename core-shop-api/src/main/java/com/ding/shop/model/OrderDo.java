package com.ding.shop.model;

import java.util.Date;

public class OrderDo {
    // 订单编号
    private String oId;

    // 店铺id
    private String sId;

    // 买家id
    private String uId;

    // 买家地址
    private String addr;

    // 0-未付款，1-进行中，2-退款中，3-交易成功
    private Integer state;

    // 订单生成日期
    private Date createDate;

    // 订单结束日期
    private Date endDate;

    /**
     * 返回订单编号
     * @return 订单编号
     */
    public String getOId() {
        return oId;
    }

    /**
     * 设置订单编号
     */
    public void setOId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

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
     * 返回买家id
     * @return 买家id
     */
    public String getUId() {
        return uId;
    }

    /**
     * 设置买家id
     */
    public void setUId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 返回买家地址
     * @return 买家地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置买家地址
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * 返回0-未付款，1-进行中，2-退款中，3-交易成功
     * @return 0-未付款，1-进行中，2-退款中，3-交易成功
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0-未付款，1-进行中，2-退款中，3-交易成功
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 返回订单生成日期
     * @return 订单生成日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置订单生成日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 返回订单结束日期
     * @return 订单结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置订单结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}