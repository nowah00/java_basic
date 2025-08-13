package HomeWork.PolymorphismProb.prob1;

public class Circle extends Shape {
    private double radius;

    Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculationArea() {
        double result = this.radius * this.radius * 3.141592653589793;
        this.area = result;
    }

    @Override
    void print() {
        System.out.println("원의 면적은 " + this.area);
    }
}
