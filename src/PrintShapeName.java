public class PrintShapeName extends Shape{


    public static void main(String[] args) {

        Shape quad = new Quad();
        System.out.println(quad.shapeName());
        Shape circle = new Circle();
        System.out.println(circle.shapeName());
        Shape triangle = new Triangle();
        System.out.println(triangle.shapeName());
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.shapeName());
        Shape trapeze = new Trapeze();
        System.out.println(trapeze.shapeName());
    }

}
