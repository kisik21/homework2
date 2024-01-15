package lesson36;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        SpringHelloWorld springHelloWorld=  (SpringHelloWorld) context.getBean("springHelloWorld");
        springHelloWorld.getHelloMessage();
    }
}
