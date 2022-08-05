import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class TikTakToe {
    static int whileCount = 0;
    static int turn = 0;


    public static void play() {
        Scanner scanner = new Scanner(in);
        while (true) {
            out.println("1. Play 2. Quit");
            int input = scanner.nextInt();
            if (input == 1) {


                int countX = 0;   // counts the number od lines X has made
                int countO = 0;     // counts the number of lines O has made
                String regex1 = "[123] [123]+";
                String regexNumber = "[0-9] [0-9]";
                String coordinates;


                int winLoss = 0;

                out.println("---------");
                out.println("|       |");
                out.println("|       |");
                out.println("|       |");
                out.println("---------");

                // System.out.println("Enter cells: ");

                StringBuilder cells = new StringBuilder("         ");


                while (!(whileCount == 9)) {
                    coordinates = getStringFromUser(scanner, regex1, regexNumber); // Function to get coordinates from the user.


                    switch (coordinates) {
                        case "1 1":
                            if (cells.charAt(0) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(0, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(0, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                        case "1 2":
                            if (cells.charAt(1) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(1, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(1, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                        case "1 3":
                            if (cells.charAt(2) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(2, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(2, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                        case "2 1":
                            if (cells.charAt(3) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(3, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(3, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                        case "2 2":
                            if (cells.charAt(4) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(4, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(4, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                        case "2 3":
                            if (cells.charAt(5) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(5, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(5, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                        case "3 1":
                            if (cells.charAt(6) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(6, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(6, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                        case "3 2":
                            if (cells.charAt(7) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(7, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(7, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                        case "3 3":
                            if (cells.charAt(8) == ' ') {
                                if (turn % 2 == 1) {
                                    cells.setCharAt(8, 'X');
                                }
                                else if (turn % 2 == 0) {
                                    cells.setCharAt(8, 'O');
                                }
                                whileCount++;
                                turn++;
                            }
                            else {
                                out.println("This cell is occupied! Choose another one!");
                            }
                            break;
                    }


                    print(cells);


                    // for vertical lines X
                    if (cells.charAt(0) == 'X' && cells.charAt(3) == 'X' && cells.charAt(6) == 'X') {
                        countX++;
                    }
                    else if (cells.charAt(1) == 'X' && cells.charAt(4) == 'X' && cells.charAt(7) == 'X') {
                        countX++;
                    }
                    else if (cells.charAt(2) == 'X' && cells.charAt(5) == 'X' && cells.charAt(8) == 'X') {
                        countX++;
                    }

                    // for horizontal lines X
                    else if (cells.charAt(0) == 'X' && cells.charAt(1) == 'X' && cells.charAt(2) == 'X') {
                        countX++;
                    }
                    else if (cells.charAt(3) == 'X' && cells.charAt(4) == 'X' && cells.charAt(5) == 'X') {
                        countX++;
                    }
                    else if (cells.charAt(6) == 'X' && cells.charAt(7) == 'X' && cells.charAt(8) == 'X') {
                        countX++;
                    }

                    // for diagonal of  X
                    else if (cells.charAt(0) == 'X' && cells.charAt(4) == 'X' && cells.charAt(8) == 'X') {
                        countX++;
                    }
                    else if (cells.charAt(6) == 'X' && cells.charAt(4) == 'X' && cells.charAt(2) == 'X') {
                        countX++;
                    }

                    // for vertical lines O
                    if (cells.charAt(0) == 'O' && cells.charAt(3) == 'O' && cells.charAt(6) == 'O') {
                        countO++;
                    }
                    else if (cells.charAt(1) == 'O' && cells.charAt(4) == 'O' && cells.charAt(7) == 'O') {
                        countO++;
                    }
                    else if (cells.charAt(2) == 'O' && cells.charAt(5) == 'O' && cells.charAt(8) == 'O') {
                        countO++;
                    }

                    // for horizontal lines
                    else if (cells.charAt(0) == 'O' && cells.charAt(1) == 'O' && cells.charAt(2) == 'O') {
                        countO++;
                    }
                    else if (cells.charAt(3) == 'O' && cells.charAt(4) == 'O' && cells.charAt(5) == 'O') {
                        countO++;
                    }
                    else if (cells.charAt(6) == 'O' && cells.charAt(7) == 'O' && cells.charAt(8) == 'O') {
                        countO++;
                    }

                    // for diagonals
                    else if (cells.charAt(0) == 'O' && cells.charAt(4) == 'O' && cells.charAt(8) == 'O') {
                        countO++;
                    }
                    else if (cells.charAt(6) == 'O' && cells.charAt(4) == 'O' && cells.charAt(2) == 'O') {
                        countO++;
                    }


                    if (countO >= 1) {
                        System.out.println("O wins");
                        winLoss = 1;
                        break;
                    }
                    else if (countX >= 1) {
                        System.out.println("X wins");
                        winLoss = 1;
                        break;
                    }

                }
                if (winLoss == 0) {
                    System.out.println("Draw");
                }
            }
            else if (input == 2) {
                break;
            }
        }
    }

    private static String getStringFromUser(Scanner scanner, String regex1, String regexNumber) {
        String coordinates;
        while (true) {
            out.print("Enter the coordinates (1-3), ex. upper left corner 1 1.:  ");
            coordinates = scanner.nextLine();
            if (!coordinates.matches(regexNumber)) {       /* to check if the string contains numbers*/
                System.out.println("You should enter numbers!");
            }
            else if (!coordinates.matches(regex1)) {
                out.println("Coordinates should be from 1 to 3!");
            }
            else {
                break;
            }
        }
        return coordinates;
    }

    public static void print(StringBuilder cells) {
        out.println("---------");
        out.println("| " + cells.charAt(0) + " " + cells.charAt(1) + " " + cells.charAt(2) + " |");
        out.println("| " + cells.charAt(3) + " " + cells.charAt(4) + " " + cells.charAt(5) + " |");
        out.println("| " + cells.charAt(6) + " " + cells.charAt(7) + " " + cells.charAt(8) + " |");
        out.println("---------");
    }


}
