package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b = true;
        int i = 100_000_001;
        int i2 = 0;
        double d = 3.14;
        System.out.println(b);
        String s = null;
        i2 = (int) d;
        System.out.println(i);
        System.out.println(d);
        System.out.println(i2);
        System.out.println((!(i % 2 == 0)) || true);
        System.out.println(i % 2 == 0 ? "Páros" : "Páratlan");
        for (int j = 0; j < 10;j++) {
            System.out.print(j +" ");
            if ((j % 2) == 0) {
                System.out.println("Páros");
            }
            else {
                System.out.println("Páratlan");
            }
        }
    }

}
