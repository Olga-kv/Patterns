import java.util.HashMap;

public class Switch {
    private HashMap<String,ICommand>  commandMap = new HashMap<>();

    public void AddCommand( String name,ICommand command){
        commandMap.put(name,command);
    }

    public void execute(String commandName) {
        ICommand command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }


}
