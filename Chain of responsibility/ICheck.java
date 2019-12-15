public interface ICheck {

   void setNext(ICheck nextChain);
    boolean Validate(String email,String password);
}
