package HomeWork.PolymorphismProb.prob1;

public class Rectangular extends Shape {
    private double width;
    private String height;

    Rectangular(String name, double width, int height){
        super(name);
        this.width = width;
        this.height = String.valueOf(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    void calculationArea() {
        Double h = Double.parseDouble(this.height);
        double result = (double) this.width * h;
        this.area = result;
    }

    @Override
    void print() {
        System.out.println("직사각형의 면적은 " + this.area);
    }
}
