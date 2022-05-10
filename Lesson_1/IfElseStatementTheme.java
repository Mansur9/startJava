public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        // - перепишите псевдокод, приведенный ниже, с помощью Java
        // - используйте переменные, условные операторы, логическое НЕ
        // - придумайте сообщения и отобразите в консоли 

        System.out.println("Перевод псевдокода на язык Java - это название задачи");
        int item = 28;
        int height = 178;
        Boolean man = true;
        
        if (item > 20) {
            System.out.println("You are supper old");
        } else {
            System.out.println("Small boy or girl");
        }

        if (!man) {
            System.out.println("You is girl");
        } else {
            System.out.println("No, you is man");
        }
        
        if (height < 1.80) {
            System.out.println("small height");
        } else {
            System.out.println("very height");
        }

        char c = "Mansur".charAt(0);
        if(c == 'M') {
            System.out.println("open is letter - М");
        } else if (c == 'a') {
            System.out.println("open is letter - I");
        } else {
            System.out.println("you don't luck man!");
        }
        System.out.println(c);

        //Поиск max и min числа
        // - создайте две переменные, присвоив им любые числа
        // - найдите максимальное и минимальное число
        // - выведите числа на консоль, указав какое из них max и min

        System.out.println("search the max and min numbers ");
        int number1 = 23;
        int number2 = 30;
        if (number1 == 23) {
            System.out.println("It is min number = " + number1);
        }
        if (number2 == 30) {
            System.out.println("It is max number = " + number2);
        }
        System.out.println("max number = " + number2 + "\n" + "min number = " + number1);

        // Работа с числом
        // - создайте переменную с любым числом
        // - определите, являться ли оно:
                // - нулем
                // - четным (нечетным)
                // - отрицательным (положительным)
        // - если число равно 0, то остальные проверки не должны осуществляться
        // - отобразите полученные результаты
        System.out.println("Работа с числом");
        int number11 = 2222222;
        if (number11 != 0 && number11 > 0) {
            System.out.println("Is is number = " + number11 + ", positive number");
            int add = number11 % 2;
            if (add == 0) System.out.println("the number is even");
        }
        else {
            System.out.println("finish," + " negative number");
            }
        
    
    }
}