import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
    
        int a;
        int b;;
        char sign;
        int result = 1;
        int qwestion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите число - a:");
            a = sc.nextInt();
            System.out.println("Введите число - b:");
            b = sc.nextInt();
            System.out.println("Введите знак - sign:");
            sign = sc.next().charAt(0);
            Calculator calculator = new Calculator(a,b,sign,result);
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