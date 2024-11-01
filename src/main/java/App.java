import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        //
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getMessage());
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getMessage());

        if (cat1.equals(cat2)) {
            System.out.println("Котики одинаковые");
        } else {
            System.out.println("Котики разные");

        }
        if (bean1.equals(bean2)) {
            System.out.println("Hello World - одинаковые");
        } else {
            System.out.println("Hello World - разные");
        }
    }
}

