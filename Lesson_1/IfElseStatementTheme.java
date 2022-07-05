public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        // - перепишите псевдокод, приведенный ниже, с помощью Java
        // - используйте переменные, условные операторы, логическое НЕ
        // - придумайте сообщения и отобразите в консоли 
        int age = 28;
        int height = 178;
        boolean maleGender = true;
        
        if (age > 20) {
            System.out.println("You are supper old");
        } else {
            System.out.println("You're young");
        }

        if (!maleGender) {
            System.out.println("You is girl");
        } 
        
        if (height < 180) {
            System.out.println("You have height < 180");
        } else {
            System.out.println("You have height > 180");
        }

        char letterFirst = "Mango".charAt(0);
        if(letterFirst == 'M') {
            System.out.println("open is letter - М");
        } else if (letterFirst == 'I') {
            System.out.println("open is letter - I");
        } else {
            System.out.println("you don't luck man!");
        }
        System.out.println(letterFirst + "\n");
        

        //Поиск max и min числа
        // - создайте две переменные, присвоив им любые числа
        // - найдите максимальное и минимальное число
        // - выведите числа на консоль, указав какое из них max и min
        System.out.println("search the max and min numbers ");
        int number1 = 23;
        int number2 = 30;
        
        if (number1 > number2) {
            System.out.println("number1 > number2");
        } else {
            System.out.println("number1 < number2");
        }
        System.out.println("max number = " + Math.max(number1,number2));
        System.out.println("min number = " + Math.min(number1,number2));
        System.out.println();

        // Работа с числом
        // - создайте переменную с любым числом
        // - определите, являться ли оно:
                // - нулем
                // - четным (нечетным)
                // - отрицательным (положительным)
        // - если число равно 0, то остальные проверки не должны осуществляться
        // - отобразите полученные результаты
        int numberAny = -222;

        if (numberAny == 0) { 
            System.out.println("равен нулю");
        } else if (numberAny > 0 && (numberAny % 2) == 0 ) {
            System.out.println("положительное четно число");
        } else if (numberAny < 0 && (numberAny % 2) == 0) {
            System.out.println("отрицателньое четное число");
        } else if (numberAny > 0 && (numberAny % 2) != 0 ) {
            System.out.println("положительное нечетно число");
        } else if (numberAny < 0 && (numberAny % 2) != 0) {
            System.out.println("отрицателньое нечетное число");
        } 
    }
}