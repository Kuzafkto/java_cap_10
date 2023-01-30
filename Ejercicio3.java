import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            try {
                a.add(Integer.parseInt(System.console().readLine()));

            } catch (Exception e) {
                System.err.println("No se ha introducido un número.");
                i--;
            }
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}
