import java.util.ArrayList;
import java.util.List;

public class Publisher implements IPublisher {
    private List<ISubscriber> _subscribers;
    private double _temperature;
    private double _humidity;


    public Publisher(){
        this._subscribers= new ArrayList<>();
    }

    public double get_temperature(){
        return _temperature;
    }

    public double get_humidity() {
        return _humidity;
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        _subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        _subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(ISubscriber subscriber: _subscribers){
            subscriber.update(_humidity,_temperature);
        }
    }

    public void setMeasures(double temperature, double humidity){
        this._humidity=humidity;
        this._temperature=temperature;

        this.notifySubscribers();
    }
}
