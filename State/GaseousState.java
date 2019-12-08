public class GaseousState implements IState {
    public  final String name = "gaseous";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void freeze(StateContext context) {
        context.setState(new LiquidState());
    }

    @Override
    public void heat(StateContext context) {
        System.out.println("Nothing happens");
    }
}
