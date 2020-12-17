public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[6];
        arr[0] = new Square();
        arr[1] = new Circle();
        arr[2] = new Rectangle();
        arr[3] = new Square(10);
        arr[4] = new Circle(15);
        arr[5] = new Rectangle(10, 15);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Square) {
                Square o = (Square) arr[i];
                System.out.println(o.getArea());
                o.howToColor();
            } else {
                System.out.println(arr[i].getArea());
            }
        }

    }
}



