public class Main {

    public static void main( String [] args){
        Publisher weatherDate= new Publisher();

        CurrentWeatherDisplay weatherDisplay= new CurrentWeatherDisplay(weatherDate);

        weatherDate.setMeasures(18.4,70);
        weatherDate.setMeasures(10.2,73);



    }
}
