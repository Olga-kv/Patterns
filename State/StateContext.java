public class StateContext {
    private IState state = new LiquidState();

    public void setState(IState state){
        System.out.println("Changing state: "+this.state.getName()+" to "+state.getName());
        this.state=state;
    }

    public IState getState(){
        return this.state;
    }

    public void freeze(){
        System.out.println("Freezing "+state.getName()+" water");
        state.freeze(this);
    }

    public void heat(){
        System.out.println("Heating "+state.getName()+" water");
        state.heat(this);
    }

}
