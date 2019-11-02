public class Singleton {
    private static Singleton _instance=null;
    public String value;

    private Singleton (String val){
        value=val;
    };

    public static  Singleton getSingletonInstance(String val){
        if(_instance == null){
            _instance= new Singleton(val);
        }
        return _instance;
    }
}
