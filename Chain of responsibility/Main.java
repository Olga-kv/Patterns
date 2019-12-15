public class Main {

    public static void main ( String[] args){
        Server myServer = new Server();

        myServer.Register(" firstUser@gmail.com","firstUserPassword");
        myServer.Register("SecondUser@gmail.com","SecondUserPassword");

        Chain chain = new Chain(myServer);
        myServer.setChain(chain);

        myServer.LogIn("SecondUser@gmail.com","SecondUserPassword");
      //myServer.LogIn("ThirdUser@gmail.com","ThirdUserPassword"); //User with such email doesn't exist
      //myServer.LogIn("SecondUser@gmail.com","ThirdUserPassword"); // Password is wrong
    }
}
