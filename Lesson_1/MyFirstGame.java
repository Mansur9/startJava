public class MyFirstGame {
    public static void main(String[] args) {
        int numberRandomLimit = 101;
        int numberRandom = -1;
        int number = 66;
        while (numberRandom != number) {
            numberRandom = (int)(Math.random() * numberRandomLimit);
            if (numberRandom > number) {
                System.out.println(number + " меньше того, что загадал компьютер - " + numberRandom);
            } else if (numberRandom < number) {
                System.out.println(number + " больше того, что загадал компьютер - " + numberRandom);
            }
        if (numberRandom == number){
            System.out.println("Вы победили!");   
            }
        }
    }
}
