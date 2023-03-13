import Figury.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figs = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("podaj dlugosc promienia kola");
            double promienK = input.nextDouble();
        figs.add(new Circle(promienK));

        System.out.println("podaj dlugosc bokow trojkata prostokatnego");
            System.out.println("a");
                double aT = input.nextDouble();
            System.out.println("b");
                double bT = input.nextDouble();
        figs.add(new Triangle(aT, bT));

        System.out.println("dlugosc bokow prostokata");
            System.out.println("a");
                double aP = input.nextDouble();
            System.out.println("b");
                double bP = input.nextDouble();
        figs.add(new Rectangle(aP, bP));

        for (Figure i: figs) {
            System.out.println(i.getClass().getSimpleName());
            System.out.println("\tpole " + i.getArea());
            System.out.println("\tobwod " + i.getPerimeter());

        }
    }
}