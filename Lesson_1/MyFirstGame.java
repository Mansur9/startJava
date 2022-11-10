public class MyFirstGame {
    public static void main(String[] args) {
        int endRange = 101; // numberRandomLimit назови endRange
        int secretNumber = 0; // numberRandom назови secretNumber
        int playerNumber = 66; // number назови playerNumber
        while (secretNumber != playerNumber) {
            secretNumber = (int)(Math.random() * endRange);
            if (secretNumber > playerNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер - " + secretNumber);
            } else if (secretNumber < playerNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер - " + secretNumber);
            }
        }
            System.out.println("Вы победили!");
    }
}
