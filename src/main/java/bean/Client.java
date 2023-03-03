package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
        Employee emp2 = (Employee) context.getBean("emp2");

        System.out.println("Employee 1: " + emp1);
        System.out.println("Employee 2: " + emp2);
    }
}
