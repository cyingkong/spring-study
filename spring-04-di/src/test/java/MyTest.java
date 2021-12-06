import com.ma.pojo.Student;
import com.ma.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /*
        Student {
            name='甘雨',
            address=Address{address='南京'},
            books=[红楼梦, 西游记, 水浒传, 三国演义],
            hobbys=[听歌, 敲代码, 看电影],
            card={
                身份证=34222457382390490753,
                银行卡=385442342423535
            },
            games=[LOL, 原神],
            wife='null',
            info={
                学号=1220045117,
                性别=男,
                password=123456,
                username=root
            }
        }
        */
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
}
