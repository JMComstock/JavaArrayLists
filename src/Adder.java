import java.sql.SQLOutput;

public class Adder {
    public static double add(Integer in1, Double in2, int in3) {
        System.out.println("in1: " + in1);
        System.out.println("in2: " + in2);
        System.out.println("in3: " + in3);
        return in1 + in2 + in3;
    }

    public static void main(String[] args) {
        Integer x = 10;
        Double y = 12.0;
        int z = 5;

        double answer = add(x, y, z);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        System.out.println(answer);
    }
}