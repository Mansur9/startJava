public class Calculator {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        int result = 1;
        char sign = '+';
        if (sign == '+') {
            result = a + b;
        } else if  (sign == '-') {
            result = a - b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            for (int i = 1; i <= b; i++)
			result *= a;
        }
        System.out.println(a + " " + sign + " " + b + " = "+ result);
    }
}
