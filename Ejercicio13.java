import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Articulo> stock = new ArrayList<>();
        boolean found;
        int choice;
        int code;
        do {
            System.out.print( "Elija una opción:\n1.Listado\n2.Alta\n3.Baja\n4.Modificación\n5.Entrada de mercancía\n6.Salida de mercancía\n7.Salir\n");
                    choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (Articulo articulo : stock) {
                        System.out.println(articulo);
                    }
                    break;
                case 2:
                    stock.add(0, new Articulo());
                    System.out.print("Ingrese la descripción del producto: ");
                    stock.get(0).setDesc(sc.nextLine());
                    System.out.print("Ingrese el precio de compra: ");
                    stock.get(0).setBuyPrice(Double.parseDouble(sc.nextLine()));
                    while (stock.get(0).getBuyPrice() < 0) {
                        System.out.print("El precio no puede ser negativo\nvuelva a ingresarlo: ");
                        stock.get(0).setBuyPrice(Double.parseDouble(sc.nextLine()));
                    }
                    System.out.print("Ingrese el precio de venta: ");
                    stock.get(0).setSellPrice(Double.parseDouble(sc.nextLine()));
                    while (stock.get(0).getSellPrice() < 0) {
                        System.out.print("El precio no puede ser negativo\nvuelva a ingresarlo: ");
                        stock.get(0).setSellPrice(Double.parseDouble(sc.nextLine()));
                    }
                    System.out.print("Ingrese el stock: ");
                    stock.get(0).setStock(Integer.parseInt(sc.nextLine()));
                    while (stock.get(0).getStock() < 0) {
                        System.out.print("El stock no puede ser negativo\nvuelva a ingresarlo: ");
                        stock.get(0).setStock(Integer.parseInt(sc.nextLine()));
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el código del articulo a borrar: ");
                    do {
                        code = Integer.parseInt(sc.nextLine());
                        found = false;
                        for (Articulo articulo : stock) {
                            if (articulo.getCode() == code) {
                                stock.remove(stock.indexOf(articulo));
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.print("El código ingresado no existe, ingrese un codigo correcto: ");
                        }
                    } while (!found);

                    break;
                case 4:
                    System.out.print("Ingrese el código del articulo a modificar: ");
                    do {
                        code = Integer.parseInt(sc.nextLine());
                        found = false;
                        for (Articulo articulo : stock) {
                            if (articulo.getCode() == code) {
                                System.out.print(
                                        "Que desea modificar?\n1.Descripción\n2.Precio de compra\n3.Precio de venta\n4.Stock");
                                choice = Integer.parseInt(sc.nextLine());
                                while (choice < 1 || choice > 4) {
                                    System.out.print("La opción elegida no es váldia, ingrese otra: ");
                                    choice = Integer.parseInt(sc.nextLine());
                                }
                                switch (choice) {
                                    case 1:
                                        System.out.print("Ingrese la descripción del producto: ");
                                        stock.get(stock.indexOf(articulo)).setDesc(sc.nextLine());
                                        break;
                                    case 2:
                                        System.out.print("Ingrese el precio de compra: ");
                                        stock.get(stock.indexOf(articulo)).setBuyPrice(Double.parseDouble(sc.nextLine()));
                                        while (stock.get(stock.indexOf(articulo)).getBuyPrice() < 0) {
                                            System.out.print("El precio no puede ser negativo\nvuelva a ingresarlo: ");
                                            stock.get(stock.indexOf(articulo)).setBuyPrice(Double.parseDouble(sc.nextLine()));
                                        }
                                        break;
                                    case 3:
                                        System.out.print("Ingrese el precio de venta: ");
                                        stock.get(stock.indexOf(articulo)).setSellPrice(Double.parseDouble(sc.nextLine()));
                                        while (stock.get(stock.indexOf(articulo)).getSellPrice() < 0) {
                                            System.out.print("El precio no puede ser negativo\nvuelva a ingresarlo: ");
                                            stock.get(stock.indexOf(articulo)).setSellPrice(Double.parseDouble(sc.nextLine()));
                                        }
                                        break;
                                    case 4:
                                        System.out.print("Ingrese el stock: ");
                                        stock.get(stock.indexOf(articulo)).setStock(Integer.parseInt(sc.nextLine()));
                                        while (stock.get(0).getStock() < 0) {
                                            System.out.print("El stock no puede ser negativo\nvuelva a ingresarlo: ");
                                            stock.get(stock.indexOf(articulo)).setStock(Integer.parseInt(sc.nextLine()));
                                        }
                                        break;
                                }
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.print("El código ingresado no existe, ingrese un codigo correcto: ");
                        }
                    } while (!found);
                    break;
                case 5:
                System.out.print("Ingrese el código del articulo a añadir al stock: ");
                do {
                    code = Integer.parseInt(sc.nextLine());
                    found = false;
                    for (Articulo articulo : stock) {
                        if (articulo.getCode() == code) {
                            System.out.print("Ingrese cuantas copias de ese articulo se añadiran: ");
                            articulo.setStock(articulo.getStock()+Integer.parseInt(sc.nextLine()));
                            found=true;
                            break;
                        }
                    }
                    System.out.print("El codigo ingresado no existe, por favor vuelva a ingresarlo: ");
                }while(!found);
                    break;
                case 6:
                String fact="";
               do{
                System.out.println("desea añadir? 1.si 2.imprimir factura: ");
                choice=Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 1:
                    do {
                        code = Integer.parseInt(sc.nextLine());
                        found = false;
                        for (Articulo articulo : stock) {
                            if (articulo.getCode() == code) {
                                System.out.print("Cuantas unidades quieres vender?: ");
                                code = Integer.parseInt(sc.nextLine());
                                while(articulo.getStock()<code){
                                    System.out.print("No puede ser mayor a la cantidad del stock: ");
                                    code = Integer.parseInt(sc.nextLine());
                                }articulo.setStock(articulo.getCode()-code);
                                fact+=articulo.getCode()+" "+articulo.getDesc()+" "+articulo.getSellPrice()+"  "+code+" "+(articulo.getSellPrice()*code)+"\n";
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.print("El código ingresado no existe, ingrese un codigo correcto: ");
                        }
                    } while (!found);
                    break;
                    case 2:
                    System.out.println(fact);
                    break;
                    default:
                    break;
                }
               }while(choice!=2);
                    break;
                default:
                    break;
            }
        } while (choice != 7);
        sc.close();
    }
}
//El código no es eficiente, probablemente se deberían de cambiar trozos de código y pasarlos a funciones, ademas que 
//en el apartado 6 hay ciertos dead ends que hay que solucionar.