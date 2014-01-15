package ch02.order;

/**
 * Created with IntelliJ IDEA.
 * User: guorui
 * Date: 14-1-12
 * Time: 上午11:53
 */
public interface OrderValuer {
    int valueAs(int qty, int unitPrice);
}
