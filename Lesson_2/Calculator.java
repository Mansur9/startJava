public class Calculator {
    private int num1;
    private int num2; 
    private char operation;
    private int result;
    private String answer;
    
    public Calculator(int a,  int b, char sign, int result) {
        num1 = a;        
        num2 = b;
        operation = sign;
        result = result;
        
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
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                break;
        }
        System.out.println("Результат операции: " + result);        
    }

    public String check(String qwestion) {
        answer = qwestion;
        if (answer == "yes") {
            System.out.println("Continue");
        } else if (answer == "not") {
            System.out.println("Bay Bay");
        } else {
            System.out.println("Нет такого варианта");
        }
        return answer;
    }
}