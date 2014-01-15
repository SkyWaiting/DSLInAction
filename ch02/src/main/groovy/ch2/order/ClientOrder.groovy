package ch2.order

/**
 * Created with IntelliJ IDEA.
 * User: guorui
 * Date: 14-1-12
 * Time: 下午12:32
 *
 */
class Order {
    def security
    def quantity
    def limitPrice
    def allOrNone
    def value
    def bs

    def buy(su, closure){
        bs = "Bought";
        buy_sell(su, closure)
    }

    def sell(su, closure){
        bs = "Sold";
        buy_sell(su, closuew)
    }
    private buy_sell(su, closuer){
        security = su[0]
        quantity = su[1]
        closure()
    }

    def getTo(){
        this
    }

    def methodMissing(String name, args){
        order.metaClass.getMetaProperty(name).setProperty(order, args);
    }

    def getNewOrder(){
        order = new Order()
    }

    def valueAs(closure) {
        order.value = closure(order.quantity, order.limitPrice[0])
    }

    Integer.metaClass.getShares = { -> delegate }
    Integer.metaClass.of = {instrument -> [instrument, delegate] }
}
