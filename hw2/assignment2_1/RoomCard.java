package hw2_10927260.assignment2_1;


/**
 * Write a description of class RoomCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomCard
{
    // instance variables - replace the example below with your own
    private int roomId ;
    private String checkInDate ;
    private String checkOutDate ;
    private boolean [] availableFloors = new boolean[15] ;
    
    /**
     * Constructor for objects of class RoomCard
     */
    public RoomCard( int id, String in, String out )
    {
        this.roomId = id ;
        this.checkInDate = new String( in ) ;
        this.checkOutDate = new String( out ) ;
        //this.availableFloors = fl.clone() ;
    }
    
    public RoomCard( RoomCard rc ) {
        this.roomId = rc.getId() ;
        this.checkInDate = new String( rc.getCheckInDate() ) ;
        this.checkOutDate = new String( rc.getCheckOutDate() ) ;
        this.availableFloors = rc.getFloors().clone() ;
    }
    
    public void extendCheckDate() {
        System.out.println( "extend one day" ) ;
      
        checkOutDate = "2021/12/31" ;
    
    } // extendCheckDate()
    
    public boolean[] getFloors() {
        return availableFloors ;
    } // getFloor()
    
    public String getCheckInDate() {
      return checkInDate ;
    } // getCheckIn()
    
    public int getId() {
        return roomId ;
    } // getId()
    
    public String getCheckOutDate() {
      return checkOutDate ;
    } // getCheckOutDate()
    
}
