public class Calculator {
    private int num1;
    private int num2; 
    private char operation;
    private int result;
    
    public void calculate(int a,  int b, char sign) {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
            case '^':
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                break;
        }
        System.out.println("Результат операции: " + result);     
    }
}