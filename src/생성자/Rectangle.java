package 생성자;

public class Rectangle {
    private int width;
    private int length;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        int result = this.width * this.length;
        return result;
    }

    public int perimeter(){
        int result = (this.width + this.length) * 2;
        return result;
    }
}
