package test.moduletest;

import com.team.olympics.Olympics;

import java.util.Scanner;

public class VisitorTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Visitor] Test ------------------------------------");

        System.out.println("");
        System.out.println("SiteStructure : addSite(): void : " +
                "Add scenarios to our processing class.");
        System.out.println("SiteStructure : accept(SiteMaintenanceStaff staff): void : " +
                "In different scenarios, different site maintenance staff classes are executed to separate the specific site from the site operation.");
        System.out.println("");

        System.out.println("");
        System.out.println("*********************** Immutable patter Test *************************");
        System.out.println("***                 1. test cleaner                                 ***");
        System.out.println("***                 2. test facility maintainer                     ***");
        System.out.println("***                                                                 ***");
        System.out.println("***You can choose to specify behavior for our existing site classes ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Visitor Pattern Test: Test the treatment method of Cleaner (Cleaner)：");
                    Olympics.getOlympics().doClean();
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("Visitor Pattern Test: Test the treatment method of FacilityMaintainer (FacilityMaintainer)：");
                    Olympics.getOlympics().doMaintenance();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
