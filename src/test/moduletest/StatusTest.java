package test.moduletest;

import com.team.olympics.organizingcommittee.OrganizingCommittee;
import com.team.olympics.player.SportPlayer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StatusTest {
    public static void main(String[] args){
        System.out.println("--------------------------- Status ---------------------------------");

        test();
        System.out.println("------------------------- Status end---------------------------------");
    }

    public static void test()
    {
        try
        {
            System.out.println("正在初始化运动员");
            SportPlayer newPlayer = new SportPlayer();

            while (true) {
                System.out.println("0:exit 1~9:continue");
                if(getNum()==0)
                    break;
                System.out.println("请输入需要更改的状态值(-99~99):");
                newPlayer.setStatus(getNum());
            }
        } catch (InputMismatchException e) {
            System.out.println("非法输入，暂停测试...");
        }
    }


    public static int getNum()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
