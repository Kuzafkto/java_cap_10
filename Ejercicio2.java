import java.util.ArrayList;

public class Ejercicio2{
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        int lenght=(int)(Math.random()*21);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int total=0;
        for (int i = 0; i <lenght ; i++) {
            a.add((int)(Math.random()*101));
        }
        for (Integer integer : a) {
            total+=integer;
            if(integer>max){
                max=integer;
            }
            if(integer<min){
                min=integer;
            }
        }
        if(a.size()==0){
            System.out.print("La lista tiene 0 elementos");
        }else{
            System.out.print("El tamaño de la lista es de "+a.size()+" elementos, la suma de todos ellos es "+total+" y el promedio "+ total/a.size()+"\nEl máximo es el "+ max+ " y el minimo es el "+min);
        }
        
    }
}