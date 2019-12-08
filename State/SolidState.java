public class SolidState implements IState {

    public  final String name = "solid";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void freeze(StateContext context) {
        System.out.println("Nothing happens");

    }

    @Override
    public void heat(StateContext context) {
        context.setState(new LiquidState());
    }
}
