public class Game {
    private int money ;

    public Game(){


        money = 10;
    }
    public Game(int money){
        this.money = money;

    }
    public int moneyEarned(int luckyNumber){
        if((Math.sqrt(luckyNumber) == 0)){
            money *= 2;
            return money;
        }else if((money % 2) == 0){
            money *= 5;
            return money;
        }else{
            money -= 5;
            return money;
        }
    }
    public String toString(){
        String returnString = "You have " + money + "money";
        return returnString;

    }
}
