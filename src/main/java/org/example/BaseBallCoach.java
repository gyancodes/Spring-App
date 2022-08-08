package org.example;

public class BaseBallCoach implements Coach{
    private final FortuneService fortuneService;
    public BaseBallCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;
    }

    public String  getDailyWorkOut(){
        return "Run 5km Daily";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
