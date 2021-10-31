package test;

import com.team.olympics.memento.Memento;
import test.moduletest.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Charles Gao
 * @description the main entry of the project
 * @date 2021/10/31
 */
public class MainTest {
    public static void showMenu()
    {
        System.out.println("---------------Design Pattern List---------------");
        System.out.println("**             1 --- Abstract Factory          **");
        System.out.println("**             2 --- Adapter                   **");
        System.out.println("**             3 --- Bridge                    **");
        System.out.println("**             4 --- Builder                   **");
        System.out.println("**             5 --- Chain of Responsibility   **");
        System.out.println("**             6 --- Command                   **");
        System.out.println("**             7 --- Composite                 **");
        System.out.println("**             8 --- Decorator                 **");
        System.out.println("**             9 --- Facade                    **");
        System.out.println("**            10 --- Factory Method            **");
        System.out.println("**            11 --- Flyweight                 **");
        System.out.println("**            12 --- Interpreter               **");
        System.out.println("**            13 --- Iterator                  **");
        System.out.println("**            14 --- Mediator                  **");
        System.out.println("**            15 --- Memento                   **");
        System.out.println("**            16 --- Observer                  **");
        System.out.println("**            17 --- Prototype                 **");
        System.out.println("**            18 --- Proxy                     **");
        System.out.println("**            19 --- Singleton                 **");
        System.out.println("**            20 --- State                     **");
        System.out.println("**            21 --- Strategy                  **");
        System.out.println("**            22 --- Template Method           **");
        System.out.println("**            23 --- Visitor                   **");
        System.out.println("**            24 --- Dependency Injection      **");
        System.out.println("-------------------------------------------------");
        System.out.print("Which design pattern do you want to test? [0 to quit]: ");
    }

    public static void main(String[] args)
    {
        try
        {
            boolean cont = true;
            int choose;
            Scanner sc = new Scanner(System.in);
            while(cont)
            {
                showMenu();
                choose = sc.nextInt();
                switch (choose)
                {
                    case 0:
                    {
                        cont = false;
                        break;
                    }
                    case 1:
                    {
                        break;
                    }
                    case 2:
                    {
                        break;
                    }
                    case 3:
                    {
                        BridgeTest.main(args);
                        break;
                    }
                    case 4:
                    {
                        BuilderTest.main(args);
                        break;
                    }
                    case 5:
                    {
                        break;
                    }
                    case 6:
                    {
                        break;
                    }
                    case 7:
                    {
                        break;
                    }
                    case 8:
                    {
                        break;
                    }
                    case 9:
                    {
                        FacadeTest.main(args);
                        break;
                    }
                    case 10:
                    {
                        break;
                    }
                    case 11:
                    {
                        break;
                    }
                    case 12:
                    {
                        InterpreterTest.main(args);
                        break;
                    }
                    case 13:
                    {
                        IteratorTest.main(args);
                        break;
                    }
                    case 14:
                    {
                        break;
                    }
                    case 15:
                    {
                        MementoTest.main(args);
                        break;
                    }
                    case 16:
                    {
                        ObserverTest.main(args);
                        break;
                    }
                    case 17:
                    {
                        break;
                    }
                    case 18:
                    {
                        break;
                    }
                    case 19:
                    {
                        SingletonTest.main(args);
                        break;
                    }
                    case 20:
                    {
                        break;
                    }
                    case 21:
                    {
                        break;
                    }
                    case 22:
                    {
                        TemplateTest.main(args);
                        break;
                    }
                    case 23:
                    {
                        break;
                    }
                    case 24:
                    {
                        DITest.main(args);
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid choice! Please choose again");
                        break;
                    }

                }
            }
        }
        catch (InputMismatchException ime)
        {
            System.out.println("Invalid input format! Test end!");
        }
    }
}
