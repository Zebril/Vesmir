

package vesmir;

public class Vesmir
{
    public static void main(String[] args)
    {
        Vektor a = new Vektor(5, 0);
        Vektor b = new Vektor(4, Math.PI);
        
        Vektor c = Vektor.sectiVektory(a, b);
        double velikostc = c.getVelikost();
        System.out.println(velikostc + "");
    }
    
}
