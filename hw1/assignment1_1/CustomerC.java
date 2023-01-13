package hw1.assignment1_1;

class CustomerC extends Customer {
  private float temperature ;
  private int humidity ;
  private int windSpeed ;

  @Override
  public void display() {
    System.out.println( "customer C temperature:" + temperature ) ;
    System.out.println( "customer C humidity:" + humidity ) ;
    System.out.println( "customer C windSpeed:" + windSpeed ) ;
  } // display()
  
  @Override
  void setData( float t, int h, int w ) {
    temperature = t ;
    humidity = h ;
    windSpeed = w ;
    display() ;
  } // setData()
} // class CustomerC