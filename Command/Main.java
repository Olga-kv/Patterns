public class Main {

    public static void main( String[]args){
        Lamp myLamp = new Lamp();

        ICommand offCommand= new SwitchOffCommand(myLamp);
        ICommand onCommand = new SwitchOnCommand(myLamp);

        Switch mySwitch = new Switch();

        mySwitch.AddCommand("On",onCommand);
        mySwitch.AddCommand("Off",offCommand);

        mySwitch.execute("On");
    }
}
