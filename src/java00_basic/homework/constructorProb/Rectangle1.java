package java00_basic.homework.constructorProb;

public class Rectangle1 {
    private int width;
    private int height;
    private String color;
    private int area;

    Rectangle1(){}

    Rectangle1(int width, int height){
        this.width = width;
        this.height = height;
        this.color = "흰색";
    }

    Rectangle1(int width, int height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return this.calculateArea();
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int calculateArea(){
        int result = this.getWidth() * this.getHeight();
        return result;
    }
}
