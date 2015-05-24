package mystock

import grails.rest.Resource

@Resource
class Stock {

    static hasOne = [notice: Notice]
    static hasMany = [tag: Tag]
    
    static constraints = {
    }
    
    String stockCode;
    String stockName;


    double givePrice;//得票价格
    double aimPrice;//预期目标价格
    double currentPrice;//当前价格
    double changePercentage;//变化（涨、跌）幅度
    int holdDays;//持票天数
    
    boolean isLong;//是否长线
    Date giveDate;//给票日期
    
    String comments;//备注

    String getStockCode() {
        return stockCode
    }

    void setStockCode(String stockCode) {
        this.stockCode = stockCode
    }

    public String getStockName() {
        return stockName
    }

    public void setStockName(String stockName) {
        this.stockName = stockName
    }

    double getGivePrice() {
        return givePrice
    }

    void setGivePrice(double givePrice) {
        this.givePrice = givePrice
    }

    double getAimPrice() {
        return aimPrice
    }

    void setAimPrice(double aimPrice) {
        this.aimPrice = aimPrice
    }

    double getCurrentPrice() {
        return currentPrice
    }

    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice
    }

    double getChangePercentage() {
        return changePercentage
    }

    void setChangePercentage(double changePercentage) {
        this.changePercentage = changePercentage
    }

    int getHoldDays() {
        return holdDays
    }

    void setHoldDays(int holdDays) {
        this.holdDays = holdDays
    }

    boolean getIsLong() {
        return isLong
    }

    void setIsLong(boolean isLong) {
        this.isLong = isLong
    }

    Date getGiveDate() {
        return giveDate
    }

    void setGiveDate(Date giveDate) {
        this.giveDate = giveDate
    }

    String getComments() {
        return comments
    }

    void setComments(String comments) {
        this.comments = comments
    }
}
