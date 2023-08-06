import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorldBbeanOne  =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld helloWorldBeanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catOne = (Cat) applicationContext.getBean("cat");

        Cat catTwo = (Cat) applicationContext.getBean("cat");

        System.out.println("Переменные helloWorldbean и helloWorldbeanTwo ссылаются на один объект? " +
                (helloWorldBbeanOne  == helloWorldBeanTwo));

        System.out.println("Переменные catOne и catTwo ссылаются на один объект? " +
                (catOne == catTwo));
    }
}