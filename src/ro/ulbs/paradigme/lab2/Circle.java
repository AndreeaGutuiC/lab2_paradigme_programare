package ro.ulbs.paradigme.lab2;

public class Circle extends Form{
    private float radius;
    public Circle(){
        this.radius = 0;
    }

    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public float getArea() {
        float PI = 3.14F;
        return (this.radius * PI);
    }

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius + "  color = " + getColor();
    }
}
