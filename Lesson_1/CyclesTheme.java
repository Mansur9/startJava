public class CyclesTheme {
    public static void main(String[] aerg) {
        System.out.println("Подсчет суммы четных и нечетных чисел");
        int endRange = 21;
        int startRange = -10;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        do {
            if(startRange % 2 == 0) { 
                sumOddNumber += startRange;
            } else {
                sumEvenNumber += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        System.out.println("Сумма четных = " +sumEvenNumber);
        System.out.println("Сумма нечетных = " + sumOddNumber);

        System.out.println("\nВывод чисел в интервале (min и max) в порядке убывания");
        // Вывод чисел в интервале (min и max) в порядке убывания
        // даны значения 10, 5, -1
        // найдите среди них max и min число
        // отобразите в консоль в одну строку, с помощью for, все числа в интервале (min, max) в порядке убывания
        // обратите внимание, что интервал — математический
        // использовать методы max и min класса Math — нельзя
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = 0;
        int min = 0; 
        
        if (number1 >= number2 && number1 >= number3) {
            max = number1;
        } else {
            min = number1;
        }
        if (number2 >= number3 && number2 >= number1) {
            max = number2;
        } else {
            min = number2;
        }
        if (number3 >= number1 && number3 >= number2 && number3 > 0) {
            max = number3;
        } else {
            number3 = number3 + 1;
            min = number3;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        for (int i = --max; i > min; i--) {
            System.out.print(i);
            
        }
        System.out.println();

        System.out.println("\nВывод реверсивного числа и суммы его цифр");
        // дано число 1234
        // в цикле while выделите каждую его цифру
        // подсчитайте сумму полученных цифр
        // отобразите в консоли:
        // исходное число в обратном порядке
        // сумму его цифр

        int srcNumber = 1234;
        int sumNumb = 0;
        int remNumb = 0;
        int revNumber = 0;
        while (srcNumber > 0){
            remNumb = srcNumber % 10;
            revNumber = remNumb * 10 + remNumb;
            sumNumb += revNumber;
            srcNumber /= 10;
            System.out.println(srcNumber);
        }
        System.out.println("Sum of digits of given number: " + sumNumb);
        System.out.println("Reverse of given number: " + revNumber);
        
    }
}