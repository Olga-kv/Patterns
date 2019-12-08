public class CurrentWeatherDisplay implements ISubscriber {

    private double _temperature;
    private double _humidity;
    private Publisher publisher;

    public CurrentWeatherDisplay(Publisher publisher){
        this.publisher= publisher;
        publisher.subscribe(this);
    }

    @Override
    public void update(double humidity,double temperature) {
        _humidity=humidity;
        _temperature=temperature;
        Display();
    }


    public void Display(){
        System.out.println("Current weather");
        System.out.println("Temperature: "+_temperature+" Humidity: "+_humidity);
    }

}
