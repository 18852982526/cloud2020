package com.tutu.springcloud.dao;

import com.tutu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author tutu 2020/5/24 15:24
 */
@Mapper
public interface OrderDao {

    /**
     * create order
     *
     * @param order
     */
    void create(Order order);

    /**
     * update order status
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
