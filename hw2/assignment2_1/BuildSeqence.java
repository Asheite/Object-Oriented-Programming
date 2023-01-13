package hw2_10927260.assignment2_1;


/**
 * Write a description of interface BuildSeqence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface BuildSeqence
{
    public RoomCardBuilder setCheckIn( String in ) ;
    public RoomCardBuilder setCheckOut( String out ) ;
    public RoomCardBuilder setRoomId( int id ) ;
    // public RoomCardBuilder setAvailable( boolean[] fl );
    public RoomCard build() ;
}
