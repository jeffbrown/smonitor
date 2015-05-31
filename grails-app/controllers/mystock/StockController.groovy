package mystock

class StockController {

    def index() {
    }

    def create(){
        return ['stock':new Stock(), 'notice':new Notice()]
    }
    def show(){}
    def edit(){}
}
