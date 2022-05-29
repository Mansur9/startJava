public class MyFirstApp {   
    public static void main(String[] args) {
        System.out.println("Hello, world");
        int number11 = - 2222222;
        
        if (number11 != 0 && number11 > 0) {
            System.out.println("Is is number = " + number11 + ", positive number");
            int add = number11 % 2;
            if (add == 0) System.out.println("the number is even");
        } else {
            System.out.println("finish," + " negative number");
        }
        int a = 7;
        int b = 5;
        int c = a ^ b;
        System.out.println(b);
        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа: " + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
    }
}
