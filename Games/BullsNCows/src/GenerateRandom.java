import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Note that the length of the secret word may not match the number of possible characters in the secret code,
Also, since a secret code is not a number anymore,
the symbol 0 should be allowed as the first character in a secret code.*/

public class GenerateRandom {
    int size;
    int sizeChar;

    GenerateRandom(int size, int sizeChar) {
        this.size = size;
        this.sizeChar = sizeChar;
    }

    Random random = new Random();

    public  String random() {
        String secretCode;
        Random random = new Random();
        //Getting a random number and random set of Chars according to the inputSize
        StringBuilder sb = new StringBuilder();
        sb.append(randomNumber());
        secretCode = sb.toString();

        if (sizeChar > 10) {
            sb.append(randomChar());
            //these both strings needs to be reshuffled and return the final string
            secretCode = shuffle(sb.toString()).substring(0, size);
        }

        return secretCode;
    }

    private StringBuilder randomChar() {
        Random random = new Random();
        //generate thr random String of characters provided the sizeChar.
        // char 97 -> 'a'       char 122 -> 'z'
        // Uniqueness
        int lowerBond = 97;
        int upperBond = lowerBond + sizeChar - 10;

        StringBuilder stringOfRandomChar1 = new StringBuilder();
        StringBuilder stringOfRandomChar2 = new StringBuilder();
        StringBuilder stringOfRandomChar3 = new StringBuilder();
        StringBuilder stringOfRandomChar4 = new StringBuilder();
        StringBuilder stringOfRandomChar5 = new StringBuilder();
        StringBuilder stringOfRandomChar6 = new StringBuilder();
        StringBuilder stringOfRandomChar7 = new StringBuilder();
        StringBuilder stringOfUniqueChar = new StringBuilder();
        StringBuilder finalOutput = new StringBuilder();

        for (int i = 0; i < size; i++) {
            int number = random.nextInt(upperBond - lowerBond) + lowerBond;
            stringOfRandomChar1.append((char) number);
        }
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(upperBond - lowerBond) + lowerBond;
            stringOfRandomChar2.append((char) number);
        }
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(upperBond - lowerBond) + lowerBond;
            stringOfRandomChar3.append((char) number);
        }
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(upperBond - lowerBond) + lowerBond;
            stringOfRandomChar4.append((char) number);
        }
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(upperBond - lowerBond) + lowerBond;
            stringOfRandomChar5.append((char) number);
        }
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(upperBond - lowerBond) + lowerBond;
            stringOfRandomChar6.append((char) number);
        }
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(upperBond - lowerBond) + lowerBond;
            stringOfRandomChar7.append((char) number);
        }

        StringBuilder stringOfRandomChar = new StringBuilder();
        stringOfRandomChar.append(stringOfRandomChar1).append(stringOfRandomChar2).append(stringOfRandomChar3)
                .append(stringOfRandomChar4).append(stringOfRandomChar5).append(stringOfRandomChar6).append(stringOfRandomChar7);

        boolean[] seen = new boolean[256];
        for (int i = 0; i < stringOfRandomChar.length(); i++) {
            char ch = stringOfRandomChar.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                stringOfUniqueChar.append(ch);
            }
        }
        return finalOutput.append(stringOfUniqueChar.substring(0, size));
    }

    private StringBuilder randomNumber() {
        Random random = new Random();
        int upperBond = (int) Math.pow(10, size); //10000
        int lowerBond = (int) Math.pow(10, size - 1); //1000
        String secretCode1 = String.valueOf(random.nextInt(upperBond - lowerBond + 1) + lowerBond);
        String secretCode2 = String.valueOf(random.nextInt(upperBond - lowerBond + 1) + lowerBond);
        String secretCode3 = String.valueOf(random.nextInt(upperBond - lowerBond + 1) + lowerBond);
        String secretCode4 = String.valueOf(random.nextInt(upperBond - lowerBond + 1) + lowerBond);
        String secretCode5 = String.valueOf(random.nextInt(upperBond - lowerBond + 1) + lowerBond);
        String secretCode6 = String.valueOf(random.nextInt(upperBond - lowerBond + 1) + lowerBond);
        String secretCode = secretCode1 + secretCode2 + secretCode3 + secretCode4 + secretCode5 + secretCode6;

        StringBuilder uniqueSecretCode = new StringBuilder();

        //loop to find unique numbers
        boolean[] seen = new boolean[256];
        for (int i = 0; i < secretCode.length(); i++) {
            char ch = secretCode.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                uniqueSecretCode.append(ch);
            }
        }

        return new StringBuilder(uniqueSecretCode.substring(0, size));
    }  // getting no. of digits == size //4 for instance

    private  String shuffle(String input){
        List<Character> characters = new ArrayList<>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }


    //Generating random number from scratch
    /*long pseudoRandomNumber = System.nanoTime();

    public String random() {
        StringBuilder sb = new StringBuilder();
        StringBuilder randomInString = new StringBuilder();

        sb.append(String.valueOf(pseudoRandomNumber));
        sb.reverse();
        sb = new StringBuilder(sb.toString().replaceAll("0", ""));

        //loop to find unique numbers
        boolean seen[] = new boolean[256];
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                randomInString.append(ch);
            }
        }
        return randomInString.substring(0, size);*/
}



