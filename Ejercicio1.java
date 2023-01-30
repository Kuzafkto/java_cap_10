import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Adrian");
        names.add("Jesus");
        names.add("Denisa");
        names.add("Pablo");
        names.add("Javier");
        names.add("Nuria");
        for (String string : names) {
           System.out.println(string); 
        }
    }
}
