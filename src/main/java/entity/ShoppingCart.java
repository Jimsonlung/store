package main.java.entity;

/**
 * 购物车实体类
 *
 * by JimsonLung
 * 2018-11-1
 */
public class ShoppingCart {
    private User user;  //用户
    private Goods goods;    //商品
    private double totalPrice;  //合计价格

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
