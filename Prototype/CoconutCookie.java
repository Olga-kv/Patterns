public class CoconutCookie extends ACookie{
    private int _weight;
    private String _shape;


    CoconutCookie(){}
    CoconutCookie(int w,String sh){
        this._weight=w;
        this._shape=sh;
    }

    @Override
    public ACookie Clone() {
        return new CoconutCookie(this._weight,this._shape);
    }

    @Override
    public void Eat() {
        System.out.println("Coconut cookie is eaten");
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Weight: "+_weight);
        System.out.println("Shape: "+_shape);

    }
}
