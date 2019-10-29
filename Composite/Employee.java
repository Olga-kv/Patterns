public class Employee implements Component {
    private  double _itsSalary;

    Employee(double salary){this._itsSalary=salary;}


    @Override
    public double getSalary() {
        return this._itsSalary;
    }
}
