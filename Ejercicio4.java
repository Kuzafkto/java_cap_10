import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>a=new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
                a.add(sc.nextLine());
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}
