public class test {
    public static void main(String[] args) {
        int srcNumber = 123;
        int srcNumberSecond =321;
        int hundreds = (srcNumber / 100) % 10; //сотни - получаем одну ед сотен
        int dozens = (srcNumber / 10) % 10; //десятки - получаем десятки
        int ones = srcNumber % 10; //единицы - получаем единицы
        int hundredsSecond = (srcNumberSecond / 100) % 10; //сотни 
        int dozensSecond = (srcNumberSecond / 10) % 10; //десятки 
        int onesSecond = srcNumberSecond % 10; //единицы

        System.out.println(hundreds + " первое число;"); 
        System.out.println(dozens + " второе число");
        System.out.println(ones + " третье число" + "\n");
        System.out.println(hundredsSecond + " первое число;"); 
        System.out.println(dozensSecond + " второе число");
        System.out.println(onesSecond + " третье число");
        System.out.println();

        if (hundreds != hundredsSecond) {
            System.out.println("сотни не совпали");
        } else {
                System.out.println("совпали");
        }
        if (dozens != dozensSecond) {
            System.out.println("сотни не совпали");
        } else {
            System.out.println("совпали");
        }
        if (ones != onesSecond) {
            System.out.println("не совпали");
        } else {
            System.out.println("совпали");
        }
    }   
}
