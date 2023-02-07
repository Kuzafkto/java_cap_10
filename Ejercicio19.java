import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio19 {
    private static ArrayList<String> obtenerSinonimos(String palabra, HashMap<String, String> dic) {
        String traduccion=dic.get(palabra);
        ArrayList<String>sinonimos=new ArrayList<>();
        for(Map.Entry entrada:dic.entrySet()){
            if(entrada.getValue().equals(traduccion)){
                sinonimos.add((String)entrada.getKey());
            }
        }
        return sinonimos;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    HashMap <String,String> dic=new HashMap<>();
    boolean salir=false;

    dic.put("caliente", "hot");
    dic.put("rojo", "red");
    dic.put("ardiente", "hot");
    dic.put("verde", "green");
    dic.put("agujetas", "stiff");
    dic.put("abrasador", "hot");
    dic.put("hierro", "iron");
    dic.put("grande", "big");


    
    do{
        System.out.print("Introduzca la palabra: ");
        String palabra=sc.nextLine();
        if(palabra.equals("salir"))
        salir=true;

        else{
            if(dic.containsKey(palabra)){
                ArrayList <String> sinonimos=obtenerSinonimos(palabra, dic);
                if(sinonimos.size()>1){
                    String cadena=String.format("Sinonimos de %s: ",palabra);
                    for (int i=0; i<sinonimos.size()-1;i++){
                        cadena+=String.format("%s ", sinonimos.get(i));
                    }
                    cadena+=sinonimos.get(sinonimos.size()-1);
                }
             
            }else{
                System.out.println("no la conozco");
            }
        }
    }while(!salir);
    }

   
    
}
