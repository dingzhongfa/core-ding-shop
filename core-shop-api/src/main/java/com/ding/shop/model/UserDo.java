package com.ding.shop.model;

public class UserDo {
    // 用户id
    private String uId;

    // 用户姓名
    private String uName;

    // 用户密码
    private String password;

    // 电话
    private String phone;

    // 邮箱
    private String email;

    // 余额
    private Integer balance;

    // 用户等级
    private String uRate;

    // 0-登录，1-未登录
    private Byte isOn;

    /**
     * 返回用户id
     * @return 用户id
     */
    public String getUId() {
        return uId;
    }

    /**
     * 设置用户id
     */
    public void setUId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 返回用户姓名
     * @return 用户姓名
     */
    public String getUName() {
        return uName;
    }

    /**
     * 设置用户姓名
     */
    public void setUName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * 返回用户密码
     * @return 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 返回电话
     * @return 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 返回邮箱
     * @return 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 返回余额
     * @return 余额
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * 设置余额
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * 返回用户等级
     * @return 用户等级
     */
    public String getURate() {
        return uRate;
    }

    /**
     * 设置用户等级
     */
    public void setURate(String uRate) {
        this.uRate = uRate == null ? null : uRate.trim();
    }

    /**
     * 返回0-登录，1-未登录
     * @return 0-登录，1-未登录
     */
    public Byte getIsOn() {
        return isOn;
    }

    /**
     * 设置0-登录，1-未登录
     */
    public void setIsOn(Byte isOn) {
        this.isOn = isOn;
    }
}