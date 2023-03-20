import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите число - a:");
            int a = sc.nextInt();
            System.out.println("Введите число - b:");
            int b = sc.nextInt();
            System.out.println("Введите знак - sign:");
            char sign = sc.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculate(a,b,sign);
        } while (isNext(sc));
            System.out.println("Получени ответ - no, Выключение программы.");
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