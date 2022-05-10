import java.util.Scanner;

public class GamesHome {
    public static void playGames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE GAMES KINGDOM");
        System.out.println("WELCOME TO THE GAMES KINGDOM");
        System.out.println("WELCOME TO THE GAMES KINGDOM");
        System.out.println("WELCOME TO THE GAMES KINGDOM");

        while (true) {
            System.out.println("Choose Your Game");
            System.out.println("1. TikTakToe 2. BullsNCows 3. Go back");
            int input = scanner.nextInt();
            if (input == 1) {
                TikTakToe.play();
            }
            else if (input == 2) {
                BullsNCows.play();


            }
            else if (input == 3) {
                break;
            }
        }


    }

}
