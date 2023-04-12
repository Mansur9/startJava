import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player playerFirst;
    private Player playerSecond;
    private int number;

    GuessNumber(Player player1, Player player2) {
        this.playerFirst = player1;
        this.playerSecond = player2;
    }

    public Player getPlayer1() {
        return playerFirst;
    }

    public Player getPlayer2() {
        return playerSecond;
    }

    public void start(Scanner sc) {
        generateNumb();
        System.out.println("Генерация числа... \nЧисло создалось, удачи!");
        Player activePlayer = playerFirst;
        System.out.println(playerFirst.getName());
        System.out.println(", введите число:");
        inputNumber(playerFirst,sc);
        // compareNumber(player);
        // int playerFirstNumb = sc.nextInt();
        // while (playerFirstNumb != secretNumber) {
        // if (playerFirstNumb > secretNumber) {
        //     System.out.println(playerFirstNumb + " меньше того, что загадал компьютер - " + secretNumber);
        // } else if (playerFirstNumb < secretNumber) {
        //     System.out.println(playerFirstNumb + " больше того, что загадал компьютер - " + secretNumber);
        // }
        
    }

    private boolean compareNumber(Player player1){
        int test = player1.getNumber();
        if(test != secretNumber){
            System.out.println("bla_bla_bla");
            return false;
        }
        System.out.println("you win");
        return true;
    }

    private static boolean inputNumber(Player player1, Scanner sc) {
        int number = sc.nextInt();
        return player1.setNumber(number);
   }

    private void generateNumb() {
        secretNumber = (int) (Math.random() * 101);
    }

    public boolean setNumber(int number) {
        this.number = number;
        if (number < 0 || number > 100) {
            return false;
        } else {
            return true;
        }
    }
}