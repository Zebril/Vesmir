package vesmir;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.sqrt;
import static java.lang.Math.atan;

public class Vektor
{
    private double velikost;
    private double smer; //radiany
    
    public Vektor(double velikost, double smer)
    {
        this.velikost = velikost;
        this.smer = smer;
    }
    
    public double getVelikost() {return this.velikost;}
    public double getSmer() {return this.smer;}
    public void setVelikost(double novavelikost) {this.velikost = novavelikost;}
    public void setSmer(double novysmer) {this.smer = novysmer;}
    
    public static Vektor sectiVektory(Vektor vektor1, Vektor vektor2)
    {
        double vektor1x = sin(vektor1.smer) * vektor1.velikost;
        double vektor1y = cos(vektor1.smer) * vektor1.velikost;
        
        double vektor2x = sin(vektor2.smer) * vektor2.velikost;
        double vektor2y = cos(vektor2.smer) * vektor2.velikost;
        
        double vyslednicex = vektor1x+vektor2x;
        double vyslednicey = vektor1y+vektor2y;
        double vyslednicevelikost = sqrt((vyslednicex*vyslednicex) + (vyslednicey*vyslednicey));
        double vyslednicesmer = atan(vyslednicex/vyslednicey); //tady je potreba dokoncit aby to bylo v rozsahu 360stupnu
        
        return new Vektor(vyslednicevelikost, vyslednicesmer);
    }
    
    
}
