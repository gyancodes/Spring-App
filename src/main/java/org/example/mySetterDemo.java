package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mySetterDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("/applicationContext.xml");
       CricketCoach demo =  Context.getBean("myCricketCoach",CricketCoach.class);

        System.out.println(demo.getEmailAddress());
        System.out.println(demo.getTeam());

    }
}
