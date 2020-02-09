/**
 * FileName: UserServiceApplication Author:   sunny Date:     2020/2/2 19:31 Description: 启动类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈启动类〉
 *
 * @author sunny
 * @create 2020/2/2
 * @since 1.0.0
 */
public class UserServiceApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.out.println("服务提供者，服务注册完成!");
        System.in.read(); //阻塞
    }
}
