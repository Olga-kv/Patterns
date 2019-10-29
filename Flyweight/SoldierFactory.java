
import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {

    static Map<String, SoldierType> _list = new HashMap<>();

    public static SoldierType GetSoldierType(String name,int health,String otherData){
        SoldierType result = _list.get(name);

        if (result == null) {
            result = new SoldierType(name, health, otherData);
            _list.put(name, result);
        }
        return result;

    }

}
