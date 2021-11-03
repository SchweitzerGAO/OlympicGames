package test.moduletest;

import com.team.olympics.guideSystem.guideBorder;
import com.team.olympics.guideSystem.guideBorderGroup;

import javax.swing.*;
import java.util.InputMismatchException;
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
        guideBorderGroup borderGroup_Referee_room=new guideBorderGroup();
        borderGroup_Referee_room.add(border_no_3);
        borderGroup_Referee_room.add(border_no_4);
        guideBorderGroup borderGroup_prepare_area=new guideBorderGroup();
        borderGroup_prepare_area.add(border_no_5);
        borderGroup_prepare_area.add(border_no_6);
        borderGroup_prepare_area.add(border_no_7);
        guideBorderGroup borderGroup_swimming_hall=new guideBorderGroup();
        borderGroup_swimming_hall.add(borderGroup_Referee_room);
        borderGroup_swimming_hall.add(borderGroup_prepare_area);
        guideBorderGroup borderGroup_Olympic=new guideBorderGroup();
        borderGroup_Olympic.add(border_no_1);
        borderGroup_Olympic.add(border_no_2);
        borderGroup_Olympic.add(borderGroup_swimming_hall);
        System.out.print("本工程1标段工程师是");
        borderGroup_Olympic.setImplementMan();
        System.out.println(",他们负责道路、景观带、游泳馆的指引标识的建设和维护...");
        try
        {
            while (true)
            {
                System.out.println("您可以查看: 按1:查看道路指引牌位置 按2:查看景观带指引牌位置 按3:游泳馆裁判室指引牌位置 按4:游泳馆准备室指引牌位置" +
                        " 按5:游泳馆所有指引牌位置 按6:本次奥运会所有指引牌位置 按7:退出测试");
                Scanner scanner = new Scanner(System.in);
                int t = scanner.nextInt();
                switch (t) {
                    case 1:
                        border_no_1.show();
                        break;
                    case 2:
                        border_no_2.show();
                        break;
                    case 3:
                        borderGroup_Referee_room.show();
                        break;
                    case 4:
                        borderGroup_prepare_area.show();
                        break;
                    case 5:
                        borderGroup_swimming_hall.show();
                        break;
                    case 6:
                        borderGroup_Olympic.show();
                        break;
                    default:
                        break;
                }
                if(t==7)
                    break;
                System.out.println();
                System.out.println("作为后勤部督导,您还可以移除一些您认为设置不合理的指引牌...");
                System.out.println("按1:移除道路指引牌位置 按2:景观带指引牌位置 按3:游泳馆裁判室指引牌位置 按4:游泳馆准备室指引牌位置 按5:游泳馆所有指引牌位置 按6:本次奥运会所有指引牌位置 按0:不移除");
                int r = scanner.nextInt();
                switch (r) {
                    case 1:
                        borderGroup_Olympic.remove(0);
                        break;
                    case 2:
                        borderGroup_Olympic.remove(1);
                        break;
                    case 3:
                        borderGroup_swimming_hall.remove(0);
                        break;
                    case 4:
                        borderGroup_swimming_hall.remove(1);
                        break;
                    case 5:
                        borderGroup_Olympic.remove(2);
                        break;
                    case 6:
                        borderGroup_Olympic.remove(0);
                        borderGroup_Olympic.remove(1);
                        borderGroup_Olympic.remove(2);
                        break;
                    default:
                        break;
                }
                System.out.println("最终为:");
                borderGroup_Olympic.show();
                System.out.println();
            }
        }
        catch (InputMismatchException ime)
        {
            System.out.println("输入格式错误，暂停测试...");
        }
        catch (IndexOutOfBoundsException ibe)
        {
            System.out.println("删除索引越界，暂停测试...");
        }
    }
}
