package TestDemo;

import com.atguigu.spring5.User;
import com.atguigu.spring5.Book;
import org.springframework.context.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;

public class TestSpring5 {

    @Test
    public void testAdd(){
        //1.加载配置文件，bean.xml
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean.xml");
        //2.获取配置文件创建的对象
        User user=context.getBean("user1", User.class);

        //测试
        System.out.println(user);
        user.add();
        LinkedList<Integer> re = new LinkedList<>();
        re.add(1);
    }
    @Test
    public void testBook(){
        //1.加载配置文件，bean.xml
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean.xml");
        //2.获取配置文件创建的对象
        Book book=context.getBean("book", Book.class);

        //测试
        book.testBook();
    }
}
