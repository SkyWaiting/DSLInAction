package ch02.order;

/**
 * Created with IntelliJ IDEA.
 * User: guorui
 * Date: 14-1-12
 * Time: 下午12:06
 */
public class StandardOrderValuer implements OrderValuer {
    @Override
    public int valueAs(int qty, int unitPrice) {
        return unitPrice * qty;
    }
}
