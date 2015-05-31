package mystock

import grails.rest.Resource

@Resource
class Stock {

    static hasMany = [tag: Tag]
    static hasOne = [notice: Notice]
    
    static constraints = {
        notice(nullable: true)
        tag(nullable: true, display: false)

        stockCode();
        stockName()
        givePrice();
        aimPrice();
        currentPrice();
        holdDays();
        isLong();
        giveDate();
        comments(nullable: true);
    }

    Notice notice;
    String stockName;
    String stockCode;

    double givePrice;//得票价格
    double aimPrice;//预期目标价格
    double currentPrice;//当前价格
    double changePercentage;//变化（涨、跌）幅度
    int holdDays;//持票天数
    
    boolean isLong;//是否长线
    Date giveDate;//给票日期
    
    String comments;//备注

}
