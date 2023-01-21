import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    int endRange = 101; 
    int secretNumber = 0;
    int playerFirst = sc.nextInt();
    int playerSecond = sc.nextInt();
    while (playerSecond != secretNumber) {
        secretNumber = (int) (Math.random() * endRange);
        if (playerSecond > secretNumber) {
            System.out.println(playerSecond + " меньше того, что загадал компьютер - " + secretNumber);
        } else if (playerSecond < secretNumber) {
            System.out.println(playerSecond + " больше того, что загадал компьютер - " + secretNumber);
        }
    }
} 