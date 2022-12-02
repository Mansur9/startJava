public class CalculatorTest {
    public static void main(String[] aerg) {
        a = 9;
        b = 2;
        result = 1;
        sign = '+';

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
    }
}