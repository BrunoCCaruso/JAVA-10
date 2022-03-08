package exercise_04;

public class Rectangle extends Shape implements ShapeCalculation{

    private double base;
    private double height;

    public Rectangle() {
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = base * height;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = (base + height) * 2;
    }
}
