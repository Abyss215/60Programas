
/**
 * lea un cadena y remplace un valor por otro con for.
 * 
 * @criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P16_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese una palabra o frase");
        String cad=sc.nextLine();
        System.out.println("ingrese caracter a remplazar");
        char ct=(sc.nextLine()).charAt(0);
        System.out.println("ingrese caracter por el cual lo remplazara");
        char rp=sc.nextLine().charAt(0);
        String cad2="";
        for(int i=0;i<cad.length();i++)
            if(cad.charAt(i)==ct)
                cad2+=rp;
            else
                cad2+=cad.charAt(i);
        System.out.println(cad2);
    }
}
