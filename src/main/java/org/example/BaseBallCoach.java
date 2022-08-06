package org.example;

public class BaseBallCoach implements Coach{
    private FortuneService fortuneService;
    public BaseBallCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;
    }

    public String  getDailyWorkOut(){
        return "gfdfdg";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
