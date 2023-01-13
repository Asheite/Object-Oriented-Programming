package hw1.assignment1_1;

import java.util.* ;


public class EnvironmentData
{
    ArrayList<Customer> customers = new ArrayList<Customer>() ;
    
    private float temperature ;
    private int humidity ;
    private int windSpeed ;
    
    public void addCustomer( Customer c ) {
      customers.add( c ) ;
    } // addCustomer()
    
    public void removeCustomer( Customer c ) {
      customers.remove( c ) ;
    } // removeCustomer()
    
    void setMeasurement( float t, int h, int w ) {
      temperature = t ;
      humidity = h ;
      windSpeed = w ;
      notifyCustomers() ;
    } // setMeasurement() 
    
    void notifyCustomers() {
      for ( Customer i : customers ) {
        i.setData( temperature, humidity, windSpeed ) ;
      } // for
    } // notifyCustomer
    
    /**
     * �? EnvironmentData ??�对象�?��?��?�函?��
     */
    public EnvironmentData()
    {
    }
}


