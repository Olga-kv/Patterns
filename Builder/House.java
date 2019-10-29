public class House {
    private String _walls;
    private String _door;
    private String _window;
    private String _roof;
    private String _garage;
    private String _swimmingPool;

    House(){}
    House(String w,String d,String wnd,String r,String g,String sp){
        this._walls=w;
        this._door=d;
        this._window=wnd;
        this._roof=r;
        this._garage=g;
        this._swimmingPool=sp;
    }

    public void set_walls(String wall){this._walls=wall;}
    public void set_door(String door){this._door=door;}
    public void set_window(String wind){this._window=wind;}
    public void set_roof(String roof){this._roof=roof;}
    public void set_garage(String garage){this._garage=garage;}
    public void set_swimmingPool(String swimmingPool){this._swimmingPool=swimmingPool;}

    public void PrintInfo(){
        System.out.println("Wall: "+_walls);
        System.out.println("Door: "+_door);
        System.out.println("Window: "+_window);
        System.out.println("Roof: "+_roof);
        System.out.println("Garage: "+_garage);
        System.out.println("Swimming pool: "+_swimmingPool);

    }


}
