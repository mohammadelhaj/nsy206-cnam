package me.haj.shopapi.service;

import me.haj.shopapi.entity.ProductInOrder;
import me.haj.shopapi.entity.User;

public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
