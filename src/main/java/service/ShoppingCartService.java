package main.java.service;

import main.java.dao.ShoppingCartDao;
import main.java.entity.ShoppingCart;

public class ShoppingCartService {
    private ShoppingCartDao shoppingCartDao = new ShoppingCartDao();

    public ShoppingCart getCartContext(String userId) {
        return shoppingCartDao.findCartByUserId(userId);
    }
}
