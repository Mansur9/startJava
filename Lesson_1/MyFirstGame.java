public class MyFirstGame {
    public static void main(String[] args) {
        int endRange = 101; 
        int secretNumber = 0;
        int playerNumber = 66;
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
