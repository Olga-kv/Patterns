
public class EmailCheck implements ICheck {
    private ICheck next;
    private Server server;

    public EmailCheck(Server server){
        this.server=server;
    }

    @Override
    public void setNext(ICheck nextChain) {
        this.next=nextChain;
    }

    @Override
    public boolean Validate(String email, String password) {
        boolean res=true;
        if(!server.hasEmail(email)){
            System.out.println("User with such email doesn't exist");
            res=false;
        }
        else{
        res = ValidateNext(email,password);

        }
        return res;
    }

    private boolean ValidateNext(String email, String password){
        if(next==null){
            return true;
        }

        return next.Validate(email,password);
    }
}
