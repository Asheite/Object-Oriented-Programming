package hw2_10927260.assignment2_2;


/**
 * Write a description of class BlackTea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackTea extends Ingredient
{
  int cost = 20 ;
  String ingredient = new String( "紅茶" ) ;
  
  public BlackTea() {}
  
  public BlackTea( Ingredient b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public BlackTea( BlackTea b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }

  public BlackTea( Milk b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public BlackTea( Pearl b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public BlackTea( GreenTea b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  /* 取得成分說明 */
  public String getIngredient() {
    return ingredient;
  }
  
  public int getCost() {
    return cost ;
  } // getCost()
  
  
}
