/**
 * FileName: UserServiceImpl Author:   sunny Date:     2020/1/31 0:08 Description: UserService实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.dubbo.serviceimpl;

import com.sunny.dubbo.facade.UserService;
import com.sunny.dubbo.facade.dto.UserAddress;

import java.util.Arrays;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserService实现类〉
 *
 * @author sunny
 * @create 2020/1/31
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService {


    @Override
    public List<UserAddress> getUserAddressListByUserId(Integer userId) {
        System.out.println("调用UserServiceImpl的getUserAddressListByUserId");

        UserAddress address1 = new UserAddress(1, "湖北省随州市,", 1, "sunny", "15272877320", "N");

        UserAddress address2 = new UserAddress(2, "上海市浦东新区", 2,"王晴天", "15021668353","Y");

        return Arrays.asList(address1,address2);
    }
}
