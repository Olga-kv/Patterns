public class ConcreteMediator implements IMediator {
    private ConcreteColleague_1 colleague_1;
    private ConcreteColleague_2 colleague_2;

    public void setColleague_1(ConcreteColleague_1 colleague_1) {
        this.colleague_1 = colleague_1;
    }

    public void setColleague_2(ConcreteColleague_2 colleague_2) {
        this.colleague_2 = colleague_2;
    }

    public void send(String message, Colleague sender) {
        if(sender.equals(colleague_1)){
            colleague_1.Notify(message);
        }
        else
            if(sender.equals(colleague_2)){
                colleague_2.Notify(message);
            }

    }
}
