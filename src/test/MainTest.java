package test;

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
        System.out.println("**            25 --- Criteria                  **");
        System.out.println("**            27 --- MVC                       **");
        System.out.println("**            28 --- AOP                       **");
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
                        AbstractFactoryTest.main(args);
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
                        ChainOfResponsibilityTest.main(args);
                        break;
                    }
                    case 6:
                    {
                        break;
                    }
                    case 7:
                    {
                        CompositeTest.main(args);
                        break;
                    }
                    case 8:
                    {
                        DecoratorTest.main(args);
                        break;
                    }
                    case 9:
                    {
                        FacadeTest.main(args);
                        break;
                    }
                    case 10:
                    {
                        FactoryTest.main(args);
                        break;
                    }
                    case 11:
                    {
                        FlyweightTest.main(args);
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
                        MediatorTest.main(args);
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
                        PrototypeTest.main(args);
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
                        StatusTest.main(args);
                        break;
                    }
                    case 21:
                    {
                        StrategyTest.main(args);
                        break;
                    }
                    case 22:
                    {
                        TemplateTest.main(args);
                        break;
                    }
                    case 23:
                    {
                        VisitorTest.main(args);
                        break;
                    }
                    case 24:
                    {
                        DITest.main(args);
                        break;
                    }
                    case 25:
                    {
                        CriteriaTest.main(args);
                        break;
                    }
                    case 27:
                    {
                        try {
                            MVCTest.main(args);
                        } catch (InterruptedException e) {
                            System.out.println("Unknown Interruption, Ending the test...");
                        }
                        break;

                    }
                    case 28:
                    {
                        try {
                            AOPTest.main(args);
                        } catch (Exception e) {
                            System.out.println("Exception: Ending the test");
                        }
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
