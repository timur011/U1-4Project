public class Game {
    private int money ;

    public Game(){
        money = 0;
    }
    public Game(int money){
        this.money = money;

    }
    public int moneyEarned(int luckyNumber){
        if((luckyNumber % 2) == 0){
            money *= 2;
            return money;
        }else{
            money -= 5;
            return money;
        }
    }
    public void amountMoney(){
        System.out.println("You have " + money + "money");

    }
}
