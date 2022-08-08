package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeMain {
    public beanScopeMain(HappyFortuneService happyFortuneService) {

    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result =(theCoach==alphaCoach);
        System.out.println("\nBoth beans are same" + " " + result);
        System.out.println("\nAddress of theCoach" + " " + theCoach);
        System.out.println("\nAddress of alphaCoach" + " "  + alphaCoach);


        context.close();
    }
}
