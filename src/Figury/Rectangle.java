package Figury;

public class Rectangle implements Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter(){
        return (2*a) + (2*b);
    };
    public double getArea(){
        return a*b;
    };
}
