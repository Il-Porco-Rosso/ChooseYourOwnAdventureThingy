import java.util.Scanner;

public class ChooseYourOwnAdventureThingy
{
    public static void main(String[] args)
    {
        System.out.println("deez");
        if (promptYesOrNo()) {
            System.out.println("nuts");
        }
    }

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
            if ((userAnswer.equals("yes")) || (userAnswer.equals("no"))) {//checking if dude typed correctly
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
}