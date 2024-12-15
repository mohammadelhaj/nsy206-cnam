package me.haj.shopapi.service;

import me.haj.shopapi.entity.Cart;
import me.haj.shopapi.entity.ProductInOrder;
import me.haj.shopapi.entity.User;

import java.util.Collection;

public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
