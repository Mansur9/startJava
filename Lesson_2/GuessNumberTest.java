import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String player1;
        String player2;
        int number = 11;


        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Добро пожаловать в игру");
            System.out.println("Первый игрок");
            player1 = sc.nextLine();
            System.out.println("Второй игрок");
            player2 = sc.nextLine();
            GuessNumber GuessNumber = new GuessNumber(player1,player2);
            number = sc.nextInt();

        } while (number == 1); {
            System.out.println("Выключение.");
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