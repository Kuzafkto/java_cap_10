import java.util.Objects;

public class Carta implements Comparable<Carta>{

  static String[] numeros = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  static String[] palos = {"bastos", "copas", "espadas", "oros"};
  
  private Integer numero;
  private String palo;

  Carta(int palo, int numero){
    this.numero = numero;
    this.palo = palos[palo];
  }
  
  public int getNumero() {
    return numero;
  }

  public String getPalo() {
    return palo;
  }

  @Override
  public String toString() {
    return numeros[numero] + " de " + palo;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Carta other = (Carta) obj;
    if (!Objects.equals(this.numero, other.numero)) {
      return false;
    }
    if (!Objects.equals(this.palo, other.palo)) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(Carta c) {
    if (palo.equals(c.getPalo())) {
      return numero.compareTo(c.getNumero());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
}
