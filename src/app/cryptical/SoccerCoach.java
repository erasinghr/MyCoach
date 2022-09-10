package app.cryptical;

public class SoccerCoach implements Coach{
    FortuneService theFortuneService;
    public SoccerCoach(){

    }

    public void setFortuneService(FortuneService fortuneService) {
        this.theFortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
       return "Practice on nets for at least 15 minutes daily";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }
}
