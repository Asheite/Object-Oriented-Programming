package hw2_10927260.assignment2_1;


/**
 * Write a description of class RoomCardTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomCardTest
{
    public static void main( String[] args ) {
      RoomCard card1, card2 ;
      card1 = new RoomCardBuilder()
                  .setCheckIn( "2022/10/11" )
                  .setCheckOut( "2022/11/12" ) 
                  .setRoomId( 201 )
                  .build() ;
      card2 = new RoomCard( card1 );
      card1.extendCheckDate() ;
      System.out.println(card1.getCheckOutDate()); // card1的日期是新的
      System.out.println(card2.getCheckOutDate()); // card2的日期是舊的      
    
    } // main()
}
