public class SoldierType {
    private String name;
    private int health;
    private String otherData;


    SoldierType(String name,int health,String other){
        this.name=name;
        this.health=health;
        this.otherData=other;
    }

    public String getName(){return name;}

    public void Create(int x,int y,String type){
        System.out.println("Soldier"+type+" is drawn ("+x+";"+y+")");
    }

}
