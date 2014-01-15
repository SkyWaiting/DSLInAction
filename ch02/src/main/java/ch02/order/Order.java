package ch02.order;

/**
 * Created with IntelliJ IDEA.
 * User: guorui
 * Date: 14-1-12
 * Time: 上午11:44
 */
public class Order {
    static class Builder{
        private String security;
        private int quantity;
        private int limitPrice;
        private boolean allOrNone;
        private int value;
        private String boughtOrSold;

        public Builder(){}

        public Builder buy(int quantity, String security){
            this.boughtOrSold = "Bought";
            this.quantity = quantity;
            this.security = security;
            return this;
        }

        public Builder sell(int quantity, String security){
            this.boughtOrSold = "Sold";
            this.quantity = quantity;
            this.security = security;
            return this;
        }

        public Builder atLimitPrice(int p){
            this.limitPrice = p;
            return this;
        }

        public Builder allOrNone(){
            this.allOrNone = true;
            return this;
        }

        public Builder valueAs(OrderValuer ov){
            this.value = ov.valueAs(quantity, limitPrice);
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }

    private final String security;
    private final int quantity;
    private final int limitPrice;
    private final boolean allOrNone;
    private int value;
    private final String boughtOrSold;

    public Order(Builder builder){
        security = builder.security;
        quantity = builder.quantity;
        limitPrice = builder.limitPrice;
        allOrNone = builder.allOrNone;
        value = builder.value;
        boughtOrSold = builder.boughtOrSold;
    }

    public String getSecurity() {
        return security;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getLimitPrice() {
        return limitPrice;
    }

    public boolean isAllOrNone() {
        return allOrNone;
    }

    public int getValue() {
        return value;
    }

    public String getBoughtOrSold() {
        return boughtOrSold;
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p/>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return new StringBuffer()
                .append(boughtOrSold)
                .append(" " + quantity + " shares of ")
                .append(security)
                .append(" with limit price ")
                .append(limitPrice)
                .append(" ")
                .append(allOrNone == true ? "ALL OR NONE" : "")
                .toString();
    }
}
