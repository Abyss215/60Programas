
/**
 * Leer 2 cadenas y unirlas con for creo
 * 
 * @Criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class M13_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese 1 cadena");
        String cad1=sc.nextLine();
        System.out.println("ingrese 2 cadena");
        String cad2=sc.nextLine();
        /**forma con for*/
        for(int i=0;i<(cad1.length()+cad2.length()+1);i++)
            if(i<cad1.length())
                System.out.print(cad1.charAt(i));
            else if(i>cad1.length())
                System.out.print(cad2.charAt(i-cad1.length()-1));
            else
                System.out.print(" ");
        /**forma facil y permitida segun la profa*/
        cad1=cad1+" "+cad2;
        System.out.println("\n"+cad1);
    }
}
