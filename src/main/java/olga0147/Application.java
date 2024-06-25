package olga0147;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication//(exclude = { DataSourceAutoConfiguration.class })
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        displayAllBeans(applicationContext);
    }

    public static void displayAllBeans(ApplicationContext applicationContext) {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("-----------------------------------------------");
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }
}