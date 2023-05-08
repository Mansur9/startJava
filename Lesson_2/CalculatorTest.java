import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите число - a:");
            int a = sc.nextInt();
            System.out.println("Введите число - b:");
            int b = sc.nextInt();
            System.out.println("Введите знак - sign:");
            char sign = sc.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculate(a, b, sign);
            System.out.println("повторим?");
            System.out.println("допустимые варианты только [yes/no]!");
            input = sc.next().toUpperCase();
            if (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")) {
                System.out.println("bla bla bla" + "\n" + "Ошибка: допустимые варианты только [yes/no]!");
            }
        } while (input.equalsIgnoreCase("yes"));
        System.out.println("программа завершилась");    
    }
}