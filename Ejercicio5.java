import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Disco> discos=new ArrayList<Disco>();
        int choice=0;
        String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;
        do{
            System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      choice = Integer.parseInt(sc.nextLine());

      switch(choice){
        case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        System.out.print("Elija el metodo de listado:\n1.Completo\n2.Por autor\n3.Por genero\n4.Por duración: ");
            choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                System.out.println(discos);
                break;
                case 2:
                System.out.print("Ingrese el autor: ");
                autorIntroducido=sc.nextLine();
                for (Disco disco : discos) {
                    if(disco.getAutor().equals(autorIntroducido)){
                        System.out.print(disco+"\n");
                    }
                }
                break;
                case 3:
                System.out.print("Ingrese el genero: ");
                generoIntroducido=sc.nextLine();
                for (Disco disco : discos) {
                    if(disco.getGenero().equals(generoIntroducido)){
                        System.out.print(disco+"\n");
                    }
                }
                break;
                case 4:
                System.out.print("Ingrese la duración maxima: ");
                int max=Integer.parseInt(sc.nextLine());
                while(max<0){
                    System.out.print("La duración maxima no puede ser negativa, vuelva a ingresarla: ");
                    max=Integer.parseInt(sc.nextLine());
                }
                System.out.print("Ingrese la duración minima: ");
                int min=Integer.parseInt(sc.nextLine());
                while(min<0){
                    System.out.print("La duración minima no puede ser negativa, vuelva a ingresarla: ");
                     min=Integer.parseInt(sc.nextLine());
                }
                for (Disco disco : discos) {
                    if(disco.getDuracion()<max&&disco.getDuracion()>min){
                        System.out.print(disco+"\n");
                    }
                }
                break;
            }
        break;
        case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        System.out.print("Codigo: ");
        codigoIntroducido=sc.nextLine();
        while(codigoIntroducido.equals("")){
            System.out.print("Ingrese un codigo valido: ");
            codigoIntroducido=sc.nextLine();
        }
        boolean repeated=true;
        do{
            repeated=false;
            for (Disco disco : discos) {
                if(disco.getCodigo().equals(codigoIntroducido)){
                    repeated=true;
                    System.out.print("El codigo introducido ya existe, ingrese otro: ");
                    codigoIntroducido=sc.nextLine();
                    break;
                }
            }
        }while(repeated==true);
        System.out.print("Autor: ");
        autorIntroducido = sc.nextLine();
        System.out.print("Título: ");
        tituloIntroducido = sc.nextLine();
        System.out.print("Género: ");
        generoIntroducido = sc.nextLine();
        System.out.print("Duración: ");
        duracionIntroducida = Integer.parseInt(sc.nextLine());        
        discos.add(new Disco(codigoIntroducido,autorIntroducido,tituloIntroducido,generoIntroducido,duracionIntroducida));
        break;
        case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        System.out.println("Inserte el codigo del disco a modificar: ");
        codigoIntroducido=sc.nextLine();
        while(codigoIntroducido.equals("")){
            System.out.print("Ingrese un codigo valido: ");
            codigoIntroducido=sc.nextLine();
        }
            for (Disco disco : discos) {
                if(disco.getCodigo().equals(codigoIntroducido)){
                    disco.setCodigo("");
                    System.out.print("Codigo: ");
                    codigoIntroducido=sc.nextLine();
                    while(codigoIntroducido.equals("")){
                        System.out.print("Ingrese un codigo valido: ");
                        codigoIntroducido=sc.nextLine();
                    }
                     repeated=true;
                    do{
                        repeated=false;
                        for (Disco disk : discos) {
                            if(disk.getCodigo().equals(codigoIntroducido)){
                                repeated=true;
                                System.out.print("El codigo introducido ya existe, ingrese otro: ");
                                codigoIntroducido=sc.nextLine();
                                break;
                            }
                        }
                    }while(repeated==true);
                    System.out.print("Autor: ");
                    autorIntroducido = sc.nextLine();
                    System.out.print("Título: ");
                    tituloIntroducido = sc.nextLine();
                    System.out.print("Género: ");
                    generoIntroducido = sc.nextLine();
                    System.out.print("Duración: ");
                    duracionIntroducida = Integer.parseInt(sc.nextLine());
                    discos.set(discos.indexOf(disco), new Disco(codigoIntroducido,autorIntroducido,tituloIntroducido,generoIntroducido,duracionIntroducida));  
                    break;
                }
            }
            

        break;
        case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        System.out.println("Inserte el codigo del disco a borrar: ");
        codigoIntroducido=sc.nextLine();
        while(codigoIntroducido.equals("")){
            System.out.print("Ingrese un codigo valido: ");
            codigoIntroducido=sc.nextLine();
        }
        if(!discos.isEmpty()){
            for (Disco disco : discos) {
                if(disco.getCodigo().equals(codigoIntroducido)){
                    discos.remove(discos.indexOf(disco));
                    break;
                }
            }
        }else{
            System.err.println("Discos esta vacio");
        }
     
        break;
      }
        }while(choice!=5);
        sc.close();
    }
}
