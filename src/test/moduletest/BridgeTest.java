package test.moduletest;

import com.team.olympics.game.gender.Gender;
import com.team.olympics.game.gender.Men;
import com.team.olympics.game.gender.Women;
import com.team.olympics.game.pingpong.PingPongGame;
import com.team.olympics.game.pingpong.PingPongDual;
import com.team.olympics.game.pingpong.PingPongSingle;
import com.team.olympics.game.pingpong.PingPongTeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BridgeTest {
    // test method
    public static void bridgeTest()
    {
        Gender gender=null;
        PingPongGame pingPongGame = null;
        boolean testing = true;
        Scanner sc = new Scanner(System.in);
        while(testing)
        {
            try
            {
                boolean validGender = false;
                boolean validType = false;
                // selecting the gender
                System.out.println("Please choose the gender of the ping-pong game you want to watch[1:Men, 2:Women,0:Quit]:");
                int genderType = sc.nextInt();
                if (genderType == 0) {
                    testing = false;
                } else {
                    while (!validGender) {
                        switch (genderType) {
                            case 1: {
                                gender = new Men();
                                validGender = true;
                                break;
                            }
                            case 2: {
                                gender = new Women();
                                validGender = true;
                                break;
                            }
                            default: {
                                System.out.println("Invalid gender type! Please choose again!");
                                genderType = sc.nextInt();
                            }
                        }
                    }
                    // selecting the game type
                    System.out.println("Please choose the type of the ping-pong game you want to watch[1:Single, 2:Dual, 3:Team, 0:Quit]:");
                    int gameType = sc.nextInt();
                    while (!validType) {
                        switch (gameType) {
                            case 0: {
                                validType = true;
                                testing = false;
                                break;
                            }
                            case 1: {
                                pingPongGame = new PingPongSingle(gender);
                                validType = true;
                                break;
                            }
                            case 2: {
                                pingPongGame = new PingPongDual(gender);
                                validType = true;
                                break;
                            }
                            case 3: {
                                pingPongGame = new PingPongTeam(gender);
                                validType = true;
                                break;
                            }
                            default: {
                                System.out.println("Invalid game type! Please choose again!");
                                gameType = sc.nextInt();
                                break;
                            }
                        }
                    }
                    // show the game
                    if (pingPongGame != null) {
                        pingPongGame.show();
                        System.out.println();
                    }
                    pingPongGame = null;


                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Invalid input format! Ending the test...");
                System.out.println("-------- End of Bridge Pattern testing ---------");
                return;
            }
        }
        System.out.println("-------- End of Bridge Pattern testing ---------");
    }
    public static void main(String[] args)
    {
        System.out.println("-------------------- Bridge -----------------------------------");
        System.out.println("Gender(): An abstract gender interface");
        System.out.println("Men(): Male gender for the game");
        System.out.println("Women(): Female gender for the game");
        System.out.println("PingPong(): Create a abstract ping-pong game with certain gender");
        System.out.println("PingPongSingle(): Create a single ping-pong game with certain gender");
        System.out.println("PingPongDual(): Create a dual ping-pong game with certain gender");
        System.out.println("PingPongTeam(): Create a team ping-pong game with certain gender");
        System.out.println("-------------------------------------------------------------");
        bridgeTest();

    }
}
