package hw2_10927260.assignment2_2;


/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{  
    
  public static void main(String[] args) {
    Ingredient b = new BlackTea() ;
    Milk m = new Milk( b ) ;
    Pearl p = new Pearl( m ) ;
    System.out.println( p.getCost() );
    System.out.println( p.getIngredient() ) ;
  }
}
