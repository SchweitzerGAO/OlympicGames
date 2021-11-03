package test.moduletest;
import com.team.olympics.foul.foul;
import com.team.olympics.referee.referee;
import com.team.olympics.referee.mainReferee;
import com.team.olympics.referee.linesman;
import com.team.olympics.referee.chief;

public class ChainOfResponsibilityTest {
    public static void main(String[] args){
        referee basketball1=new linesman("篮球边裁");
        referee basketball2=new mainReferee("篮球主裁");
        referee basketball3=new chief("篮球组委会");

        basketball1.setNext(basketball2);
        basketball2.setNext(basketball3);

        boolean result1=basketball1.process(new foul("篮球",1));
        System.out.println("最终结果：" + result1 + "\n");

        boolean result2=basketball1.process(new foul("篮球",2));
        System.out.println("最终结果：" + result2 + "\n");

        boolean result3=basketball1.process(new foul("篮球",3));
        System.out.println("最终结果:"+result3+'\n');

    }
}
