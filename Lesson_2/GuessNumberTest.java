import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int endRange = 101; 
        int secretNumber = 0;
        int 
        int playerNumber = sc.nextInt();
        while (playerNumber != secretNumber) {
            secretNumber = (int) (Math.random() * endRange);
            if (playerNumber > secretNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер - " + secretNumber);
            } else if (playerNumber < secretNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер - " + secretNumber);
            }
        }
    }
    private static boolean check(Scanner sc) {
        while (true) {
        switch (sc.nextLine().trim().toLowerCase()) {
                case "yes":
                    return true;
                case "no":
                    return false;
                default:
                    System.out.println("Ошибка: допустимые варианты только YES или NO!");
            }
        }
    }
}