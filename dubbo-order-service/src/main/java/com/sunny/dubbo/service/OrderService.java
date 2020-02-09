/**
 * FileName: OrderService Author:   sunny Date:     2020/1/30 23:59 Description: OrderService
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.dubbo.service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈OrderService〉
 *
 * @author sunny
 * @create 2020/1/30
 * @since 1.0.0
 */
public interface OrderService {
    
    /* *
     * @Author sunny
     * @Description  初始化订单信息
     * @Date 0:12 2020/1/31
     * @Param [userId]
     * @return void
     **/
    void initOrder(Integer userId);
}
