public class PasswordCheck implements ICheck {
    private ICheck next;
    private Server server;

    public PasswordCheck(Server server){
        this.server=server;
    }


    @Override
    public void setNext(ICheck nextChain) {
        this.next=nextChain;
    }

    @Override
    public boolean Validate(String email, String password) {
        boolean res = true;

        if(!server.CheckPassword(email,password)){
            System.out.println("Password is wrong");
            res=false;
        }

        return res;
    }
}
