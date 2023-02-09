package Ejercicio16;

import java.util.HashMap;

public class Paises {
    HashMap<String,String>capitales=new HashMap<>();
    Paises(){
        capitales.put("España","Madrid");
        capitales.put("Francia","Paris");
        capitales.put("Portugal","Lisboa");
    }
    public String getCapital(String pais){
        return capitales.get(pais);
    }
    public boolean añade(String pais,String capital){
        if(capitales.containsKey(pais))
        return false;
        capitales.put(pais, capital);
        return true;
    }
}
