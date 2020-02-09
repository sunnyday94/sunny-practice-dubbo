/**
 * FileName: OrderServiceApplication Author:   sunny Date:     2020/2/4 1:03 Description: 消费者启动类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.sunny.dubbo.service.OrderService;
import com.sunny.dubbo.service.impl.OrderServiceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈消费者启动类〉
 *
 * @author sunny
 * @create 2020/2/4
 * @since 1.0.0
 */
public class OrderServiceApplication {


    public static void main(String[] args) throws IOException {
        //加载配置文件
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        //从ioc容器中获取bean (orderService)
        OrderService orderService = ioc.getBean(OrderService.class);
        //调用方法
        orderService.initOrder(1);
        System.out.println("服务调用者，服务调用完成!");
        System.in.read(); //阻塞
    }
}
