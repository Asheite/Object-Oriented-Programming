package hw2_10927260.assignment2_2;


/**
 * Write a description of class Milk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milk extends Ingredient
{
  private int cost = 20 ;
  Ingredient drink ;
  String ingredient = new String( "牛奶" ) ;
  /* 取得成分說明 */
  
  public Milk() {}
  
  public Milk( Ingredient b ) {
    drink = new BlackTea() ;
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public Milk( BlackTea b ) {
    drink = new BlackTea() ;
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public Milk( GreenTea b ) {
    drink = new GreenTea() ;
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  public Milk( Milk b ) {
    drink = new Milk() ;
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  } 
  
  public Milk( Pearl b ) {
    drink = new Pearl() ;
    cost += b.getCost() ;
    ingredient += b.getIngredient() ;
  }
  
  
  public String getIngredient() {
    return ingredient ;
  }
  
  
  public int getCost() {
    return cost ;
  } // getCost()
}
