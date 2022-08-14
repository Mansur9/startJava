public class CyclesTheme {
    public static void main(String[] aerg) {
        System.out.println("Подсчет суммы четных и нечетных чисел");
        int endRange = 21;
        int startRange = -10;
        int oldNumberSum = 0;
        int evenNumberCount = 0;
        do {
            startRange = startRange + 1;
            if(startRange % 2 == 0) { 
                evenNumberCount = evenNumberCount + startRange;
            } else {
                oldNumberSum = oldNumberSum + startRange;
            }
        } while (endRange >= startRange);
        System.out.println("Cумма четных = " +evenNumberCount);
        System.out.println("Сумма нечетных = " + oldNumberSum);
        System.out.println();

        System.out.println("Вывод чисел в интервале (min и max) в порядке убывания");
        // Вывод чисел в интервале (min и max) в порядке убывания
        // даны значения 10, 5, -1
        // найдите среди них max и min число
        // отобразите в консоль в одну строку, с помощью for, все числа в интервале (min, max) в порядке убывания
        // обратите внимание, что интервал — математический
        // использовать методы max и min класса Math — нельзя
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        
        if (number1 >= number2 || number1 >= number3 ) {
            int maxNumber = number1;
            System.out.println("max = number1 = " + number1);
        } else {
            System.out.println("max = number2 and number3 ");
            int maxNumber = number2;
        }
        if (number2 >= number3 || number2>=number1) {
            int maxNumber = number2;
            System.out.println("max = number2 = " + number2);
        } else {
            System.out.println("max = number3 and number2 = ");
        }
        if (number3 >= number1 || number3>=number2) {
            int maxNumber = number3;
            System.out.println("max = number2 = " + number3);
        } else {
            System.out.println("max = number1 and number2");
        }
        for (int i = 10; i >= 5; i--) {
        System.out.print(i);
        }   
        System.out.println();
    }
}