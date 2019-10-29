public class Soldier {
    private int x;
    private int y;
    private SoldierType type;

    public Soldier(int x, int y, SoldierType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }


    public void Create(){

        type.Create(x,y,type.getName());
    }

}
