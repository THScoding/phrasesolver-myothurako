
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

    boolean correct = true;
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
      System.out.println("current letter value:" + current.getName());
      System.out.println("game solved phrase:" + game.getSolvedPhrase());
      System.out.println("game current letter value:" + game.getCurrentLetterValue());
      /* your code here - game logic */
      game.setLetterValue();

      System.out.println("make a guess");
      String guess = input.nextLine();

      if (guess.length() == 1) { // checks if guess is a letter guess
        boolean hit = game.guessLetter(guess);
        if (hit) {
          current.addPoints(game.getCurrentLetterValue()); // adds points to current

        }

      }
      // IF THE GUESS IS THE FULLY CORRECT
      if (game.isSolved(guess)) {
        game.setLetterValue();
        System.out.println("WINNER!!!!!" + current + " IS THE BEST AND THE OTHER PLAYER CANT DO ANYTHING ABOUT IT");
        solved = true;
      }
    }

    /* your code here - determine how game ends */
    System.out.println(player1 + "'s points totals to " + player1.getPoints());
    System.out.println(player2 + "'s points totals to " + player2.getPoints());
    solved = true;
  }

}
