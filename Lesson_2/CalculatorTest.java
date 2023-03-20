import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        int a;
        int b;;
        char sign;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите число - a:");
            a = sc.nextInt();
            System.out.println("Введите число - b:");
            b = sc.nextInt();
            System.out.println("Введите знак - sign:");
            sign = sc.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.doCalc(a,b,sign);
        } while (isNext(sc)); {
            System.out.println("Получени ответ - no, Выключение программы.");
        }
    }

     private static boolean isNext(Scanner sc) {
        System.out.println("допустимые варианты только YES или NO!");
        sc.nextLine().trim().toLowerCase();
        while (true) {
            String answer = sc.nextLine().trim().toLowerCase();
            if (answer.equals("no")) {
                return false;
            } else {
                return true;
            }
        }
    }
}