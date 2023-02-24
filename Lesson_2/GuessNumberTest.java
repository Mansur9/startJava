import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        int number = 11;
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Добро пожаловать в игру");
            System.out.println("Первый игрок - укажите имя :");
            Player player1 = new Player (sc.nextLine());
            System.out.println("Второй игрок - укажите имя :");
            Player player2 = new Player (sc.nextLine());
            GuessNumber game = new GuessNumber(player1,player2);
            
            String answer = "yes";
            do {
                System.out.println("играем?");
                game.start(sc);
                System.out.println("Повторим?");
                
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
                    System.out.println("Ошибка: допустимые варианты только yes или no!");
            }
        }
    }
}