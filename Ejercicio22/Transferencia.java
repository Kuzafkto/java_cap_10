package Ejercicio22;

public class Transferencia extends Movimiento{
    private String cuentaDestino;
    protected Transferencia(double importe, String cuenta, double saldo,String cuentaDestino) {
        super(importe, cuenta, saldo);
        this.cuentaDestino=cuentaDestino;
    }
    
}
