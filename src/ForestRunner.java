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

        /* This means that the user will ontinue to play the game */


        if (cont.toUpperCase().equals("Y")) {


            System.out.println("Good choice!");

            /* First choice about the direction the user has to go */
            toGo.sayDirection();
            String direction1 = input.nextLine();
            direction1 = input.nextLine();

            /*This means that the user will continue North */


            if (direction1.toUpperCase().equals("N")) {
                System.out.println("The Tavern:\n\nYou see a very cozy tavern in a clearing in the forest.  The door is slightly open.  Would you like to go in? (y/n)");
                String tavern = input.nextLine();

                /* Whether to enter the tavern or not */

                while (!tavern.toUpperCase().equals("Y") && !tavern.toUpperCase().equals("N")) {
                    System.out.println("Sorry, not sure what you mean by that");
                }

                /*The user goes into the tavern */

                String pickKey1 = null;
                if (tavern.toUpperCase().equals("Y")) {
                    insideTavern = true;
                    System.out.println("Inside: \n\nYou see a fireplace with some firewood burning inside.  The room is dim, but you see a key on the table.  Would you like to pick it up?(y/n)");
                    pickKey1 = input.nextLine();

                    /* making sure that the user chooses either y or n */
                    while (!pickKey1.toUpperCase().equals("Y") && !pickKey1.toUpperCase().equals("N")) {
                        System.out.println("I'm not sure what you mean by that");
                        pickKey1 = input.nextLine();
                    }

                    /* This is if the user picks up the key */


                    if (pickKey1.toUpperCase().equals("Y")) {
                        key1Picked = true;
                        System.out.println("Good choice!");
                        System.out.println();
                        System.out.println("Outside: ");

                        System.out.println("Would you like to go back south?(y / n)");

                        String southOrNot = input.nextLine();

                        /* making sure that the user enters a direction */

                        while (!southOrNot.toUpperCase().equals("Y") && !southOrNot.toUpperCase().equals("N")) {
                            System.out.println("You must choose!");
                        }
                        /* This is if the user decides to go south */

                        if (southOrNot.toUpperCase().equals("Y")) {
                            System.out.println("The Center: ");
                            System.out.println("Now we shall head west");

                            /* checking to see whether the player has the key or not */

                            if (key1Picked) {
                                System.out.println("The Game: ");
                                System.out.println("This is your chance to win big money");
                                Game game1 = new Game();
                                Game game2 = new Game(50);
                                System.out.println("First, you have to choose a number.  1 or 2?");
                                int whichGame = input.nextInt();

                                if (whichGame == 1) {
                                    System.out.println("Now what will be your lucky number?");
                                    int luckyNumber = input.nextInt();
                                    game1.moneyEarned(luckyNumber);
                                    System.out.println(game1.toString());
                                    System.out.println("Thanks!");

                                } else if (whichGame == 2) {
                                    System.out.println("Now what will be your lucky number?");
                                    int luckyNumber2 = input.nextInt();
                                    game2.moneyEarned(luckyNumber2);
                                    System.out.println(game2.toString());
                                    System.out.println("Thanks!");
                                } else {
                                    System.out.println("You have failed to enter a simple number and therefore will not play.  Your money is 0.  Have a nice day.");
                                }

                                /* This is if the user did not pick up the key */

                            } else {
                                System.out.println("Unfortunately you failed to pick up the key.  Therefore you will not play.  Goodbye. ");

                                /* This is if the user decides not to go south */

                            }
                        }
                        else if (southOrNot.toUpperCase().equals("N")) {
                            System.out.println("Uh Oh! You have been turned into a frog by The Witch.  Thank you for playing.");
                        }

                    }
                } else if (pickKey1.toUpperCase().equals("N")) {
                    key1Picked = false;
                    System.out.println("Shall we exit the cabin?");
                } else {
                    System.out.println("I don't understand");

                }
                if (tavern.toUpperCase().equals("N")) {
                    toGo.tavernDirection();
                }
            } else if (direction1.toUpperCase().equals("E")) {
                System.out.println("The Great Oak: \n\nYou follow a path and approach a very large oak tree.  As you observe the tree, you find some branches that stoop down");
                System.out.println("You decide you are an adrenaline seeker, you decide to climb the tree and fall down. Very unfortunate.  Try again next time.");


            } else if (direction1.toUpperCase().equals("S")) {
                System.out.println("You follow a trail and get lost in the woods.  You encounter a group of trolls and decide to live a long and happy life with them.");


            } else if (direction1.toUpperCase().equals("W")) {
                System.out.println("Uh oh.  You have been recruited by the Army Of Gnomes.  You try to escape, and it was a brave effort, but there is no escape from the Gnomes.  Thank you for playing");
            } else if (cont.toUpperCase().equals("N")) {
                System.out.println("Too Bad. You've been eaten by the tree ogres.  Have a better game next time. ");

            }


        }


    }
}