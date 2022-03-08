package exercise_04;

public class Circle extends Shape implements ShapeCalculation{
    private int radio;

    public Circle() {
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void calculateArea() {
        area = PI * (radio^2);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = PI * (radio*2);
    }
}
