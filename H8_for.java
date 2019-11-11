
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
        int [] arre1=crear(1);        
        int [] arre2=crear(2);
        //determinar si son iguales
        boolean iguales=false;
        if(arre1.length==arre2.length)
            for(int i=0;i<arre2.length;i++)
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
    private static int[] crear(int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el tamano de su primer arreglo"+n);
        int t=sc.nextInt();
        int arreglo[]=new int[t];
        for(int i=0;i<t;i++){
            System.out.println("ingrese el valor de su segundo arreglo en la posicion "+i);
            arreglo[i]=sc.nextInt();
        }
        return arreglo;
    }
}
