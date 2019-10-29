import java.util.ArrayList;

public class Department implements Component {

    private ArrayList<Component> _children=new ArrayList<>();


    public Department(){}

    public void AddComponent(Component c){
        this._children.add(c);
    }

    public void RemoveComponent(Component c){
        this._children.remove(c);
    }


    @Override
    public double getSalary() {
        double sum=0;
        for(Component c:this._children){
            sum+=c.getSalary();
        }
        return sum;
    }
}
