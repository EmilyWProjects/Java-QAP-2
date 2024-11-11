public class TestMyRectangle {
    public static void main(String[] args){

        //Rectangle
        MyPoint topLeft = new MyPoint(2, 6);
        MyPoint bottomRight = new MyPoint(5, 2);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        //Tests
        System.out.println(rectangle);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());

    };
}
