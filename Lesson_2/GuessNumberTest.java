import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        int number = 11;


        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Добро пожаловать в игру");
            System.out.println("Первый игрок - укажите имя :");
            Player player1 = new Player(sc.nextLine());
            System.out.println("Второй игрок - укажите имя :");
            Player player2 = new Player(sc.nextLine());
            GuessNumber GuessNumber = new GuessNumber(player1,player2);
            GuessNumber.start(sc);
        } while (check(sc)); {
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