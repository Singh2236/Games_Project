public class Grade {
    String secretCode;
    String fromUser;

    Grade(String secretCode, String fromUser) {
        this.secretCode = secretCode;
        this.fromUser = fromUser;
    }


    int bulls = 0;
    int cows = 0;
    int[] secretCodeA = new int[122];
    int[] fromUserA = new int[122];

    public int find() {
        BullsNCows.turn++;
        // loop through first array
        for (int i = 0; i < secretCode.length(); i++) {
            char c1 = secretCode.charAt(i);
            char c2 = fromUser.charAt(i);
            // if they match, then increment bulls
            if (c1 == c2) {
                bulls++;
            }
            else {
                // else, save the respected number on its place in the array
                secretCodeA[c1 - '0']++;
                fromUserA[c2 - '0']++;

            }
        }

        // loop through our primitive arrays
        for (int i = 0; i < 122; i++) {
            // compare positions of numbers in the array
            cows += Math.min(secretCodeA[i], fromUserA[i]);
        }
        System.out.println("Grade: " + bulls + " bull(s)  and " + cows + " cow(s).");
        return bulls;

    }
}
