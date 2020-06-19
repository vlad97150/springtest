import newpackage.A;
import newpackage.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjection {
    static class Singleton {
        private static Singleton singleton = new Singleton();

        private Singleton() { }

        static Singleton getSingleton() {
            return singleton;
        }
    }


    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        A a = applicationContext.getBean(A.class);
        System.out.println(a);

    }
}
