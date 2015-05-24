package mystock

class Notice {
    static belongsTo = [stock: Stock]
    
    static constraints = {

    }
    
    double priceUpTo;//价格上涨到
    double priceDownTo;//价格下降到

}
