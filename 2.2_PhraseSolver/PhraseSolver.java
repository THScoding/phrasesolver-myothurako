
/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver {
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;

  /* your code here - constructor(s) */
  public PhraseSolver() {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
  }

  public void play() {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);

    // PSUEDO CODE
    // CURRENT = PLAYER1
    // GUESSING ALGORITHM
    // CURRENT MAKES GUESS, EITHER LETTER OR PHRASE.
    // CHECK IF SOLVED
    // CHECK IF LETTER
    // IF SOLVED, END GAME
    // IF NOT, SWITCH PLAYER

    while (!solved) {
      Player current;
      if (currentPlayer == 1) {
        current = player1;
      } else {
        current = player2;
      }
      System.out.println("current player:" + current.getName());
      System.out.println("game solved phrase:" + game.getSolvedPhrase());
      System.out.println("game current letter value:" + game.getCurrentLetterValue());
      /* your code here - game logic */
      game.setLetterValue();

      System.out.println("make a guess NOW, " + current.getName());
      String guess = input.nextLine();

      if (guess.length() == 1) { // checks if guess is a letter guess
        boolean hit = game.guessLetter(guess); // game checks guess if its in the phrase
        if (hit) {
          current.addPoints(game.getCurrentLetterValue()); // adds points to current
          System.out.println("letter found, now " + current.getName() + " has " + current.getPoints());
        }

      }
      // IF THE GUESS IS THE FULLY CORRECT
      if (game.isSolved(guess)) {
        current.addPoints(game.getCurrentLetterValue());
        current.addPoints(game.getCurrentLetterValue()); // BONUS POINTS FOR SOLVING IT.
        System.out
            .println("dangggggg the full phrase is solved now." + current.getName() + " has " + current.getPoints());
        solved = true;
      }
      if (currentPlayer == 1) { // switches after guess
        currentPlayer = 2;
      } else {
        currentPlayer = 1;
      }

    }

    /* your code here - determine how game ends */
    input.close();
    System.out.println(player1.getName() + "'s points totals to " + player1.getPoints());
    System.out.println(player2.getName() + "'s points totals to " + player2.getPoints());
    if (player1.getPoints() > player2.getPoints()) {
      System.out.println("Therefore, " + player1.getName() + " is clearly superior to " + player2.getName());
    }
    if (player2.getPoints() > player1.getPoints()) {
      System.out.println("Therefore, " + player2.getName() + " is clearly superior to " + player1.getName());
    }
    solved = true;
  }

}
