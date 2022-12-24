import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
    
        int a;
        int b;;
        char sign;
        int result = 1;
        String qwestion;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число - a:");
        a = sc.nextInt();
        System.out.println("Введите число - b:");
        b = sc.nextInt();
        System.out.println("Введите знак - sign:");
        sign = sc.next().charAt(0);
        Calculator calculator = new Calculator(a,b,sign,result);
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        qwestion = sc.next();
        calculator.check(qwestion);
        // System.out.println(qwestion);
    }
}