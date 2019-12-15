import java.util.HashMap;

public class Server {
    private HashMap<String,String > _users = new HashMap<>();
    private Chain chain;

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    public void LogIn(String email, String password){
        if(chain.Validate(email, password)){
            System.out.println("Authorization has been successful");
        }
        else{
            System.out.println("Authorization failed!");
        }

    }

    public void Register(String  email, String password){
        _users.put(email,password);
    }

    public boolean hasEmail(String email){
        return _users.containsKey(email);
    }

    public boolean CheckPassword(String  email, String password){
        return _users.get(email).equals(password);
    }
}
