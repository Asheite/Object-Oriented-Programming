package hw2_10927260.assignment2_2;


/**
 * Write a description of class Pearl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pearl extends Ingredient
{
  int cost = 10 ;
  String ingredient = new String( "珍珠" ) ;
  /* 取得成分說明 */
  
  public Pearl() {}
  
  public Pearl( Ingredient b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public Pearl( BlackTea b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }

  public Pearl( Milk b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public Pearl( Pearl b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public Pearl( GreenTea b ) {
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public int getCost() {
    return cost ;
  }

  public String getIngredient() {
    return ingredient ;
  }
}
