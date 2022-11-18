public class MyFirstGame {
    public static void main(String[] args) {
        int endRange = 101; 
        int secretNumber = 0;
        int playerNumber = 66;
        while (playerNumber != secretNumber) {
            secretNumber = (int) (Math.random() * endRange);
            if (playerNumber > secretNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер - " + secretNumber);
            } else if (playerNumber < secretNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер - " + secretNumber);
            }
        }
        System.out.println("Вы победили!");
    }
}
