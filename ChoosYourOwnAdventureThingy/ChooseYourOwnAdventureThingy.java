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

    public static boolean promptYesOrNo()
    {
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        while (!validAnswer)
        {
            System.out.println("=====================================================");
            System.out.print("Answer yes or no: ");
            userAnswer = sc.nextLine();
            if ((userAnswer == "yes") || (userAnswer == "no")) {
                validAnswer = true;
            }
        }
        if (userAnswer == "yes") {
            return true;
        }
        return false;
    }
}