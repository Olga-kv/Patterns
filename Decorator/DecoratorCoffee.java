public class DecoratorCoffee extends Coffee {

    Coffee _decCoffee;

    DecoratorCoffee(Coffee coffee){
        _decCoffee=coffee;

    }

    @Override
    public void Drink() {
        _decCoffee.Drink();
    }
}
