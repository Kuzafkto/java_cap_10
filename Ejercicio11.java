import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String>dicc=new HashMap<>();
        dicc.put("you","tu");
        dicc.put("will","vas");
        dicc.put("surely","probablemente");
        dicc.put("never","nunca");
        dicc.put("correct","corregir");
        dicc.put("this","este");
        dicc.put("exercise","ejercicio");
        dicc.put("because","porque");
        dicc.put("I","yo");
        dicc.put("know","se");
        dicc.put("that","que");
        dicc.put("my","mi");
        dicc.put("teacher","profe");
        dicc.put("doesn't","no");
        dicc.put("read","lee");
        dicc.put("more","mas");
        dicc.put("fast","rapido");
        dicc.put("than","que");
        dicc.put("he","el");
        dicc.put("writes","escribe");
        String word;
        int choice;
        do{
            System.out.print("Ingrese la palabra a traducir del ingles al espanol: ");
            word=sc.nextLine();
            if(dicc.containsKey(word)){
                System.out.println("El significado de "+ word+ " es "+dicc.get(word));
            }else{
                System.out.println("No me se esa palabra, sorry D: ");
            }
            System.out.print("\nDesea ingesar otra palabra? (Si:1) (No, quiero salir: 5)\nSeleccion: ");
            word="";
            choice=Integer.parseInt(sc.nextLine());
        }while(choice!=5);
    }
}

/*1 transform hasmap into arraylist
 * 2 take random word
 */
