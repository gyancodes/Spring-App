package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mySpringDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        Coach myCoach = context.getBean("myCoach",Coach.class);

        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());

        context.close();

    }
}
