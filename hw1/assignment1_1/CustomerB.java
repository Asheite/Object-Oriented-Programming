package hw1.assignment1_1;

class CustomerB extends Customer {
  private float temperature ;
  private int humidity ;
  private int windSpeed ;
  
  @Override
  public void display() {
    System.out.println( "customer B temperature:" + temperature ) ;
    System.out.println( "customer B humidity:" + humidity ) ;
  } // display()

  @Override
  public void setData( float t, int h, int w ) {
    temperature = t ;
    humidity = h ;
    display() ;
  } // setData()
} // class CustomerB