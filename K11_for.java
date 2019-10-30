
/**
 * contar vocales de un String con for.
 * 
 * @Criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class K11_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese una frase o palabra");
        String cadena=sc.nextLine();
        //contador
        int cont=0;
        char [] vocales={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<cadena.length();i++)
            for(int x=0;x<10;x++)
                if(cadena.charAt(i)==vocales[x]){
                    cont++;
                    break;
                }
        System.out.println("hay "+cont+" vocales");
    }
}
