package ch02.order;

/**
 * Created with IntelliJ IDEA.
 * User: guorui
 * Date: 14-1-12
 * Time: 下午12:08
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order.Builder()
                .buy(100,"IBM")
                .atLimitPrice(300)
                .allOrNone()
                .valueAs(new StandardOrderValuer())
                .build();
        System.out.println(order);
    }
}
