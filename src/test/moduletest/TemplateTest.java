package test.moduletest;

import com.team.olympics.template.Race;
import com.team.olympics.template.RaceFourHundred;
import com.team.olympics.template.RaceOneHundred;
import com.team.olympics.template.RaceTwoHundred;

public class TemplateTest {
    public static void main(String[] args) {
        Race r1=new RaceOneHundred();
        Race r2=new RaceTwoHundred();
        Race r3=new RaceFourHundred();
        r1.Action();
        r2.Action();
        r3.Action();

    }
}
