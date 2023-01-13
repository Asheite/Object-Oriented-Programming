package hw1.assignment1_1;

class CustomerA extends Customer {
  private float temperature ;
  private int humidity ;
  private int windSpeed ;
  
  @Override
  public void display() {
    System.out.println( "customer A temperature:" + temperature ) ;
  } // display()
  
  @Override
  void setData( float t, int h, int w ) {
    temperature = t ;
    display() ;
  } // setData()*/
  
} // class CustomerA