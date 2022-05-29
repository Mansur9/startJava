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
    }
}
