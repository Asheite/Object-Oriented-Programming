package hw2_10927260.assignment2_2;


/**
 * Write a description of class GreenTea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreenTea extends Ingredient
{
  private int cost = 20 ;  
  String ingredient = new String( "綠茶" ) ;
  /* 取得成分說明 */
  public GreenTea() {}
  
  public GreenTea( Ingredient b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public GreenTea( BlackTea b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }

  public GreenTea( Milk b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public GreenTea( Pearl b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public GreenTea( GreenTea b ) {
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
