public class Calculator {
    private int num1;
    private int num2; 
    private char operation;
    private int result;
    
    public Calculator(int a,  int b, char sign, int result) {
        this.num1 = a;        
        this.num2 = b;
        this.operation = sign;
        this.result = result;
        
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
            case '^':
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                break;
        }
        System.out.println("Результат операции: " + result);
    }
}