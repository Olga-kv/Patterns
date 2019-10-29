public class Director {
    private HouseBuilder _houseBuilder ;


    public void SetHouseBuilder(HouseBuilder hbuilder){
        _houseBuilder=hbuilder;

    }

    public House GetHouse(){
        return _houseBuilder.GetMyHouse();
    }

    public void ConstructHouse(){
        _houseBuilder.CreateNewHouse();
        _houseBuilder.SetWall();
        _houseBuilder.SetDoor();
        _houseBuilder.SetWindow();
        _houseBuilder.SetRoof();
        _houseBuilder.SetGarage();
        _houseBuilder.SetSwimmingPool();
    }
}
