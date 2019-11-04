

/**
 * que lea 2  cadenas y dada una posicion insertar la segunda cadena  
 * en la primera con for.
 * 
 * @Criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class N14_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese 1 cadena");
        String cad1=sc.nextLine();
        System.out.println("ingrese 2 cadena");
        String cad2=sc.nextLine();
        System.out.println("ingrese la posicion donde se insertara la segunda cadena");
        int poc=sc.nextInt();
        //incertar
        int x=0;
        if(poc<cad1.length())
        for(int i=0;i<cad1.length();i++)
            if(i>=poc&&x<cad2.length()){
                System.out.print(cad2.charAt(x));
                x++;
            }
            else 
                System.out.print(cad1.charAt(i));
    }
}
