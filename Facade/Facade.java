public class Facade {
    RoomBooking roomBooking;
    SpaBooking spaBooking;

    public Facade(){
        roomBooking = new RoomBooking();
        spaBooking= new SpaBooking();
    }

    public void Booking(int amountDays,int beds,int procedures){
        int total=0;
        total+= roomBooking.Book(amountDays,beds);
        total+=spaBooking.Book(procedures);

       System.out.println("Total: "+total);
    }
}
