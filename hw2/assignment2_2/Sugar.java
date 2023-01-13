package hw2_10927260.assignment2_2;


/**
 * Write a description of class GreenTea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sugar extends Ingredient
{
  private int cost = 5 ;  
  String ingredient = new String( "糖" ) ;
  /* 取得成分說明 */
  public Sugar() {}
  
  public Sugar( Ingredient b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }

  public Sugar( BlackTea b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }

  public Sugar( Milk b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public Sugar( Pearl b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public Sugar( GreenTea b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public String getIngredient() {
    return ingredient;
  }
  
  public int getCost() {
    return cost ;
  } // getCost()
}
