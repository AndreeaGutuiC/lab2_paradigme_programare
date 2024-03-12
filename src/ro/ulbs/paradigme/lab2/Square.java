package ro.ulbs.paradigme.lab2;

public class Square extends Form {
    private float side;

    public Square(){
        this.side = 0;
    }

    public Square(float side){
        this.side = side;
    }

    @Override
    public float getArea() {
        return (side * side);
    }

    @Override
    public String getColor() {
        return "pink";
    }

    @Override
    public String toString() {
        return "Square: side = " + side + "  color = " + getColor();
    }
}
