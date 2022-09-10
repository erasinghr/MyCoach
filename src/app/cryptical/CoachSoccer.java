package app.cryptical;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachSoccer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SoccerCoach soccerCoach = context.getBean("mySoccerCoach", SoccerCoach.class);
        System.out.println(soccerCoach.getDailyWorkout());
        System.out.println(soccerCoach.getDailyFortune());
    }
}
