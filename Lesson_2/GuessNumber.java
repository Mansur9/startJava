import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private String player1;
    private String player2;
    int number;

    GuessNumber(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void start(Scanner sc) {
        generateNumb();
        String activePlayer = player1;
        System.out.println("Generation number ... \nNumber is creat! Good luck!");
        System.out.println("\n" + getPlayer1() + ", введите число:");
        System.out.println(number);
    }

    private void generateNumb() {
        secretNumber = (int) (Math.random() * 101);
    }

//    private boolean inputNumber(Scanner sc, int player1) {
//        int num = sc.nextInt();
////        return player1.setNumber(number);
//        return true;
//    }

    public boolean setNumber(int number) {
        this.number = number;
        if (number < 0 || number > 100) {
            return false;
        } else {
            return true;
        }
    }
}