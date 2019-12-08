public class ProxyHeavyObject implements IHeavyObject {
    IHeavyObject object;


    @Override
    public void process() {
        this.lazyInit();
            object.process();


    }

    private void lazyInit(){
        if(object==null){
            object=new HeavyObject();

        }
    }
}

