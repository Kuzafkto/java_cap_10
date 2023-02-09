package Ejercicio22;

public class TransferenciaEmitida extends Transferencia{

    String cuentaDestino;
    protected TransferenciaEmitida(double importe, String cuenta, double saldo, String cuentaDestino) {
        super(importe, cuenta, saldo, cuentaDestino);
    }

    @Override
    public String toString() {
        return String.format("Transf. recibida de %.2f de la cuenta %s Saldo %.2f euros", this.importe,this.cuentaDestino,this.saldo);
    }
    
}
