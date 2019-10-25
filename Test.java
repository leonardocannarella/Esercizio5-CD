
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 10/10/2019)
 */
public class Test
{
    public static void main (String[] args)
    {
        LettoreCD c;
        CD a, b;
        a = new CD("Cheap Thrills", "SIA", 10, 40.10);
        b = new CD("Happier", "Marshmello", 25, 30.20);
        c = new LettoreCD("Sony");
        //System.out.println(a.toString());
        //System.out.println(b.toString());
        c.inserisci(a);
        
        System.out.println(c.toString());
        System.out.println(a.compareAnno(b));
        
    }
}
