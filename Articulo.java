
public class Articulo implements Cloneable{
    private static int codeCounter=1;
    private int code;
    private String desc="";
    private double buyPrice=0;
    private double sellPrice=0;
    private int stock=0;

    public Articulo(){
        this.code=generateCode();
    }
    public Articulo(String desc){
        this.code=generateCode();
        this.desc=desc;
    }
    public Articulo(String desc,double buy){
        this.code=generateCode();
        this.desc=desc;
        this.buyPrice=buy;
    }
    public Articulo (String desc,double buy,double sell){
        this.code=generateCode();
        this.desc=desc;
        this.buyPrice=buy;
        this.sellPrice=sell;
    }
    public Articulo(String desc,double buy,double sell,int stock){
        this.code=generateCode();
        this.desc=desc;
        this.buyPrice=buy;
        this.sellPrice=sell;
        this.stock=stock;
    }

    public int getCode(){
        return this.code;
    }
    public double getBuyPrice() {
        return this.buyPrice;
    }
    public String getDesc() {
        return this.desc;
    }
    public double getSellPrice() {
        return this.sellPrice;
    }
    public int getStock() {
        return this.stock;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
 

    private int generateCode(){
        return codeCounter++;
    }

    @Override
    public String toString(){
        return this.code+"| "+this.desc+":\n"+"Precio de venta: "+this.sellPrice+"\nPrecio de compra: "+this.buyPrice+"\nStock: "+this.stock;
    }
    
  
}
