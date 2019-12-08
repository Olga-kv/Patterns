public class LiquidState implements IState {
    public  final String name = "liquid";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void freeze(StateContext context) {
        context.setState(new SolidState());
    }

    @Override
    public void heat(StateContext context) {
        context.setState(new GaseousState());
    }
}
