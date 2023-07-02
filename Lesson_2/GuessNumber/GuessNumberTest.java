import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру");
        System.out.println("Первый игрок - укажите имя :");
        Player player1 = new Player(sc.next());
        System.out.println("Второй игрок - укажите имя :");
        Player player2 = new Player(sc.next());
        GuessNumber GuessNumber = new GuessNumber(player1, player2);
        System.out.println(GuessNumber.getPlayer1());
        
        // GuessNumber.start(sc);
        // System.out.println("Повторим? - [yes/no]");
        // check(sc);
        System.out.println("Выключение.");
        
    }
    private static boolean check(Scanner sc) {
        // sc.nextLine().trim().toLowerCase();
        String answer = sc.nextLine().trim().toLowerCase();
        while (true) {
         switch (answer) {
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