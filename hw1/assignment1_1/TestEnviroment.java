package hw1.assignment1_1;


public class TestEnviroment extends EnvironmentData
{
  public static void main(String [] args) {
    EnvironmentData ed = new EnvironmentData();
    CustomerA a = new CustomerA() ;
    
    ed.addCustomer( a ) ;
    ed.setMeasurement(23.5f, 60, 10); // simulate environment data
  }
}
