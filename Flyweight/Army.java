import java.util.ArrayList;
import java.util.List;

public class Army {
    private ArrayList<Soldier> soldiers = new ArrayList<>();

    public void CrateSoldiers(int x,int y,String name,int health,String other){
        SoldierType type = SoldierFactory.GetSoldierType(name,health,other);
        Soldier soldier= new Soldier(x,y,type);
        soldiers.add(soldier);

    }

    public void paint(){
        for(Soldier soldier:soldiers){
            soldier.Create();
        }
    }
}
