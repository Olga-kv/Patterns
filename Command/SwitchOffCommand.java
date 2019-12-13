public class SwitchOffCommand implements ICommand {
    private Lamp lamp;

    public SwitchOffCommand(Lamp lamp){
        this.lamp=lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }
}
