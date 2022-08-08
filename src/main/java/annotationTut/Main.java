package annotationTut;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        Coach dietCoach = context.getBean("dietCoach",Coach.class);

        System.out.println(dietCoach.getDiet());
        context.close();
    }
}
