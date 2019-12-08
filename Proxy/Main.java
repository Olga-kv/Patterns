public class Main {
    public static void main(String[]arg){
        IHeavyObject object=new ProxyHeavyObject();
        object.process();
        object.process();

    }
}
