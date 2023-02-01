import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    ArrayList<Carta> mazo = new ArrayList<Carta>();

    public Baraja(){
        for(int i = 0; i < Carta.palos.length; i ++){
            for(int j=0; j < Carta.numeros.length; j++){
                mazo.add(new Carta(i, j));
            }
        }
        Collections.shuffle(mazo);
    }

    public Carta pop(){
        return mazo.remove(0);
    }
}
