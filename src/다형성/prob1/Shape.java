package 다형성.prob1;

import java.awt.geom.Area;

abstract class Shape {
    double area;
    String name;

    Shape(String name){
        this.name = name;
    }

    abstract void calculationArea();

    abstract void print();
}
