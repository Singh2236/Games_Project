# Games_Project

This is my Games_Project, where i have merged my best Game algorithms in 
one place.

## This project has 2 games -
+ Tik_tak_toe 
+ Bulls and cows

## Project description 
+ Consists of Five Packages 
  + Two Games -  **BullsNCows  ** and **Tik_Tak_toe ** algorithm
  + Two TCP Based Client Server model packages to connect with the clients: **Server and Client **
  + One Package is like View from MVC: **Games **

    
## Starting the game
+ Start Server file, the main file from Server
+ Start Client file, the main file Client side, you can also run multiple instances of client. 
## Project Features 
- Sign UP
- Sign IN 
- Play Games 
- Quit/Go-back After the Game ends or play again the same game.
- Go-back to play another game. 

## Technicalities-
+ Java 17
+ Multithreading 
+ ...

### Game Features 
#### Tik_tak_toe
+ Wrong input management
+ Show results
+ Replay
#### Bulls and Cows 
+ Manually input the length of secret code and characters 
+ Randomly generates the mixture of code consisting of Integers and Characters.
+ Grade: Outputs the No. of Cows and Bulls 
  + Bulls: No. of matching ints or chars with the same placeholder 
  + Cows: No of matching ints or chars irrespective of place

### Dependencies
+ Java Version 17.0.1


### Console Tik_tak_toe
```
Connection Established. 
1. SignUp 
2. LogIn
3. Quit 
Your input: 2
Username: 1
Password: 1
LoggedInSuccessfully
WELCOME TO THE GAMES KINGDOM
WELCOME TO THE GAMES KINGDOM
WELCOME TO THE GAMES KINGDOM
WELCOME TO THE GAMES KINGDOM
Choose Your Game
1. TikTakToe 2. BullsNCows 3. Go back
1
1. Play 2. Quit
1
---------
|       |
|       |
|       |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  You should enter numbers!
Enter the coordinates (1-3), ex. upper left corner 1 1.:  1 1
---------
| O     |
|       |
|       |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  3 1
---------
| O     |
|       |
| X     |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  2 2
---------
| O     |
|   O   |
| X     |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  3 3
---------
| O     |
|   O   |
| X   X |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  3 2
---------
| O     |
|   O   |
| X O X |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  1 2
---------
| O X   |
|   O   |
| X O X |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  2 3
---------
| O X   |
|   O O |
| X O X |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  1 3
---------
| O X X |
|   O O |
| X O X |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  1 1
This cell is occupied! Choose another one!
---------
| O X X |
|   O O |
| X O X |
---------
Enter the coordinates (1-3), ex. upper left corner 1 1.:  2 1
---------
| O X X |
| O O O |
| X O X |
---------
O wins
1. Play 2. Quit
```

### Console BullsNCOws 
````
C:\Users\navka\.gradle\jdks\jdk-17.0.1+12\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.1.3\lib\idea_rt.jar=58212:C:\Program Files\JetBrains\IntelliJ IDEA 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\navka\IdeaProjects\Games_Project\out\production\Client;C:\Users\navka\IdeaProjects\Games_Project\out\production\Games;C:\Users\navka\IdeaProjects\Games_Project\out\production\BullsNCows;C:\Users\navka\IdeaProjects\Bulls and Cows;C:\Users\navka\IdeaProjects\Games_Project\out\production\Tik_tak_toe;C:\Users\navka\IdeaProjects\Games_Project\out\production\Games_Project" Client
Connection Established. 
1. SignUp 
2. LogIn
3. Quit 
Your input: 1
Username: 1
Password: 1
Registration Successful
1. SignUp 
2. LogIn
3. Quit 
Your input: 2
Username: 1
Password: 1
LoggedInSuccessfully
WELCOME TO THE GAMES KINGDOM
WELCOME TO THE GAMES KINGDOM
WELCOME TO THE GAMES KINGDOM
WELCOME TO THE GAMES KINGDOM
Choose Your Game
1. TikTakToe 2. BullsNCows 3. Go back
2
Input the length of the secret code:
4
Input the number of possible symbols in the code:
0
The secret is prepared: **** (0-9, a-W).
Okay, let's start a game!
Turn 1:
The digits must be equal than or greater than the required number
1111
Grade: 1 bull(s)  and 0 cow(s).
Turn 2:
The digits must be equal than or greater than the required number
0111
The digits must be equal than or greater than the required number
1222
Grade: 1 bull(s)  and 0 cow(s).
Turn 3:
The digits must be equal than or greater than the required number
1333
Grade: 1 bull(s)  and 0 cow(s).
Turn 4:
The digits must be equal than or greater than the required number
1444
Grade: 1 bull(s)  and 0 cow(s).
Turn 5:
The digits must be equal than or greater than the required number
1555
Grade: 1 bull(s)  and 0 cow(s).
Turn 6:
The digits must be equal than or greater than the required number
1666
Grade: 2 bull(s)  and 0 cow(s).
Turn 7:
The digits must be equal than or greater than the required number
1622
Grade: 1 bull(s)  and 1 cow(s).
Turn 8:
The digits must be equal than or greater than the required number
1266
Grade: 2 bull(s)  and 0 cow(s).
Turn 9:
The digits must be equal than or greater than the required number
1236
Grade: 1 bull(s)  and 1 cow(s).
Turn 10:
The digits must be equal than or greater than the required number
1263
Grade: 2 bull(s)  and 0 cow(s).
Turn 11:
The digits must be equal than or greater than the required number
1767
Grade: 3 bull(s)  and 0 cow(s).
Turn 12:
The digits must be equal than or greater than the required number
1762
Grade: 2 bull(s)  and 1 cow(s).
Turn 13:
The digits must be equal than or greater than the required number
1267
Grade: 3 bull(s)  and 0 cow(s).
Turn 14:
The digits must be equal than or greater than the required number
1867
Grade: 3 bull(s)  and 0 cow(s).
Turn 15:
The digits must be equal than or greater than the required number
1967
Grade: 4 bull(s)  and 0 cow(s).
Congratulations! You guessed the secret code.
Choose Your Game
1. TikTakToe 2. BullsNCows 3. Go back
````
