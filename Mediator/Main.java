public class Main {

    public static void main( String[] args){
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague_1 colleague_1= new ConcreteColleague_1(mediator);
        ConcreteColleague_2 colleague_2 = new ConcreteColleague_2(mediator);

        mediator.setColleague_1(colleague_1);
        mediator.setColleague_2(colleague_2);

        colleague_1.send("I'm here");
        colleague_2.send("Me too");


    }
}
