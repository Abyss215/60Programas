
/**
 * optener la suma de todos los valores de un arreglo con for.
 * 
 * @Criss_215 
 * @version (a version number or a date)
 */import java.util.Scanner;
public class F6_for
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamano de su arreglo");
        int t=sc.nextInt();
        int [] arre=new int[t];
        int suma=0;
        for(int i=0;i<t;i++){
            System.out.println("ingrese el valor de su arreglo en la posicion "+i);
            arre[i]=sc.nextInt();
            suma+=arre[i];
        }
        
        System.out.println("la suma de los valores es: "+suma);
    }
}
