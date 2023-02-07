public class Elemento {
    String name="";
    double price=0;
    int quantity;

    Elemento(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return this.name+" PVP: "+this.price+" Unidades: "+this.quantity+" Subtotal: "+ String.format("%.2f",price*quantity)+"\n";

    }
}
