package Figury;

public class Circle implements Figure {
    private double promien;

    public Circle(double promien) {
        this.promien = promien;
    }

    public double getPerimeter(){
        return 2 * Math.PI * promien;
    };
    public double getArea(){
        return Math.PI * Math.pow(promien, 2);
    };
}
