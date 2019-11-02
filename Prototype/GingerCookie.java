public class GingerCookie  extends ACookie {

    private int _weight;
    private String _shape;
    private String _color;

    GingerCookie(){}
    GingerCookie(int w,String sh,String c){
        this._weight=w;
        this._shape=sh;
        this._color=c;
    }

    @Override
    public ACookie Clone() {
        return new GingerCookie(this._weight,this._shape,this._color);
    }

    @Override
    public void Eat() {
        System.out.println("Ginger cookie is eaten");

    }

    @Override
    public void DisplayInfo() {
        System.out.println("Weight: "+_weight);
        System.out.println("Shape: "+_shape);
        System.out.println("Color: "+_color);

    }
}

