

public class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        System.out.println("The toString method  " + circle);


        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        RectangleFromSimpleGeometricObject rectangle1 = new RectangleFromSimpleGeometricObject(6,8,"blue",true);
        System.out.println("\nA rectangle " + rectangle1.toString());
        System.out.println("The area is " + rectangle1.getArea());
        System.out.println("The perimeter is " + rectangle1.getPerimeter());

    }
}