public class SpaBooking {

    public int Book(int procedures) {
        int price = 0;
        switch (procedures) {
            case 0:
            { return price;
            }
            case 1: {
                price = 300;
                break;
            }
            case 2: {
                price = 550;
                break;
            }

            case 3: {
                price = 800;
                break;
            }

            case 4: {
                price = 999;
                break;
            }

            default:{
                System.out.println("Not more than 4 procedures");
            }
        }

        return price;
    }
}
