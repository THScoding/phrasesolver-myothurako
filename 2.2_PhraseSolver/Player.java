
/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player {
  /* your code here - attributes */
  private String name;
  private int points;

  /* your code here - constructor(s) */
  public Player() { /// constructor, no input at all
    Scanner sc = new Scanner(System.in);
    System.out.println("what is your name?");
    name = sc.nextLine();
    points = 0;
    System.out.println("welcome" + name + ", to the game");
  }

  public Player(String inputName) {// contructor, uses parameter
    name = inputName;
    points = 0;
    System.out.println("welcome " + name + ", to the game");
  }

  /* your code here - accessor(s) */

  /* your code here - mutator(s) */
}