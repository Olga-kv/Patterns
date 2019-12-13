public abstract class Colleague {
    protected IMediator mediator;

    public Colleague(IMediator mediator){
        this.mediator=mediator;
    }

    public void send(String message){
        this.mediator.send(message,this);
    }

    public abstract void Notify(String message);



}
