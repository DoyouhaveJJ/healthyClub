package com.sebookstore.demo.Service;

import com.sebookstore.demo.Entity.UserOrder;

import java.util.List;

public interface OrderService
{
    UserOrder findById(long Id);
    List<UserOrder> findByUserId(long userId);
    List<UserOrder> findAll();
    List<UserOrder> findByHealthyitemId(long healthyitemId);
    UserOrder save(UserOrder userOrder);
}
