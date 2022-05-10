import java.util.Scanner;

public class BullsNCows {
    static int turn = 1;
    static int character;

    public static void play() {
        // All this input and output
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        int size = scanner.nextInt();                                   //4


        GenerateRandom gr;
        String secretCode = null;
        boolean flag = true;

        if (size > 0 && size < 37) {
            System.out.println("Input the number of possible symbols in the code:");
            int sizeChar = scanner.nextInt();                           //16
            character = 97 + sizeChar - 10;
            System.out.println("The secret is prepared: **** (0-9, a-" + (char)character + ").");
            gr = new GenerateRandom(size, sizeChar);
            secretCode = gr.random();
        }
        else {
            System.out.println("Error: can't generate a secret number with a length more than 36 because " +
                    "there aren't enough unique digits and characters.");
            flag = false;
        }

        System.out.println("Okay, let's start a game!");
        while (flag) {
            System.out.println("Turn " + turn + ":");

            String fromUser;
            do {
                System.out.println("The digits must be equal than or greater than the required number");
                fromUser = scanner.next();

            } while (Integer.parseInt(fromUser) < Math.pow(10, size-1));  //if the condition is false -> user input is right

            Grade grade = new Grade(secretCode, fromUser);
            int bulls = grade.find();

            //if four bulls found
            if (bulls == size) {
                System.out.println("Congratulations! You guessed the secret code.");
                flag = false;
            }

        }


    }
}
