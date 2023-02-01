import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9 {
        public static void main(String[] args) {
            Baraja b = new Baraja();
            ArrayList<Carta>mesa=new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Carta card=b.pop();
              System.out.println(card);
              mesa.add(card);
            }
            Collections.sort(mesa);
            System.out.println("\nCARTAS ORDENADAS\n=====================");
            for (Carta carta : mesa) {
                System.out.println(carta);
            }
        }
      
}


 
  
  