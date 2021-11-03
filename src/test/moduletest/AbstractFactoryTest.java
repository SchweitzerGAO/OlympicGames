package test.moduletest;

import com.team.olympics.canteen.Canteen;
import com.team.olympics.style.AsiaStyle;
import com.team.olympics.style.EuAmStyle;
import com.team.olympics.twoKindsMeals.OlympicMeal;
import com.team.olympics.twoKindsMeals.VisitorMeal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Gu HungJou
 * @date 2021/10/31 22:05
 * Describe:
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("============1.Abstract Factory============");
        Scanner scanner=new Scanner(System.in);
        System.out.println("后勤部食堂对本次运动会的餐饮实行欧美风格和亚洲风格,旨在改善运动员和游客的伙食...");
        try {
            while (true) {
                System.out.println("请选择要测试的风格,1为欧美风格,2为亚洲风格,0退出测试...");
                int i = scanner.nextInt();
                Canteen canteen;
                if (i == 1) {
                    canteen = new EuAmStyle();
                    canteen.setImplementMan();
                    System.out.println("请选择要测试的餐种,1为运动员餐,2为游客餐...");
                    int j = scanner.nextInt();
                    if (j == 1) {
                        OlympicMeal olympicMeal = canteen.produceOlympicMeal();
                        System.out.println("您作为本次奥运会后勤部的督导,正在检查" + olympicMeal.getName());
                        System.out.print("欧美风格运动员餐营养成分为:");
                        olympicMeal.initIngredientList();
                        System.out.println();
                        System.out.println("这种搭配方式让运动员身材不走样的同时保持高昂的活力...");
                        System.out.println("该餐的厨师长是" + olympicMeal.getChefName());
                        olympicMeal.producing();
                        olympicMeal.packing();
                        olympicMeal.getState();
                        Canteen.getCanteenPlot();

                    } else if (j == 2) {
                        VisitorMeal visitorMeal = canteen.produceVisitorMeal();
                        System.out.println("您作为本次奥运会后勤部的督导,正在检查" + visitorMeal.getName());
                        System.out.print("欧美风格运动员餐营养成分为:");
                        visitorMeal.initIngredientList();
                        System.out.println();
                        System.out.println("这种搭配方式让运动员身材不走样的同时保持高昂的活力...");
                        System.out.println("该餐的厨师长是" + visitorMeal.getChefName());
                        visitorMeal.producing();
                        visitorMeal.packing();
                        visitorMeal.getState();
                        Canteen.getCanteenPlot();
                    } else {
                        System.out.println("输入有误,请重新输入...");
                    }
                } else if (i == 2) {
                    canteen = new AsiaStyle();
                    canteen.setImplementMan();
                    System.out.println("请选择要测试的餐种,1为运动员餐,2为游客餐...");
                    int j = scanner.nextInt();
                    if (j == 1) {
                        OlympicMeal olympicMeal = canteen.produceOlympicMeal();
                        System.out.println("您作为本次奥运会后勤部的督导,正在检查" + olympicMeal.getName());
                        System.out.print("欧美风格运动员餐营养成分为:");
                        olympicMeal.initIngredientList();
                        System.out.println();
                        System.out.println("这种搭配方式让运动员身材不走样的同时保持高昂的活力...");
                        System.out.println("该餐的厨师长是" + olympicMeal.getChefName());
                        olympicMeal.producing();
                        olympicMeal.packing();
                        olympicMeal.getState();
                        Canteen.getCanteenPlot();

                    } else if (j == 2) {
                        VisitorMeal visitorMeal = canteen.produceVisitorMeal();
                        System.out.println("您作为本次奥运会后勤部的督导,正在检查" + visitorMeal.getName());
                        System.out.print("欧美风格运动员餐营养成分为:");
                        visitorMeal.initIngredientList();
                        System.out.println();
                        System.out.println("这种搭配方式让运动员身材不走样的同时保持高昂的活力...");
                        System.out.println("该餐的厨师长是" + visitorMeal.getChefName());
                        visitorMeal.producing();
                        visitorMeal.packing();
                        visitorMeal.getState();
                        Canteen.getCanteenPlot();
                    } else {
                        System.out.println("输入有误,请重新输入...");
                    }
                } else if (i == 0) {
                    break;
                } else {
                    System.out.println("输入有误,请重新输入...");
                }
            }
        }
        catch (InputMismatchException ime)
        {
            System.out.println("输入格式错误，暂停测试...");
        }
    }
}
