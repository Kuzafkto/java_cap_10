package Ejercicio22;

public class TransferenciaRecibida extends Transferencia{

    public TransferenciaRecibida(double importe, String cuenta, double saldo) {
        super(importe, cuenta, saldo, null);
    }
    @Override
    public String toString() {
        return String.format("Transf. recibida de %.2f de la cuenta %s Saldo %.2f euros", this.importe,this.cuenta, this.saldo);
    }    
}
