import java.util.Scanner;
public class ForestRunner {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Direction toGo = new Direction();
        System.out.println("Greetings traveler!");
        for(int j = 4; j >= 1; j--){

            for (int i = j; i > 0; i--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("You have stumbled upon \n\nThe Great and Mysterious Magical Forest!");
        System.out.println("Surely you would like to continue your journey! Type in y for yes or n for no");
        String cont = input.nextLine();
        if(cont.toUpperCase().equals("Y")){


            System.out.println("Good choice!");
            toGo.sayDirection();
            String direction1 = input.nextLine();
            if(direction1.toUpperCase().equals("N")){
                System.out.println("The Tavern:\n\nYou see a very cozy tavern in a clearing in the forest.  The door is slightly open.  Would you like to go in? (y/n)");

            }

            else if(direction1.toUpperCase().equals("E")){
                System.out.println("Good choice! Now, where would you like to head? North(n), East(e), South(s), or West(w)?");
                }


            else if(direction1.toUpperCase().equals("S")){
                System.out.println("Good choice! Now, where would you like to head? North(n), East(e), South(s), or West(w)?");
                }


            else if(direction1.toUpperCase().equals("W")){
                System.out.println("Good choice! Now, where would you like to head? North(n), East(e), South(s), or West(w)?");
                }


        }else if(cont.toUpperCase().equals("N")){
            System.out.println("Uh oh! it seems like you have angered the Great Tree Ogres! Surely you would like to run(y or n)");
            String runOrNot = input.nextLine();
        }


    }
}
