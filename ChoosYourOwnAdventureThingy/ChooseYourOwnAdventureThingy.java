import java.util.Scanner;

public class ChooseYourOwnAdventureThingy
{
    public static void main(String[] args)
    {
        int cannedgoods = 0;
        int freshfood = 0;
        int gun = 0;
        int dayspasssedsincestarting = 0;

        int coin;

        border(5);
        System.out.println("The snow covers all the eye can see. Only hills and a handful of trees dot the grey and white landscape. \nWould you like to venture forth?");
        if (promptYesOrNo()) { //cannon path
            System.out.println("You walk forward and reach a hill. \nOver the hill, you see a long trench at the bottom with wood bracing holding the dirt and snow from collapsing the trench.\nDo you want to explore it or try to jump over?");
            if (prompt("explore", "jump over")) { //doesnt matter
                System.out.println("You climb down the hill and jump into the trench.");
            } else {
                System.out.println("You try to jump over, but you slip and fall into the trench anyway.");
            } //cannon trench exploring + food
            border(2); //------------------------------------------------------------------
            System.out.println("The trench is long and full of snow.\nPanels and boards line the sides as far as the trench goes. \nSpent shell casings are buried in the ground. \nA few steps away is what looks like two snowed-in bunkers, well, only one is snowed-in, the other is boarded up. \nWhich one would you like to go in?");
            if (prompt("the snowed-in one", "the boarded up one")) {
                System.out.println("You dig your way in. \nInside is a small, cramped room with poorly held dirt walls, held by dry wood panels.\nThe ceiling is only held up by one plank.\nOther than the first few feet, there is no light. \nHow will you light up the room?");
                if (prompt("start a fire & stay the night", "get out a flashlight & leave when finished")) {//death lol
                    System.out.println("You get out some flamable material and light it with a match. \nThe bits of sticks dont light easily, so you blow a bit of air into the pile. \nEventually, the fire flares up. \nHooray! \n...but because it's a small room, the fire spreads to the dry wood, inches away from the pile, setting the only thing holding the dirt up on fire. \nSoon after, all the dirt falls on top of you and you suffocate to death.");
                } else {
                    System.out.println("You pull out your flashlight and look around. \nIt's a very small room with nothing but a box of rifles on the other side. \nAlthough, on closer inspection, there is a can of pork stew sitting in the box.");
                    cannedgoods++;
                    System.out.println("Hurrah!! \nWell, actually, you can only assume it's pork stew. \nIt's written in some language you don't know, but there's a drawing of a pig swimming in a bowl. \nSo cool beans I guess.");
                    border(2); //----------------------------
                    System.out.println("While you're at it, would you like to pick up one of the rifles and some ammo? You know, self defence?");
                    if (promptYesOrNo()) {
                        System.out.println("Well, you can never be sure, right?");
                        gun++;
                    } else {
                        System.out.println("Well, what's out here in the snow, right?");
                    }
                    border(2);
                    System.out.print("You climb back out into the snowy trench and back out to the snowy landscape. \nYou walk forward for what seems like forever. \nThe only colors you've seen being just white, white, white, and light grey. \nAt some point, you reach a hill with some trees on it. ");
                    if (cannedgoods >= 1) {
                        System.out.println("Would you like to heat up and eat the pork stew?");
                        if (promptYesOrNo()) {
                            System.out.println("You had been getting hungry after all!");
                            border(1);
                            cannedgoods--;
                            System.out.println("Turns out it wasn't pork stew, but creamy pork and mushroom stew. \nThe pig wasn't swimming in a bowl, it was lying on a mushroom.");
                            border(2);
                            System.out.println("Though the soup was good, snow had started to fall down harder than usual and the wind had sped up. \nYou sense a snowstorm coming.\nWhat will you do?");
                        } else {
                            System.out.println("It might be better to save it for later on the chance you find a better shelter, of course. \nSo, instead of eating, you decide to bask in the atmosphere. \nYou watch nature. \nYou see. \nYou notice things... \n...like that white rabbit!");
                            if (gun >= 1) {
                                System.out.println("What will you do?");
                                if (prompt("shoot it", "let it live")) {
                                    System.out.println("You point the barrel of the rifle at the head of the poor bunny and pull the trigger.");
                                    border(1);
                                    freshfood ++;
                                    System.out.print("After skinning the rabbit and dousing it in a good bit of spare salt and flavoring,");
                                } else {
                                    System.out.println("Of course, there is no need for extra suffering. You brought the gun for self defence after all. \nAlthough, on closer inspection, there is something behind the rabbit. \nYou walk over and discover a white pouch with two cans of soup!");
                                    cannedgoods += 2;
                                    System.out.println("Ahh, the fruits of your labor.");
                                    border(1);
                                    System.out.print("After putting away the cans,");
                                }
                            } else {
                                System.out.println("What will you do?");
                                if (prompt("shoot it", "do nothing")) {
                                    System.out.println("You pull out your gun and... \nNo, you never had a gun! \nThe rabbit runs away.");
                                } else {
                                    System.out.println("You do nothing and the rabbit runs away.");
                                }
                                border(1);
                                System.out.print("After some time passes,");
                            }
                            System.out.println(" you notice the wind had picked up and the snow is falling heavier than before. \nA snowstorm is coming. \nWhat will you do?");
                        }
                    } else {
                        border(5);
                        System.out.println("'Oh it looks like a glitch has happened with the amount of canned goods for some reason.'");
                    }
                    //prompt snowstorm thing here
                    coin = prompt("stay near the tree", "venture forth", "backtrack to the bunker");
                    if (coin == 1) { //stay
                        System.out.println("You sit down and wait. \nYou sit and wait. \nSit and wait. \nSit, wait. \nWait. \nwait \nwai");
                        border(0);
                        System.out.print("Because you were stupid enough to try to endure a snowstorm,");
                        if (freshfood >= 1) {
                            System.out.println(" you and your rabbit freeze, preserving the rabbit and killing you.");
                        } else {
                            if (cannedgoods > 1) {
                                System.out.println(" you and your cans of soup freeze to death.");
                            } else if (cannedgoods == 1) {
                                System.out.println(" you and your pig stew freeze to death.");
                            } else {
                                System.out.println(" you and your empty bag freeze to death. \nSo sad.");
                            }
                        }
                    } else if (coin == 2) {// go forth
                        System.out.println("You venture onward hoping to find shelter. \nSadly though, there is nothing in sight, just white & grey. \nOh? Wait! No, there is something here.");
                        border(1);
                        System.out.println("You see a very small town ahead. \nOnly a few small buildings barely taller than you are, and only slightly thinner than a large car. \nIn the closer one, you see a light. \nGo in?");
                        if (promptYesOrNo()) {// meets dudes in cloaks
                            System.out.println("You open the door and step downward into the small muddy building. \nThree dudes look at you. \nAll of them wear black parkas & black cloaks with guns slung around them. \nOne of them is trying to start a fire in the middle.");
                            if (gun > 0) {
                                System.out.println("They notice your rifle and point theirs directly at your head. \nWhat will you do?");
                                coin =prompt("run away", "offer food", "shoot them");
                                if (coin == 1) {
                                    System.out.println("You try to turn and run and you make it out. \nThere is a snow storm outside. \nSo, you go back in. \nThey immediately shoot you as you open the door.");
                                } else if (coin ==2) {//"cannon" end (cannon end is in a different branch)---------------------------------------------------------------
                                    if (freshfood > 0 || cannedgoods > 1) {
                                        if (freshfood > 0) {
                                            System.out.println("To quell the chaos, you pull out your trump card of trump cards... \n...you show them the rabbit meat. \nThe three guys then stop, look at each other, and look at you again.\nThey put the rifles down and one chuckles. \nThey welcome you in.");
//do stuff here too                         
                                            border(1);
                                            System.out.println("You and the three dudes roast the rabbit and enjoy the best meal you've all had since you all got stuck in the white snowscape. \nThe night goes by quick.");
                                            dayspasssedsincestarting++;
                                            freshfood--;
                                            border(0);

                                        } else if (cannedgoods > 1) {
                                            System.out.println("To quell the chaos, you pull out your cans of soup and offer it to them, trying your best not to look like you're pulling out another weapon. \nThe three guys the stop to put their rifles back down.\nOne of them gets some cans of their own out of their parka. \nThey go up to you and compare their cans to yours. \nTheirs: clam pasta, yours: pork stew & soup. \nThe one in front of you smiles and they welcome you in.");
               //do stuff                             
                                            border(1);
                                            System.out.println("You and the three dudes in black parkas enjoy their cans of pasta, and one of your cans of soup together.\nProbably the best meal you've had in a while in the snowy nothingness. \nThe night goes by quick.");
                                            dayspasssedsincestarting++;
                                            cannedgoods--;
                                            border(0);
                                        }//======main=thing===========================================================
                                        System.out.println("One day has passed. \nThe three guys in black parkas are outside, talking about something. \nWhat do you want to do?");
                                        if (prompt("go outside and maybe follow them", "stay inside and wait for them to go")) {
                                            //go(don t matter)
                                            System.out.println("You go outside and see them running off into the distance, as if they were being chased.\nSoon after, two men on horses arrive behind you coming from the opposite direction of where the trio were headed.\nThe two men dismount and hurry you back into the hut you were in. They wear basic winter gear, both also with scarves. One of them wears a beanie, the other wears shades and a backwards cap.\nMost importantly, they speak English.");
                                        } else {
                                            //stay
                                            System.out.println("You wait, and you hear the three dudes quickly running away. \nRight after, what sounds like two horses arrive right in front of the hut.\nTwo men bust through the door.\nThey wear basic winter gear, both also with scarves. One of them wears a beanie, the other wears shades and a backwards cap.\nMost importantly, they speak English.");
                                        }
                                        System.out.println("    'What are YOU doing here!!??' Says the one in shades. \n    'You think he's one of them?' Whispers the other.\n     'Doubt it.'\nHow will you respond?");
                                        if (prompt("say 'I was lost'", "tell them the whole story")) {
                                            
                                        } else {
                                            
                                        }
                                        //============================================================================
                                    } else if (cannedgoods == 1) {
                                        System.out.println("To quell the chaos, you offer your lone can of soup, but they thought you were pulling out a pistol and shoot you three times at once in the head.\nYou die.");
                                    } else {
                                        System.out.println("To quell the chaos, you pull out your can of ... \n...Oh wait, you don't have another can of stew. Shoot. \nThe three dudes kick you out of the hut into the snowstorm outside. \nYou freeze to death.");
                                    }
                                } else {
                                    System.out.println("You pull out your rifle. \nYou immediately get shot three times at once. \nYou die.");
                                }
                            } else {// no gun, die from starvation or somethung idk
                                
                            }
                        } else { //goes to the other hut thing

                        }
    //tbd

                    } else {// go back
                        System.out.println("You try to backtrack to the trench that is miles away. \nIt took hours to get from the trench to where you are, but the snowstorm only took an hour to get to you, and 30 minutes to kill you.");
                    }
                }

            //====================================================================================================
            //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            //====================================================================================================

            } else { //cannon route (goes in boarded bunker with thr dude)
                System.out.println("hehy I didn't make the story yet lol");
            }


        } else { //dead end
            border(0);
            System.out.println("You freeze to death from sitting there in the cold without doing anything.");
        }
        
        System.out.println("The end");
        border(1);
    }

    //==========================================================================================================//
    //----------------------------------------------------------------------------------------------------------//
    //==========================================================================================================//

    public static boolean promptYesOrNo() //prompts yes or no and returns true or false depending
    {
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        for (;!validAnswer;)
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
            border(5);
            return true;
        }
        border(5);
        return false;
    }

    public static boolean prompt(String optionA, String optionB) //prompts a or b and returns true if 1st answer, false if 2nd answer
    {
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        for (;!validAnswer;) {
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
            border(5);
            return true;
        }
        border(5);
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
            border(5);
            return 1;
        } else if (userAnswer.equals(optionB)) {
            border(5);
            return 2;
        } else {
            border(5);
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