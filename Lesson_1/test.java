public class test {
    public static void main(String[] args) {
         // Перестановка значений переменных
         System.out.println("*Перестановка значений переменных*");
         double number1 = 1.1;
         double number2 = 2.2;
         System.out.println("Меняем с помощью третьей переменной");
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         double buffer = number2;
         number2 = number1;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         number2 = buffer;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         System.out.println("с помощью арифметических операций");
         number1 = number1 + number2;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         number2 = number1 - number2;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         number1 = number1 - number2;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         System.out.println("C помощью побитовой операции");
        //  number1;
        //  number2;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         number1 = (char)number1 ^ (char)number2;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         number2 = (short)number1 ^ (short)number2;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         number1 = (char)number1 ^ (char)number2;
         System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
         System.out.println();
    }
}
