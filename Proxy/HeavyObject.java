public class HeavyObject implements IHeavyObject {
    HeavyObject(){
        this.InitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("processing complete");
    }

    public void InitialConfiguration(){
        System.out.println("Loading of initial configuration ");
    }
}
