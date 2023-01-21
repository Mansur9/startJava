import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру");
        Scanner sc = new Scanner(System.in);
        int endRange = 101; 
        int secretNumber = 0;
        System.out.println("Имя первого игрока:");
        String playerOne = sc.nextLine();
        System.out.println("Имя второго игрока:");
        String playerTwo = sc.nextLine();
        
        int playerFirstNumb = sc.nextInt();

        while (playerFirstNumb != secretNumber) {
            secretNumber = (int) (Math.random() * endRange);
            if (playerFirstNumb > secretNumber) {
                System.out.println(playerFirstNumb + " меньше того, что загадал компьютер - " + secretNumber);
            } else if (playerFirstNumb < secretNumber) {
                System.out.println(playerFirstNumb + " больше того, что загадал компьютер - " + secretNumber);
            }
        check(sc);    
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