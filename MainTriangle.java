import java.util.*;

public class MainTriangle {
  
  static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    Triangle tri = new Triangle(prompt(), prompt(), prompt()); //default constructor
    tri.print();
  }
  
  public static Vect prompt() {
    Vect vect= new Vect();
    System.out.print("Vect X: ");
    vect.setX(scanner.nextInt());
    System.out.print("Vect Y: ");
    vect.setY(scanner.nextInt()); 
    System.out.println("Vect X is: " + vect.getX() + " and Y is " + vect.getY());
    return vect;
  }
}
