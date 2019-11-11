
/**
 * cambiar cadena a mayusculas con for.
 * 
 * @criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Q17_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese una frase/palabra");
        String cad=sc.nextLine();
        String mayus="";
        char abc[][]={{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'
            ,'q','r','s','t','u','v','w','x','y','z'},{'A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}};
        for(int i=0;i<cad.length();i++)
            if((int)cad.charAt(i)>=97&&(int)cad.charAt(i)<=122){
                for(int x=0;x<26;x++)
                    if(cad.charAt(i)==abc[0][x]){
                        mayus+=abc[1][x];
                        break;
                    }
                
                }else
                mayus+=cad.charAt(i);
        System.out.println(mayus);
    }
}
