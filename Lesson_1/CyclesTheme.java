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
    }
}