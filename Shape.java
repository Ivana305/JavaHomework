package JavaProject02;

public interface Shape {/*Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your code.*/

   double calculateArea();
   double calculatePerimeter();
}
class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius*Math.PI*2;
    }
}
class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape obj=new Circle(15);
        System.out.println("Area of Circle is "+obj.calculateArea());
        System.out.println("Perimeter of circle is "+obj.calculatePerimeter());
        Square obj2=new Square(10.5);
        System.out.println("Area of square is "+obj2.calculateArea());
        System.out.println("Perimeter of square is "+obj2.calculatePerimeter());


    }
}
