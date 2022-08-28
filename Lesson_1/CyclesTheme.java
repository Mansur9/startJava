public class CyclesTheme {
    public static void main(String[] aerg) {
        System.out.println("Подсчет суммы четных и нечетных чисел");
        int endRange = 21;
        int startRange = -10;
        int evenSumNumber = 0;
        int oddNumberCount = 0;
        do {
            startRange++;
            if(startRange % 2 == 0) { 
                oddNumberCount = oddNumberCount + startRange;
            } else {
                evenSumNumber = evenSumNumber + startRange;
            }
        } while (startRange <= endRange);
        System.out.println("Сумма четных = " +evenSumNumber);
        System.out.println("Сумма нечетных = " + oddNumberCount);

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
        
        if (number1 >= number2 && number1 >= number3 ) {
            max = number1;
        } else {
            min = number1;
        }
        if (number2 >= number3 && number2 >= number1) {
            max = number2;
        } else {
            min = number2;
        }
        if (number3 >= number1 && number3 >= number2) {
            max = number3;
        } else {
            min = number3;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        for (int i=max; i>min; i--) {
            if (i >=0 && i<=9){
            System.out.print(i);
            }
        }
        System.out.println();

        System.out.println("\nдано число 1234");
        // в цикле while выделите каждую его цифру
        // подсчитайте сумму полученных цифр
        // отобразите в консоли:
        // исходное число в обратном порядке
        // сумму его цифр

        int srcNumber = 1234;
        int i = 0;
        int sumNumb = 0;
        while (i <= 0){
            i++;
            int digitsHundreds = srcNumber % 10;
            System.out.println(digitsHundreds); 
            int digitsDozens = (srcNumber / 10) % 10;
            System.out.println(digitsDozens);
            int digitsOnes = (srcNumber / 100) % 10; 
            System.out.println(digitsOnes);
            int digitsZero = (srcNumber / 1000) % 10;
            System.out.println(digitsZero);
            System.out.println(digitsZero + digitsOnes + digitsDozens + digitsHundreds);
        }
    }
}