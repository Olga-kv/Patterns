public class CoffeeWithSugar extends DecoratorCoffee {

    CoffeeWithSugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void Drink(){
        super.Drink();
        System.out.println("Sugar was added");
    }
}
