public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        // - перепишите псевдокод, приведенный ниже, с помощью Java
        // - используйте переменные, условные операторы, логическое НЕ
        // - придумайте сообщения и отобразите в консоли 
        System.out.println("Перевод псевдокода на язык Java (это название задачи)");
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
        System.out.println("Поиск max и min числа");
        System.out.println("search the max and min numbers ");
        int number1 = 23;
        int number2 = 30;
        
        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else {
            System.out.println(number1 + " < " + number2);
        }
        System.out.println();

        // Работа с числом
        // - создайте переменную с любым числом
        // - определите, являться ли оно:
                // - нулем
                // - четным (нечетным)
                // - отрицательным (положительным)
        // - если число равно 0, то остальные проверки не должны осуществляться
        // - отобразите полученные результаты
        System.out.println("Работа с числом");
        int numberAny = -222;
        
        if (numberAny != 0) { 
            if (numberAny > 0) {
                System.out.println("четно число");
            } else {
                System.out.println("нечетно число");
            } if (numberAny > 0) {
                System.out.println("положительное число");
            } else {
                System.out.println("отрицательное число");
            }
        } else {
            System.out.println("Равен нулю" + "\n3");
        }

        // Поиск одинаковых цифр в числах
        // создайте две переменные, присвоив им два трехзначных целых числа
        // найдите в них одинаковые цифры, стоящие в одном и том же разряде
        // отобразите на консоль:
        //  - исходные числа
        //  - одинаковые в них цифры
        //  - номера разрядов
        System.out.println("Поиск одинаковых цифр в числах");
        int srcNumber = 123;
        int srcNumber2 = 321;
        int digitsHundreds = srcNumber % 10; //сотни - получаем одну ед сотен
        System.out.println(digitsHundreds + " первое число;"); 
        int digitsDozens = (srcNumber / 10) % 10; //десятки - получаем десятки
        System.out.println(digitsDozens + " второе число");
        int digitsOnes = srcNumber % 10; //единицы - получаем единицы
        System.out.println(digitsOnes + " третье число" + "\n");
        int digitsHundredsSecond = (srcNumber2 / 100) % 10; //сотни 
        System.out.println(digitsHundredsSecond + " первое число;"); 
        int digitsDozensSecond = (srcNumber2 / 10) % 10; //десятки 
        System.out.println(digitsDozensSecond + " второе число");
        int digitsOnesSecond = srcNumber2 % 10; //единицы
        System.out.println(digitsOnesSecond + " третье число");
        System.out.println();

        if (digitsHundreds != digitsHundredsSecond) {
            System.out.println("первые числа не совпали");
        } else {
                System.out.println("первые числа совпали " + digitsHundreds);
        }
        if (digitsDozens != digitsDozensSecond) {
            System.out.println("вторые число не совпали");
        } else {
            System.out.println("вторые числа совпали " + digitsDozens);
        }
        if (digitsOnes != digitsOnesSecond) {
            System.out.println("третьи числа не совпали");
        } else {
            System.out.println("третьи числа совпали" + digitsOnes);
        }
        String intBitsHundreds = Integer.toBinaryString(digitsHundreds);
        System.out.println("Разряды числа: " + intBitsHundreds);
        String intBitsDozens = Integer.toBinaryString(digitsDozens);
        System.out.println("Разряды числа: " + intBitsDozens);
        String intBitsOnes = Integer.toBinaryString(digitsOnes);
        System.out.println("Разряды числа: " + intBitsOnes);
        String intBitsHundredsSecond = Integer.toBinaryString(digitsHundredsSecond);
        System.out.println("Разряды числа: " + intBitsHundredsSecond);
        String intBitsDozensSecond = Integer.toBinaryString(digitsDozensSecond);
        System.out.println("Разряды числа: " + intBitsDozensSecond);
        String intBitSonesSecond = Integer.toBinaryString(digitsOnesSecond);
        System.out.println("Разряды числа: " + intBitSonesSecond + "\n");

        // Определение буквы, числа или символа по их коду
        // создайте переменную типа char
        // присвойте ей значение ‘\u0057’
        // определите — это код буквы, числа или другого символа
        // использовать для этого методы классов Java запрещено!
        // выведите в консоль сам символ и информацию о нем:
        // маленькая (большая) буква
        // это число
        // не буква и не число
        System.out.println("Определение буквы, числа или символа по их коду");
        String symbol = "@U0057";
        char ch1 = symbol.charAt(0);
        char ch2 = symbol.charAt(1);
        char ch3 = symbol.charAt(2);
        char ch4 = symbol.charAt(3);
        char ch5 = symbol.charAt(4);
        char ch6 = symbol.charAt(5);
        System.out.print(ch1);
        if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch1 >= '0' && ch1 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }
        System.out.print(ch2);
        if ((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch2 >= '0' && ch2 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }
        System.out.print(ch3);
        if ((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch3 >= '0' && ch3 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }
        System.out.print(ch4);
        if ((ch4 >= 'a' && ch4 <= 'z') || (ch4 >= 'A' && ch4 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch4 >= '0' && ch4 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }
        System.out.print(ch5);
        if ((ch5 >= 'a' && ch5 <= 'z') || (ch5 >= 'A' && ch5 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch5 >= '0' && ch5 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }
        System.out.print(ch6);
        if ((ch6 >= 'a' && ch6 <= 'z') || (ch6 >= 'A' && ch6 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch6 >= '0' && ch6 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }

    }
}