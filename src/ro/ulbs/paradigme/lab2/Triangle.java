package ro.ulbs.paradigme.lab2;

public class Triangle extends Form{
    private float height;
    private float base;

    public Triangle(){
        this.base = 0;
        this.height = 0;
    }

    public Triangle(float height, float base){
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (base * height)/2;
    }

    @Override
    public String toString() {

        return "Triangle: base = " + base + "  color = " + getColor();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangle)) {
            return false;
        }

        Triangle tri = (Triangle) obj;
        boolean colorEqual = false;
        if (this.getColor() == null && tri.getColor() == null) {
            colorEqual = true;
        } else if (this.getColor() != null && tri.getColor() != null && this.getColor().compareTo(tri.getColor()) == 0) {
            colorEqual = true;

        }

        if (this.height == tri.height && this.base == tri.base && colorEqual) {
            return true;
        } else {
            return false;
        }
    }

}



