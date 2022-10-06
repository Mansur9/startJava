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
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = c;
        if (a > max) {
            max = a;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            c = min;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
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
        int sumNumber = 0;
        int digit = 0;
        int revNumber = 0;
        while (srcNumber > 0) {
            digit = srcNumber % 10;
            revNumber = revNumber * 10 + digit;
            sumNumber += digit;
            srcNumber /= 10;
        }
        System.out.println("Sum of digits of given number: " + sumNumber);
        System.out.println("Reverse of given number: " + revNumber);

        System.out.println("\nВывод чисел на консоль в несколько строк");
        int countInRow = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 == 1) {
                countInRow++;
                System.out.printf("%10s", i);
            }
            if (countInRow == 5) {
                System.out.println();
                countInRow = 0;
            }
        }
        if (countInRow != 0) {
            while (countInRow < 5) {
                System.out.printf("%10s", 0);
                countInRow++;
            }
        }
        System.out.println("\nПроверка количества единиц на четность");
    }
}