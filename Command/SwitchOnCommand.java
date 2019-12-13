public class SwitchOnCommand implements ICommand {
    private Lamp lamp;

    public SwitchOnCommand(Lamp lamp){
        this.lamp=lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOn();
    }
}
