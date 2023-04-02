import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW1.getMessage());
        System.out.println(beanHW2.getMessage());

        //создание бина Cat
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getMessage());
        System.out.println(beanCat2.getMessage());

        //сравнение бинов
        System.out.println(beanHW1 == beanHW2);
        System.out.println(beanCat1 == beanCat2);
    }
}