
/**
 * obtener una sub cadena de una cadena principal con for.
 * 
 * @Criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class I9_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ///lectura de la frase
        System.out.println("ingrese una frase");
        String cadena=sc.nextLine();
        //lectura de la posicion inicial y final
        System.out.println("ingrese la posicion inicial donde se extraera el fracmento");
        int pocI=sc.nextInt();
        System.out.println("ingrese la posicion final donde se extraera el fracmento");
        int pocF=sc.nextInt();
        //impresion de la cadena entre el rango
        if(pocI<pocF&&pocF<cadena.length())
            for(int i=pocI;i<pocF;i++)
                System.out.print(cadena.charAt(i));
        else
            System.out.println("posiciones fuera de rango");
    }
}
