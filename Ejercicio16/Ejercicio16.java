package Ejercicio16;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        HashMap<String,String> countries=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        countries.put("Espana", "Madrid");
        countries.put("Francia", "Paris");
        countries.put("Portugal","lisboa");
        String country;
        String capital;

        do{
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            country=sc.nextLine();
            if(country.equals("salir")){
                break;
            }
            if(countries.containsKey(country)){
                System.out.println("La capital de "+ country+ " es "+countries.get(country));
            }else{
                System.out.print("No conozco la respuesta ¿cuál es la capital de "+ country+"?: ");
                capital=sc.nextLine();
                countries.put(country, capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }while(!country.equals("salir"));
    }
}
