package hw1.assignment1_1;

abstract class Customer {
  private float temperature ;
  private int humidity ;
  private int windSpeed ;
  
  
  abstract public void display() ;
  abstract void setData( float t, int h, int w ) ;
  
} // class Customer