import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String,String>users=new HashMap<String, String>();
        Scanner sc=new Scanner (System.in);
        users.put("juan", "contrasenia");
        users.put("admin","12345");
        users.put("invitado","");
        int attempts=3;
        String input="";
        String key="";
        System.out.println("BIENVENIDO A LA SEDE VIRTUAL DE HACKERS DEL CONALEP");
        while (attempts>0){
            System.out.print("Tienes "+attempts+ " intentos\nIngrese el nombre de usuario: ");
             input= sc.nextLine();
            if(users.containsKey(input)){
                 key=input;
                    input=sc.nextLine();
                    if(!users.get(key).equals(input)){
                        attempts--;
                        System.err.println("CONTRASEÑA INCORRECTA");
                    }else{
                        System.out.println("Acceso garantizado :D");
                        break;
                    }
            }else{
                System.err.println("NOMBRE DE USUARIO INCORRECTO");
                attempts--;
            }
        }
        sc.close();
    }
}
