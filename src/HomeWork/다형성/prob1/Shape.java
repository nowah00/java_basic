package HomeWork.다형성.prob1;

abstract class Shape {
    double area;
    String name;

    Shape(String name){
        this.name = name;
    }

    abstract void calculationArea();

    abstract void print();
}
