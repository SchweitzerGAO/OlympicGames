package test.moduletest;

import com.team.olympics.criteria.*;
import com.team.olympics.ground.FieldTraceField;
import com.team.olympics.ground.GameGround;
import com.team.olympics.ground.SoccerCourt;
import com.team.olympics.ground.SwimmingPool;

import java.util.ArrayList;
import java.util.List;

public class CriteriaTest {
    public static void showGrounds(List<GameGround> grounds)
    {
        for(GameGround ground:grounds)
        {
            System.out.println("Type: "+ ground.getType());
            System.out.println("Location: "+ ground.getLocation());
            System.out.println("Size: "+ ground.getSize()+" square meters");
            System.out.println();
        }

    }
    public static void criteriaTest()
    {
        List<GameGround> grounds = new ArrayList<>();
        grounds.add(new FieldTraceField("Beijing",20000));
        grounds.add(new FieldTraceField("Tokyo",17936));
        grounds.add(new SoccerCourt("Beijing",29378));
        grounds.add(new SoccerCourt("Tokyo",21827));
        grounds.add(new SwimmingPool("Beijing",9287));
        grounds.add(new SwimmingPool("Tokyo",9000));

        // all game grounds
        System.out.println("All:");
        showGrounds(grounds);
        System.out.println("--------------------------------------------------------------------------");
        // select the grounds in Beijing
        List<GameGround> inBeijing = new InBeijing().fitsCriteria(grounds);
        System.out.println("Grounds in Beijing:");
        showGrounds(inBeijing);
        System.out.println("--------------------------------------------------------------------------");
        // select all the soccer courts
        List<GameGround> soccerCourts = new IsSoccerCourt().fitsCriteria(grounds);
        System.out.println("Soccer courts:");
        showGrounds(soccerCourts);
        System.out.println("--------------------------------------------------------------------------");
        // select all the field-trace fields in Tokyo
        Criteria tokyoFieldTrace = new AndCriteria(new InTokyo(),new IsFieldTrace());
        List<GameGround> res = tokyoFieldTrace.fitsCriteria(grounds);
        System.out.println("Field Trace in Tokyo:");
        showGrounds(res);
        System.out.println("--------------------------------------------------------------------------");
    }
    public static void main(String[] args)
    {
        System.out.println("---------------------------- Criteria Pattern ----------------------------");
        System.out.println("fitsCriteria(): return the game grounds that meets selecting criteria ");
        System.out.println("--------------------------------------------------------------------------");
        criteriaTest();
        System.out.println("--------------------------------- End ------------------------------------");
    }

}
