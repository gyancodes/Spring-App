package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMethodDemo {
    public static void main(String[] args) {
        //set thr spring container

        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get Beans
        CricketCoach coach = Context.getBean("myCricketCoach",CricketCoach.class);

        //call the method

        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getTeam());
        System.out.println(coach.getEmailAddress());


    }
}
