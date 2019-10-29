public class CoffeeWithMilk extends DecoratorCoffee{

    CoffeeWithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void Drink(){
        super.Drink();
        System.out.println("Milk was added");
    }
}
