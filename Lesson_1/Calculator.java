public class Calculator {
    public static void main(String[] args) {
        int a = 12234;
        int b = 452453;
        int result;
        String sign = "*";
        if (sign == "+") {
            result = a + b;
            System.out.println(a + " " + sign + " " + b + " = "+ result);
        } else if  (sign == "-") {
            result = a - b;
            System.out.println(a + " " + sign + " " + b + " = "+ result);
        } else if (sign == "/") {
            result = a / b;
            System.out.println(a + " " + sign + " " + b + " = "+ result);
        } else if (sign == "*") {
            result = a * b;
            System.out.println(a + " " + sign + " " + b + " = "+ result);
        }
    }
}
