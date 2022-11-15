package TestDemo;

import com.atguigu.spring5.User;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;

public class TestOutBean {
    @Test
    public void testAdd(){
        //1.加载配置文件，bean.xml
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件创建的对象
        UserService userService=context.getBean("userService", UserService.class);

        //测试
        userService.add();
    }
}
