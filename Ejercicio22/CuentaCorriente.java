package Ejercicio22;

import java.util.ArrayList;
import java.util.HashMap;

public class CuentaCorriente {
    private String cuenta;
    private double saldo;
    private HashMap<String, Integer>cuentas=new HashMap<String,Integer>();
    ArrayList<Movimiento> movimientos= new ArrayList<>();
    private String generarCuenta(){
        boolean correcto=false;
        String _cuenta="";
        do{

       
        int valor=0;
        do{
            valor=(int)(Math.random()*9);
        }while(valor!=0);
        _cuenta+=valor;
        for(int i=0 ;i<9;i++){
            _cuenta+=(int)(Math.random()*9);
        }
    }while(cuentas.containsKey(_cuenta));
    return _cuenta;
    }
    public CuentaCorriente (){
        this.cuenta=generarCuenta();
        this.cuentas.put(cuenta, Integer.parseInt(cuenta));
        this.saldo=0;
    }

    public CuentaCorriente(double saldo){
        this.saldo=saldo;
    }

    public void Ingreso(float importe){
        this.saldo+=importe;
        this.movimientos.add(new Ingreso(importe, this.cuenta, this.saldo));
    }

    public void Cargo(float importe){
        this.saldo-=importe;
        this.movimientos.add(new Ingreso(importe, this.cuenta, this.saldo));
    }
    public void Transferencia(CuentaCorriente cuenta, float importe) throws NotEnoughBalance{
        if(importe>this.saldo){

        }else{
            this.saldo-=importe;
            cuenta.saldo+=importe;
            this.movimientos.add(new TransferenciaEmitida(importe,this.cuenta,this.saldo,cuenta.cuenta));
            this.movimientos.add(new TransferenciaRecibida(importe,this.cuenta,this.saldo));

        }
    }
    @Override
    public String toString() {
        return String.format("Cuenta: %s Saldo: %.2f", this.cuenta,this.saldo);
    }
    public void imprimirMovimientos(){
        System.out.printf("Movimientos de la cuenta %s\n",this.cuenta);
        for (Movimiento movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }
    public void transferencia(CuentaCorriente cuenta3, int i) {
    }
}
