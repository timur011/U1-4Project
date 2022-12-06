import java.util.Scanner;
public class ForestRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Direction toGo = new Direction();
        boolean key1Picked = false;
        boolean insideTavern = false;
        double money = 0;

        /* initial greeting */

        System.out.println("Greetings traveler!");
        /* small design  */
        for (int j = 4; j >= 1; j--) {

            for (int i = j; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("What is your name?");
        String playerName = input.nextLine();

        System.out.println(playerName + "\nYou have stumbled upon \n\nThe Great and Mysterious Magical Forest!");
        System.out.println("Surely you would like to continue your journey! Type in y for yes or n for no");
        String cont = input.nextLine();
        /*makes sure that the user enters in either yes or no */
        while (!cont.toUpperCase().equals("Y") && !cont.toUpperCase().equals("N")) {
            System.out.println("I'm not really sure what you mean by that");
            cont = input.nextLine();
        }
        if (cont.toUpperCase().equals("Y")) {


            System.out.println("Good choice!");
            toGo.sayDirection();
            String direction1 = input.nextLine();
            if (direction1.toUpperCase().equals("N")) {
                System.out.println("The Tavern:\n\nYou see a very cozy tavern in a clearing in the forest.  The door is slightly open.  Would you like to go in? (y/n)");
                String tavern = input.nextLine();
                while(!tavern.toUpperCase().equals("Y") && !tavern.toUpperCase().equals("N")){
                    System.out.println("Sorry, not sure what you mean by that");
                }
                if (tavern.toUpperCase().equals("Y")) {
                    insideTavern = true;
                    System.out.println("Inside: \n\nYou see a fireplace with some firewood burning inside.  The room is dim, but you see a key on the table.  Would you like to pick it up?(y/n)");
                    String pickKey1 = input.nextLine();

                    /* making sure that the user chooses either y or n */
                    while (!pickKey1.toUpperCase().equals("Y") && !pickKey1.toUpperCase().equals("N")) {
                        System.out.println("I'm not sure what you mean by that");
                        pickKey1 = input.nextLine();
                    }
                    if (pickKey1.toUpperCase().equals("Y")) {
                        key1Picked = true;
                        System.out.println("Good choice!");
                        System.out.println();
                        System.out.println("Shall we exit the cabin?(y, n)");
                        String exitCabin = input.nextLine();
                        if (exitCabin.toUpperCase().equals("Y")) {
                            System.out.println("Outside: ");

                            /* choosing to go to the cabin */

                            System.out.println("Would you like to go back east?(y / n)");
                            String southOrNot = input.nextLine();
                            while (!southOrNot.toUpperCase().equals("Y") && !southOrNot.toUpperCase().equals("N")) {
                                System.out.println("You must choose!");
                            }if (!southOrNot.toUpperCase().equals("Y")){
                                System.out.println("The Center: ");

                            }else if(!southOrNot.toUpperCase().equals("N")){
                                System.out.println("Uh Oh! You have been turned into a frog by The Witch.  Thank you for playing.");
                            }

                        }
                    } else if (pickKey1.toUpperCase().equals("N")) {
                        key1Picked = false;
                        System.out.println("Shall we exit the cabin?");
                    } else {
                        System.out.println("I don't understand");
                    }
                } else if (tavern.toUpperCase().equals("N")) {
                    toGo.tavernDirection();
                } else {
                    System.out.println("I don't understand.  Speak in a language I understand ");
                }
            } else if (direction1.toUpperCase().equals("E")) {
                System.out.println("The Great Oak: \n\nYou follow a path and approach a very large oak tree.  As you observe the tree, you find some branches that stoop down.  Would you like to climb the tree?");

                String climbOak = input.nextLine();
                while (!climbOak.toUpperCase().equals("Y") && !climbOak.toUpperCase().equals("N")) {
                    System.out.println("I am afraid you can not do that");
                    climbOak = input.nextLine();
                }
                if (climbOak.toUpperCase().equals("Y")) {
                    System.out.println();
                } else if (direction1.toUpperCase().equals("S")) {
                    System.out.println("Good choice! Now, where would you like to head? North(n), East(e), South(s), or West(w)?");


                } else if (direction1.toUpperCase().equals("W")) {
                    System.out.println("Uh oh.  You have been recruited by the Army Of Gnomes.  You try to escape, and it was a brave effort, but there is no escape from the Gnomes.  Thank you for playing");

                }


            } else if (cont.toUpperCase().equals("N")) {
                System.out.println("Too Bad. You've been eaten by the tree ogres.  Have a better game next time. ");
                System.out.println("Would you like to play again?");
                String againOrNot = input.nextLine();
                while (!againOrNot.toUpperCase().equals("Y") && !againOrNot.toUpperCase().equals("N")) {
                    System.out.println("I'm not sure what you mean by that");
                }


            }


        }
    }
}