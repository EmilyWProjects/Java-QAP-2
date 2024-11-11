public class TesMyLine {
    public static void main(String[] args){

        //Line
        MyPoint p1 = new MyPoint(3, 5);
        MyPoint p2 = new MyPoint(6, 8);
        MyLine line = new MyLine(p1, p2);

        //Tests
        System.out.println(line);
        System.out.println("Length: " + line.getLength());
    }
}
