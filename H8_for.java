
/**
 * determinar si dos arreglos son iguales con for
 * 
 * @Criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class H8_for
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //creacion del primer arreglo arreglo
        System.out.println("ingrese el tamano de su primer arreglo");
        int t=sc.nextInt();
        int [] arre1=new int[t];
        ///llenado del prrimer arreglo arreglo
        for(int i=0;i<t;i++){
            System.out.println("ingrese el valor de su primer arreglo en la posicion "+i);
            arre1[i]=sc.nextInt();
        }
        //creacion del segundo arreglo arreglo
        System.out.println("ingrese el tamano de su segundo arreglo");
        t=sc.nextInt();
        int [] arre2=new int[t];
        ///llenado del segundo arreglo arreglo
        for(int i=0;i<t;i++){
            System.out.println("ingrese el valor de su segundo arreglo en la posicion "+i);
            arre2[i]=sc.nextInt();
        }
        //determinar si son iguales
        boolean iguales=false;
        if(arre2.length==arre1.length)
            for(int i=0;i<t;i++)
                if(arre1[i]==arre2[i])
                    iguales=true;
                else{
                    iguales=false;
                    break;
                }
        if(iguales)
            System.out.println("son iguales los dos arreglos");
        else
            System.out.println("no son iguales los dos arreglos");
    }
}
