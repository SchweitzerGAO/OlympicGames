package test.moduletest;

import com.team.olympics.guideSystem.guideBorder;
import com.team.olympics.guideSystem.guideBorderGroup;

import java.util.Scanner;

/**
 * @author Gu HungJou
 * @date 2021/11/1 13:38
 * Describe:
 */
public class CompositeTest {
    public static void main(String[] args) {
        System.out.println("============7.Composite============");
        System.out.println("后勤部为本届奥运会精心准备了指引系统。清晰详细的导向牌会不仅会减少耽误带来的麻烦，还会为这届奥林匹克运动会的人性化服务增光添彩。");
        guideBorder border_no_1 = new guideBorder();
        border_no_1.setLocation("奥运一路与奥运二路路口处");
        guideBorder border_no_2 = new guideBorder();
        border_no_2.setLocation("奥运河景观带A入口处");
        guideBorder border_no_3 = new guideBorder();
        border_no_3.setLocation("游泳馆裁判室北办公室处");
        guideBorder border_no_4 = new guideBorder();
        border_no_4.setLocation("游泳馆裁判室南办公室处");
        guideBorder border_no_5 = new guideBorder();
        border_no_5.setLocation("游泳馆准备室A区处");
        guideBorder border_no_6 = new guideBorder();
        border_no_6.setLocation("游泳馆准备室B区处");
        guideBorder border_no_7 = new guideBorder();
        border_no_7.setLocation("游泳馆准备室C区处");
        guideBorderGroup borderGroup_Referee_room = new guideBorderGroup();
        borderGroup_Referee_room.add(border_no_3);
        borderGroup_Referee_room.add(border_no_4);
        guideBorderGroup borderGroup_prepare_area = new guideBorderGroup();
        borderGroup_prepare_area.add(border_no_5);
        borderGroup_prepare_area.add(border_no_6);
        borderGroup_prepare_area.add(border_no_7);
        guideBorderGroup borderGroup_swimming_hall = new guideBorderGroup();
        borderGroup_swimming_hall.add(borderGroup_Referee_room);
        borderGroup_swimming_hall.add(borderGroup_prepare_area);
        guideBorderGroup borderGroup_Olympic = new guideBorderGroup();
        borderGroup_Olympic.add(border_no_1);
        borderGroup_Olympic.add(border_no_2);
        borderGroup_Olympic.add(borderGroup_swimming_hall);
        System.out.print("本工程1标段工程师是");
        borderGroup_Olympic.setImplementMan();
        System.out.println("他们负责道路、景观带、游泳馆的指引标识的建设和维护...");
        boolean flag1 = true, flag2 = true, flag3 = true, flag4 = true, flag5 = true, flag6 = true;
        while (true) {
            System.out.println("您可以查看: 按1:查看道路指引牌位置 按2:查看景观带指引牌位置 按3:游泳馆裁判室指引牌位置 按4:游泳馆准备室指引牌位置" +
                    " 按5:游泳馆所有指引牌位置 按6:本次奥运会所有指引牌位置 按7:退出测试");
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            if (t == 7)
                break;
            switch (t) {
                case 1:
                    if (!flag1 || !flag6) {
                        System.out.println("您已经否决了先前的指引牌，工程师正在重新规划...");
                    } else
                        border_no_1.show();
                    break;
                case 2:
                    if (!flag2 || !flag6) {
                        System.out.println("您已经否决了先前的指引牌，工程师正在重新规划...");
                    } else
                        border_no_2.show();
                    break;
                case 3:
                    if (!flag3 || !flag5 || !flag6) {
                        System.out.println("您已经否决了先前的指引牌，工程师正在重新规划...");
                    } else
                        borderGroup_Referee_room.show();
                    break;
                case 4:
                    if (!flag4 || !flag5 || !flag6) {
                        System.out.println("您已经否决了先前的指引牌，工程师正在重新规划...");
                    } else
                        borderGroup_prepare_area.show();
                    break;
                case 5:
                    if (!flag5 || !flag6) {
                        System.out.println("您已经否决了先前的指引牌，工程师正在重新规划...");
                    } else
                        borderGroup_swimming_hall.show();
                    break;
                case 6:
                    if (!flag6) {
                        System.out.println("暂无");
                    } else
                        borderGroup_Olympic.show();
                    break;
                default:
                    System.out.println("您输入的测试选项非法...");
                    break;
            }
            System.out.println();
            if (borderGroup_Olympic.array.size() == 0){
                System.out.println("您已经否决了全部指引牌方案，即将退出测试...");
                System.exit(1);
            }
            System.out.println("作为后勤部督导,您可以移除一些您认为设置不合理的指引牌...");
            System.out.println("按1:移除道路指引牌位置 按2:景观带指引牌位置 按3:游泳馆裁判室指引牌位置 按4:游泳馆准备室指引牌位置 按5:游泳馆所有指引牌位置 按6:本次奥运会所有指引牌位置 按0:不移除");
            int r = scanner.nextInt();
            switch (r) {
                case 1:
                    if (!flag1 || !flag6) {
                        System.out.println("您先前已经移除了该指引牌...");
                    } else {
                        borderGroup_Olympic.remove(border_no_1);
                        System.out.println("您否决了" + border_no_1.getLocation() + "的安装方案...");
                        flag1 = false;
                    }
                    break;
                case 2:
                    if (!flag2 || !flag6) {
                        System.out.println("您先前已经移除了该指引牌...");
                    } else {
                        borderGroup_Olympic.remove(border_no_2);
                        System.out.println("您否决了" + border_no_2.getLocation() + "的安装方案...");
                        flag2 = false;
                    }
                    break;
                case 3:
                    if (!flag3 || !flag6 || !flag5) {
                        System.out.println("您先前已经移除了该指引牌...");
                    } else {
                        borderGroup_swimming_hall.remove(borderGroup_Referee_room);
                        System.out.println("您否决了游泳馆裁判室指引牌组的安装方案...");
                        flag3 = false;
                    }
                    break;
                case 4:
                    if (!flag4 || !flag6 || !flag5) {
                        System.out.println("您先前已经移除了该指引牌...");
                    } else {
                        borderGroup_swimming_hall.remove(borderGroup_prepare_area);
                        System.out.println("您否决了游泳馆准备室指引牌组的安装方案...");
                        flag4 = false;
                    }
                    break;
                case 5:
                    if (!flag5 || !flag6) {
                        System.out.println("您先前已经移除了该指引牌...");
                    } else {
                        borderGroup_Olympic.remove(borderGroup_swimming_hall);
                        System.out.println("您否决了游泳馆指引牌组的安装方案...");
                        flag5 = false;
                    }
                    break;
                case 6:
                    borderGroup_Olympic.remove(border_no_1);
                    borderGroup_Olympic.remove(border_no_2);
                    borderGroup_Olympic.remove(borderGroup_swimming_hall);
                    flag6 = false;
                    break;
                default:
                    break;
            }
            try {
                Thread.sleep(1500);
                System.out.println();
            } catch (InterruptedException e) {
                System.out.println("未知异常，暂停测试...");
            }
            System.out.println("现在的指引牌组为:");
            if (borderGroup_Olympic.array.size() != 0)
                borderGroup_Olympic.show();
            else {
                System.out.println("您否决了所有安装方案...");
            }
            try {
                Thread.sleep(1500);
                System.out.println();
            } catch (InterruptedException e) {
                System.out.println("未知异常，暂停测试...");
            }
        }
    }
}
