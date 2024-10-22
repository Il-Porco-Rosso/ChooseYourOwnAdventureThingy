import java.util.Scanner;

public class ChooseYourOwnAdventureThingy
{
    public static void main(String[] args)
    {
        System.out.println("Would you like to go fishing?");
        if (promptYesOrNo()) {
            System.out.println("You cast your rod, \nbut you forget your bait. \nWould you like to reel in?");
            if (promptYesOrNo()) {
                
            }
        }
        border(0);
        System.out.println("The end");
    }

    //==========================================================================================================//
    //----------------------------------------------------------------------------------------------------------//
    //==========================================================================================================//

    public static boolean promptYesOrNo() //prompts yes or no and returns true or false depending
    {
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        while (!validAnswer)
        {
            System.out.println("=====================================================");
            System.out.print("Answer yes or no: ");
            userAnswer = sc.nextLine();
            if ((userAnswer.equals("yes")) || (userAnswer.equals("no"))) {//checking if dude typed "yes or "no"
                validAnswer = true;
            } else {
                System.out.println("Plz type exactly either \"yes\" or \"no\". ");
            }
        }
        if (userAnswer.equals("yes")) {
            return true;
        }
        return false;
    }

    public static boolean prompt(String optionA, String optionB) //prompts a or b and returns true if 1st answer, false if 2nd answer
    {
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        while (!validAnswer)
        {
            System.out.println("=====================================================");
            System.out.print("Answer "+optionA+" or "+optionB+": ");
            userAnswer = sc.nextLine();
            if ((userAnswer.equals(optionA)) || (userAnswer.equals(optionB))) {//checking if dude typed correctly
                validAnswer = true;
            } else {
                System.out.println("Plz type exactly either \""+optionA+"\" or \""+optionB+"\". ");
            }
        }
        if (userAnswer.equals(optionA)) {
            return true;
        }
        return false;
    }

    public static int prompt(String optionA, String optionB, String optionC) //prompts a, b, or c and returns 1, 2, or 3 respectively
    {
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        while (!validAnswer)
        {
            System.out.println("=====================================================");
            System.out.print("Answer "+optionA+", "+optionB+", or "+optionC+": ");
            userAnswer = sc.nextLine();
            if ((userAnswer.equals(optionA)) || (userAnswer.equals(optionB)) || (userAnswer.equals(optionC))) {//checking if dude typed correctly
                validAnswer = true;
            } else {
                System.out.println("Plz type exactly either\""+optionA+"\", \""+optionB+"\", or \""+optionC+"\". ");
            }
        }
        if (userAnswer.equals(optionA)) {
            return 1;
        } else if (userAnswer.equals(optionB)) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void border(int type) {
        String borders[] = {"====================================================================================\n------------------------------------------------------------------------------\n====================================================================================", 
                            "==============================================", 
                            "---------------------------------------", 
                            "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=", 
                            ">----------------------<", "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n"};
        System.out.println(borders[type]);
    }
}