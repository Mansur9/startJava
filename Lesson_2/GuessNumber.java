import java.util.Scanner;

public class GuessNumber {

    private int secretNumber;
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Scanner sc) {
        generateNumb();
        Player activePlayer = player1;
        System.out.println("Generation number ... \nNumber is creat! Good luck!");
        System.out.println("\n" + activePlayer.getName() + ", введите число:");
        if (inputNumber(sc, activePlayer)) {
            if(chechNumber(activePlayer) == true) {
                System.out.println("Ваше число принято");
            }
            else if(activePlayer == player1) {
                activePlayer = player2;
            }
            else activePlayer = player2;
        }
    }

    private void generateNumb() {
        secretNumber = (int) (Math.random() * 101);
    }

    private boolean inputNumber(Scanner sc, Player player) {
        int num = sc.nextInt();
        return player1.setNumber(num);
    }

    private boolean chechNumber(Player player) {
        if (player.getNumber() != secretNumber) {
            if (player.getNumber() > secretNumber) {
                System.out.println(player.getName() + " больше - " + secretNumber);
                return false;
            } else if (player.getNumber() < secretNumber) {
                System.out.println(player.getName() + " меньше - " + secretNumber);
                return false;
            }
        }
        return true;
    }
}