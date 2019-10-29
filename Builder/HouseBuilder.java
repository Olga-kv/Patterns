public abstract class HouseBuilder {
    protected House house=new House();

    public House CreateNewHouse(){
        House my_house = new House();
        return my_house;
    }

    public House GetMyHouse(){
        return house;
    }

    public  void SetWall(){};
    public  void SetDoor(){};
    public  void SetWindow(){};
    public  void SetRoof(){};
    public  void SetGarage(){};
    public  void SetSwimmingPool(){};


}
