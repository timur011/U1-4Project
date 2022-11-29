import java.util.Scanner;
public class ForestRunner {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings traveler!");
        for(int j = 4; j >= 1; j--){

            for (int i = j; i > 0; i--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("You have stumbled \n\nUpon the Great and Mysterious Magical Forest!");
        System.out.println("Surely you would like to continue your journey! Type in y for yes or n for no");
        String cont = input.nextLine();
        if(cont.toUpperCase().equals("Y")){
            System.out.println("Good choice! Now, where would you like to head? North(n), East(e), South(s), or West(w)?");
            String direction1 = input.nextLine();
            if(direction1.toUpperCase().equals("Y")
        }else if(cont.toUpperCase().equals("N")){
            System.out.println("Uh oh! it seems like you have angered the Great Tree Ogres! Surely you would like to run(y or n)");
            String runOrNot = input.nextLine();
        }


    }
}
