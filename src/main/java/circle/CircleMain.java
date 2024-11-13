package circle;

import java.util.Random;

public class CircleMain {
    public static void main(String[] args) {
        System.out.println(Circle.PI);
        System.out.println(Math.PI);
        System.out.println(Math.round(10.5));
        System.out.println(new Random().nextInt(1000, 2000)); //Mindig véletlenszerű
        System.out.println(new Random(15).nextInt(1000)); //Mindig ugyanaz
    }
}
