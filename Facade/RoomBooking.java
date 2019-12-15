public class RoomBooking {

    public int Book(int amountDays,int beds){
        int price=400;
        if(beds>3){
            System.out.println("We have only single, double and triple rooms");
            price=0;
        }
        else {
            price = 400 * beds * amountDays;
        }
            return price;

    }
}
