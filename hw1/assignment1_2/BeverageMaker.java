package hw1.assignment1_2;

/**
 * 抽象类 BeverageMaker - 在这里给出对这个类的描述
 * 
 * @作者: 
 * 日期: 
 */
public abstract class BeverageMaker
{
  protected void prepare() {
    boilWater() ;
    brew() ;
    pourInCup() ;
    addIce() ;
    addCondiments() ;
  } // prepare()
  
  void addIce() {
  
  } // addIce()
  
  abstract void brew() ;
  
  abstract void addCondiments() ;
   
  void boilWater() {
    System.out.println( "煮水" ) ;
  } // boilWater()
  
  void pourInCup() {
    System.out.println( "倒進杯子" ) ;
  } // pourInCup()
}
