package org.example;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside email Setter method");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("inside team setter method");
        this.team = team;
    }

    public CricketCoach(){
        System.out.println("Inside No arg Constructor");
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("Inside Setter Method");
        this.fortuneService = fortuneService;
    }
//    public CricketCoach(HappyFortuneService happyFortuneService) {
//
//    }

    public String getDailyWorkOut(){
        return "practise";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
    public static void main(String[] args) {
        CricketCoach ck = new CricketCoach();
        ck.getDailyWorkOut();
//        ck.getEmailAddress();
//        ck.getTeam();
    }

}
