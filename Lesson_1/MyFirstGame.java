public class MyFirstGame {
    public static void main(String[] args) {
        int numberLimit = 100;
        int number = (int)(Math.random() * numberLimit);
        int digit = 15;
        while (true) {
            if (number == digit) {
                System.out.println("Вы победили!");
                break;
            } else if (number > digit) {
                System.out.println(digit + " меньше того, что загадал компьютер - " + number);
                break;
            } else if (number < digit) {
                System.out.println(digit + " больше того, что загадал компьютер - " + number);
                break;
            }
        }
    }
}
