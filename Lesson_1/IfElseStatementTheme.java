public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        // - перепишите псевдокод, приведенный ниже, с помощью Java
        // - используйте переменные, условные операторы, логическое НЕ
        // - придумайте сообщения и отобразите в консоли 
        int age = 28;
        int height = 178;
        boolean floor_man = true;
        
        if (age > 20) {
            System.out.println("You are supper old");
        } else {
            System.out.println("You're young");
        }

        if (floor_man != true) {
            System.out.println("You is girl");
        } 
        
        if (height < 180) {
            System.out.println("You have height < 180");
        } else {
            System.out.println("You have height > 180");
        }

        char item = "Mango".charAt(0);
        if(item == 'M') {
            System.out.println("open is letter - М");
        } else if (item == 'I') {
            System.out.println("open is letter - I");
        } else {
            System.out.println("you don't luck man!");
        }
        System.out.println(item);
        System.out.println();

        //Поиск max и min числа
        // - создайте две переменные, присвоив им любые числа
        // - найдите максимальное и минимальное число
        // - выведите числа на консоль, указав какое из них max и min
        System.out.println("search the max and min numbers ");
        int number1 = 23;
        int number2 = 30;
        if (number1 > number2) {
            System.out.println("It is min number1 = " + number1);
        }
        if (number1 < number2) {
            System.out.println("It is max number2 = " + number2);
        }
        System.out.println("max number = " + number2 + "\n" + "min number = " + number1);
        System.out.println();

        // Работа с числом
        // - создайте переменную с любым числом
        // - определите, являться ли оно:
                // - нулем
                // - четным (нечетным)
                // - отрицательным (положительным)
        // - если число равно 0, то остальные проверки не должны осуществляться
        // - отобразите полученные результаты
        int numberZero = 0;
        int numberAny = 222;
        if (numberZero == 0) { 
            System.out.println("number zero = true");
        } else if ((numberAny%2) == 0 && numberAny >= 0){ 
            System.out.println("Is is number even = " + numberAny);
            System.out.println("Is is number positive = " + numberAny);
        } else {
            System.out.println("!zero" + "odd" + " negative number");
        }
    }
}