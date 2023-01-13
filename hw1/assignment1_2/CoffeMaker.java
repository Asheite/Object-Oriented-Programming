package hw1.assignment1_2;


/**
 * 在这里给出对类 CoffeMaker 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
class CoffeMaker extends BeverageMaker
{
  void addIce() {
    System.out.println( "加入冰塊" ) ;
  } // addIce()  
    
  void brew() {
    System.out.println("把熱水倒進磨好的咖啡粉");
  } // brew()
  
  void addCondiments() {
    System.out.println( "添加糖或牛奶等額外添加物" ) ;
  } // addComdiments()
} // class CoffeMaker
