public class ConcreteColleague_1 extends Colleague {

    public ConcreteColleague_1(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Colleague_1 gets message: " + message);
    }
}
