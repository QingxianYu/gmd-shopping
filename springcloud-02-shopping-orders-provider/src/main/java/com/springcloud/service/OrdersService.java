package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * 订单模块的模型层，用于定义订单模块的方法
 * 
 * @author YuBaby
 *
 */
public interface OrdersService {
	/**
	 *订单查询
	 * 
	 * @param orders 查询条件
	 * @return成功返回com.github.pagehelper.PageInfo<Orders>类型的实例
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders, Integer pageNumber);

	/**
	 * 修改订单状态̬
	 * 
	 * @param orders 查询条件
	 * @return 成功返回大于0的整数，否则返回小于等于0的整数
	 */
	public abstract Integer updateorderStatus(Orders orders);
	
	/**
	 *  查询指定日期范围内的销售额
	 * @param orders 查询条件
	 * @return 成功返回java.util.List类型的实例͵否则返回null
	 */
	public abstract List<Orders> selectGroup(Orders orders);

}
