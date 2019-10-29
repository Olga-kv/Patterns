public class HouseWithGarage extends HouseBuilder {

    @Override
    public void SetWall() {
        house.set_walls("Usual walls");
    }

    @Override
    public void SetDoor() {
        house.set_door("Usual door");
    }

    @Override
    public void SetWindow() {
        house.set_window("Usual windows");
    }

    @Override
    public void SetRoof() {
        house.set_roof("Usual roof");
    }

    @Override
    public void SetGarage() {
        house.set_garage("Garage");

    }


}
