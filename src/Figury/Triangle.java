package Figury;

public class Triangle implements Figure {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
// a = podstawa b = wysokosc (h)

    public double getPerimeter(){
        double c = Math.pow(a,2) + Math.pow(b,2);
        return  Math.sqrt(c) + a + b;
    };
    public double getArea(){
        return (a * b) / 2;
    };
}
