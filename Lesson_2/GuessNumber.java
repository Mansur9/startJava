import java.util.Scanner;

public class GuessNumber {

    private int secretNumber;
    private String player1;
    private String player2;

    GuessNumber(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getplayer1() {
        return player1;
    }

    public String getplayer2() {
        return player2;
    }
    
    // while (playerSecond != secretNumber) {
    //     secretNumber = (int) (Math.random() * endRange);
    //     if (playerSecond > secretNumber) {
    //         System.out.println(playerSecond + " меньше того, что загадал компьютер - " + secretNumber);
    //     } else if (playerSecond < secretNumber) {
    //         System.out.println(playerSecond + " больше того, что загадал компьютер - " + secretNumber);
    //     }
    // }

    private void generateNumb() {
        secretNumber = (int) (Math.random() * 101);
    }
}