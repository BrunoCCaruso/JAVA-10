/////////////// exercise 04 ///////////////////////////

/*
It is proposed to develop a program that allows us to calculate the area and the perimeter
of geometric shapes, in this case a circle and a rectangle. since this
calculation will be repeated in the two geometric forms, we will create an Interface,
called ShapeCalculation that will have, the two methods to calculate the area, the
perimeter and the value of PI as a constant.
Develop the exercise so that the forms implement the methods of the
interface and calculate the area and perimeter of the two. In the main will be created the
shapes and the final result will be displayed.
Circle area: PI * radius ^ 2 / Circle perimeter: PI * diameter.
Rectangle area: base * height / Rectangle perimeter: (base + height) * 2
*/

package exercise_04;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadio(5);
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println("The area of the circle is: "+ circle.getArea());
        System.out.println("The perimeter of the circle is: "+circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setBase(5);
        rectangle.setHeight(5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println("The area of the rectangle is: "+rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: "+rectangle.getPerimeter());



    }
}
