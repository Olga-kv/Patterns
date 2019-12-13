public class ConcreteColleague_2 extends Colleague {

    public ConcreteColleague_2(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Colleague_2 gets message: " + message);
    }
}
