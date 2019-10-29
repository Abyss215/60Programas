
/**
 * programa q determina si una palabra/cadena esta en otra cadena con for
 * 
 * @criss_215  
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class J10_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese su primer cadena de texto");
        String cad1=sc.nextLine();
        System.out.println("ingrese su segunda cadena de texto");
        String cad2=sc.nextLine();
        boolean esta=false;
        int x=0;
        for(int i=4;i<cad1.length();i++){
            if(x>=cad2.length()){
                break;
            }else if(cad1.charAt(i)==cad2.charAt(x)){
                x++;
                esta=true;
            }else{
                x=0;
                esta=false;
            }
            
        }
        if(esta) System.out.println(cad2+" esta contenida en "+cad1);
        else System.out.println(cad2+" no esta contenida en "+cad1);
    }
}