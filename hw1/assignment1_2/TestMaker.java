package hw1.assignment1_2;


/**
 * 在这里给出对类 TestMaker 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class TestMaker
{
    public static void main( String args[] ) {
    
      CoffeMaker c = new CoffeMaker() ;
      c.prepare() ;
      
      TeaMaker t = new TeaMaker() ;
      t.prepare() ;
    
    } // main()
}
