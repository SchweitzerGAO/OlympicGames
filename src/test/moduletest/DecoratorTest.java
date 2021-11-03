package test.moduletest;

import com.team.olympics.souvenir.DecoratorComponent;
import com.team.olympics.souvenir.basicsouvenir.*;
import com.team.olympics.souvenir.decorator.*;

import java.util.Scanner;

public class DecoratorTest {

    public static void main(String[] args) {

        System.out.println("—————————————-------------------------------------———— Test[Decorator]Pattern —————————————-------------------------------------————");
        System.out.println(" ");
        System.out.println("Welcome to the souvenir shop! Please choose the souvenir you want to buy:");
        System.out.println("**              1 --- Canvas Bag                 **");
        System.out.println("**              2 --- Cap                        **");
        System.out.println("**              3 --- Hoodie                     **");
        System.out.println("**              4 --- T-shirt                    **");

        DecoratorComponent souvenir;

        int i;
        while (true) {
            try {
                Scanner reader = new Scanner(System.in);
                i = reader.nextInt();
                if (i == 1) {
                    /*
                     * choose a canvas bag without decorations
                     */
                    souvenir = new CanvasBag();
                    break;
                } else if (i == 2) {
                    /*
                     * create a cap without decorations
                     */
                    souvenir = new Cap();
                    break;
                } else if (i == 3) {
                    /*
                     * create a hoodie without decorations
                     */
                    souvenir = new Hoodie();
                    break;
                }else if (i == 4) {
                    /*
                     * create a T-shirt without decorations
                     */
                    souvenir = new Tshirt();
                    break;
                }else {
                    System.out.println("Invalid input, please input again.\n");
                }
            } catch (Exception e) {
                System.out.print("Invalid input, please input again.\n");
            }
        }

        int b = 0;     //the number of badges chosen
        int p = 0;     //the number of packing boxes (maximum:1)
        int pPrinting = 0;      //the number of pattern printings chosen
        int wPrinting = 0;      //the number of word printings chosen

        while (true) {
            try {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("------------------- Choose decorations ----------------");
                System.out.println("**      1 --- A badge                                **");
                System.out.println("**      2 --- A pattern printing                     **");
                System.out.println("**      3 --- A word printing                        **");
                System.out.println("**      4 --- A packing box                          **");
                System.out.println("**      5 --- Show the current price of the souvenir **");
                System.out.println("**      6 --- Exit                                   **");
                System.out.println("-------------------------------------------------------");
                Scanner reader1 = new Scanner(System.in);
                i = reader1.nextInt();

                if (i == 1) {
                    /*
                     * add a badge
                     */
                    b++;
                    souvenir = new Badge(souvenir);
                } else if (i == 2) {
                    /*
                     * add a pattern printing
                     */
                    pPrinting++;
                    System.out.println("Please choose the pattern you like:");
                    System.out.println("1. Pattern A        2. Pattern B");
                    System.out.println("3. Pattern C        4. Pattern D");
                    souvenir = new PatternPrinting(souvenir);
                    Scanner reader2 = new Scanner(System.in);
                    i = reader2.nextInt();
                    System.out.println("Pattern has been chosen successfully!");
                } else if (i == 3) {
                    /*
                     * add a word printing
                     */
                    wPrinting++;
                    System.out.println("Please enter the words you like:");
                    Scanner reader3 = new Scanner(System.in);
                    String s = reader3.next();
                    souvenir = new WordPrinting(souvenir);
                    System.out.println("Words have been added successfully!");
                } else if (i == 4) {
                    /*
                     * add a packing box
                     */
                    if (p > 0) System.out.println("Sorry, you can only choose one packing box at most once.");
                    else {
                        p++;
                        souvenir = new PackingBox(souvenir);
                    }
                } else if (i == 5) {
                    /*
                     * show the current price of the souvenir
                     */
                    System.out.print(souvenir.getDescription() + ", with");
                    if (b == 0 && p == 0 && pPrinting == 0 && wPrinting == 0)
                        System.out.print("out decorations.");
                    else {
                        if (b > 1) {
                            System.out.print(" " + b + " badges");
                            if (pPrinting > 0)
                                System.out.print(", ");
                            if (pPrinting == 0 && wPrinting != 0) {
                                System.out.print(", and ");
                            }
                            if (pPrinting != 0 && wPrinting == 0) {
                                System.out.print("and ");
                            }
                        } else if (b == 1) {
                            System.out.print("1 badge");
                            if (pPrinting > 0)
                                System.out.print(", ");
                            if (pPrinting == 0 && wPrinting != 0) {
                                System.out.print(", and ");
                            }
                            if (pPrinting != 0 && wPrinting == 0) {
                                System.out.print("and ");
                            }
                        }


                        if (pPrinting > 1) {
                            System.out.print(pPrinting + " pattern printings");
                            if (wPrinting > 0) {
                               System.out.print(", and ");
                            }
                        } else if (pPrinting == 1) {
                           System.out.print("1 pattern printing");
                          if (wPrinting > 0)
                              System.out.print(", and ");
                        }

                        if (wPrinting > 1)
                            System.out.print(wPrinting + " word printings");
                        else if (wPrinting == 1)
                            System.out.print("1 word printing");

                        if (p == 1)
                            System.out.print(", and you have selected a packing bag.");
                        else System.out.print(".");
                    }

                    System.out.println(" The total price is " + souvenir.getPrice() + ".");

                } else if (i == 6) {
                    b = 0;
                    pPrinting = 0;
                    wPrinting = 0;
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Thanks for your patronage! Hope to see you next time!");
                    break;
                } else {
                    System.out.print("Invalid input, please input again.\n");
                }
            } catch (Exception e) {
                System.out.print("Invalid input, please input again.\n");
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
