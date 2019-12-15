public class Chain implements ICheck{

    private ICheck c_1;
    private Server server;

    public Chain(Server s){
        this.server=s;
        c_1= new EmailCheck(server);
        ICheck c_2= new PasswordCheck(server);

        c_1.setNext(c_2);
    }

    public ICheck getFirst(){
        return  c_1;
    }


    @Override
    public void setNext(ICheck nextChain) {

    }

    @Override
    public boolean Validate(String email, String password) {
        return c_1.Validate(email,password);
    }
}
