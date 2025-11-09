/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;
  /* your code here - constructor(s) */ 
  public Player(){
    Scanner sc = new Scanner(System.in);
    System.out.println("what is your name?");
    name = sc.nextLine();
    points = 0;
    System.out.println("welcome" + name + ", to the game");
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}