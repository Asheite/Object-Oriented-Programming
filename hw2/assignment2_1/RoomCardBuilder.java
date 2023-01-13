package hw2_10927260.assignment2_1;


/**
 * Write a description of class RoomCardBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomCardBuilder implements BuildSeqence
{
    private int roomId ;
    private String checkInDate ;
    private String checkOutDate ;
    private boolean [] availableFloors = new boolean[15] ;
    
    public RoomCardBuilder setCheckIn( String in ) {
        this.checkInDate = new String( in ) ;
        return this ;
    }
    
    public RoomCardBuilder setCheckOut( String out ) {
        this.checkOutDate = new String( out ) ;
        return this ;
    }
    
    public RoomCardBuilder setRoomId( int id ) {
        this.roomId = id ;
        return this ;
    }
    
    /*
    public RoomCardBuilder setAvailable( boolean[] fl ) {
        this.availableFloors = fl.clone() ;
        return this ;
    } */
    
    public RoomCard build() {
        return new RoomCard( roomId, checkInDate, checkOutDate ) ;
    }
    
}
