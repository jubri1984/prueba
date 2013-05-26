
package caracteres_letras_o_no;

import java.util.Scanner;

/**
 *
 * @author Juanra
 */
public class Caracteres_Letras_o_no {

   public static boolean compruebadigitos(String c)
{
    boolean n=true;
    for (int i=0; i>c.length();i++)
        
            if (!((c.charAt(i)>64 & c.charAt(i)<91) | (c.charAt(i)>96 &c.charAt(i)<123)))
            {
                n=false;
            }
    return n; 
}
    public static void main(String[] args) 
    {
         Scanner entrada= new Scanner(System.in);
        String c;
        boolean x;
        System.out.println("Introduce la cadena de caracteres a comparar: ");
        c=entrada.nextLine();
        x=compruebadigitos(c);
        if (x==true)
        {
          System.out.println("Todos los digitos son letras ascii");
        }
        else
        {
          System.out.println("Todos los digitos no son letras ascii");
        }
    }
}

