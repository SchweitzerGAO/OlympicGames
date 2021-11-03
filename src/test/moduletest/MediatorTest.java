package test.moduletest;

import com.team.olympics.colleague.*;
import com.team.olympics.committeeChairman.committeeChairman;
import com.team.olympics.leader.teamLeader;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Gu HungJou
 * @date 2021/11/1 20:20
 * Describe:
 */
public class MediatorTest {
    public static void main(String[] args) {
        System.out.println("============14.Mediator============");
        System.out.println("奥运会中各国家队与组委会、国家队各部门间有着密切而繁杂的沟通和交流，设置国家队负责人（中介者）显得尤为重要...");
        teamLeader leader_CN=new teamLeader("中国队");
        teamLeader leader_AM=new teamLeader("美国队");
        System.out.println("美国队、中国队负责人已创建...");
        //单例模式--奥组委办公室类
        committeeChairman.setTeamLeaders(leader_CN);
        committeeChairman.setTeamLeaders(leader_AM);
        System.out.println("美国队、中国队已加入奥组委办公室管理...");
        colleague CN_athlete=new athlete(leader_CN);
        colleague CN_advocator=new advocator(leader_CN);
        colleague CN_coach=new coach(leader_CN);
        colleague CN_teamDoctor=new teamDoctor(leader_CN);
        System.out.println("中国队各部门初始化完毕...");
        colleague AM_athlete=new athlete(leader_AM);
        colleague AM_advocator=new advocator(leader_AM);
        colleague AM_coach=new coach(leader_AM);
        colleague AM_teamDoctor=new teamDoctor(leader_AM);
        System.out.println("美国队各部门初始化完毕...");
        try
        {
            while(true) {
                System.out.println();
                System.out.println("开始测试:按1给各代表队运动员部发通知 按2给各代表队教练员部发通知 按3给各代表队卫生部发通知 按4给各代表队宣传部门发通知 " +
                        "按5让中国队教练员和运动员交流 按6让美国队卫生部和宣传部交流 按7让美国队运动员给奥组委反应问题 按8退出测试");
                Scanner scanner=new Scanner(System.in);
                int i=scanner.nextInt();
                if(i==1) {
                    System.out.println("奥组委办公室决定对各代表队运动员加油打气,于是给各负责人发出祝福...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("各队负责人再分发给各部门运动员...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    committeeChairman.dispatchNotification("athlete", "《祝各代表队运动健儿们赛出友谊,赛出成绩》");
                }
                if(i==2) {
                    System.out.println("奥组委办公室决定对各代表队教练员进行防兴奋剂培训,于是给各负责人发出培训通知...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("各队负责人再分发给各部门教练员部...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    committeeChairman.dispatchNotification("coach", "《防范兴奋剂通知》");
                }
                if(i==3) {
                    System.out.println("后疫情时代,奥组委办公室决定对各代表队卫生部门进行培训,于是给各负责人发出培训通知...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("各队负责人再分发给各部门卫生部...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    committeeChairman.dispatchNotification("teamDoctor", "《疫情防范与应对通知》");
                } if(i==4) {
                    System.out.println("奥组委办公室决定对各代表队宣传员进行宣传培训,于是给各负责人发出培训通知...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("各队负责人再分发给各部门宣传部...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    committeeChairman.dispatchNotification("advocator", "《实事求是,正确报道,引领务实风气》");
                }
                if(i==5){
                    CN_coach.feedBack("运动健儿们,加油,为国争光!","athlete");
                    CN_athlete.feedBack("收到教练的祝福!","coach");
                }
                if(i==6){
                    AM_teamDoctor.feedBack("请发送给美国队运动员们,让他们注意运动热身,谨防扭伤!","advocator");
                    AM_advocator.feedBack("运动员们,请注意热身!","athlete");
                }
                if(i==7){
                    AM_athlete.feedBack("我们应该拥有更大的运动员宿舍!","committee");
                }
                if(i==8){
                    break;
                }
            }
        }
        catch (InputMismatchException ime)
        {
            System.out.println("输入格式错误，暂停测试...");
        }

    }
}
