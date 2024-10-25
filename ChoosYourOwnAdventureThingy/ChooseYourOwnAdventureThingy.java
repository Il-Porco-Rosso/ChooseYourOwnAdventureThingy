import java.util.Scanner;

public class ChooseYourOwnAdventureThingy
{
    public static void main(String[] args)
    {
        border(5);
        System.out.println("The snow covers all the eye can see. Only hills and a handful of trees dot the grey and white landscape. \nWould you like to venture forth?");
        if (promptYesOrNo()) { //cannon path
            System.out.println("You walk forward and reach a hill. \nOver the hill, you see a long trench at the bottom with wood bracing holding the dirt and snow from collapsing the trench.\nDo you want to explore it or try to jump over?");
            if (prompt("explore", "jump over")) { //doesnt matter
                System.out.println("You climb down the hill and jump into the trench.");
            } else {
                System.out.println("You try to jump over, but you slip and fall into the trench anyway.");
            } //cannon trench exploring + food
            border(2); //------------------------------
            System.out.println("The trench is long and full of snow.\nPanels and boards line the sides as far as the trench goes. \nSpent shell casings are buried in the ground. \nA few steps away is what looks like two snowed-in bunkers, well, only one is snowed-in, the other is boarded up. \nWhich one would you like to go in?");
            if (prompt("the snowed-in one", "the boarded up one")) {
                
            } else {

            }


        } else { //dead end
            border(0);
            System.out.println("You freeze to death from sitting there in the cold without doing anything.");
        }
        
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
        while (!validAnswer) {
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

    public static int prompt(String optionA, String optionB, String optionC) { //prompts a, b, or c and returns 1, 2, or 3 respectively 
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        while (!validAnswer) {
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