/**
 * CD - Inserisci metadati del CD e restituisce altrettanti
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 10/10/2019)
 */
public class CD
{
    private String titolo;
    private String autore;
    private int numeroBrani;
    private double durata;
    
    public CD(String titolo, String autore, int numeroBrani, double durata)
    {
        setTitolo(titolo);
        setAutore(autore);
        setnumeroBrani(numeroBrani);
        setDurata(durata);
    }
    
    private void setTitolo(String t)
    {
        titolo=t;
    }
    
    private void setAutore(String a)
    {
        autore=a;
    }
    
    private void setnumeroBrani(int nb)
    {
        numeroBrani=nb;
    }
    
    private void setDurata(double d)
    {
        durata=d;
    }
    
    public String getTitolo()
    {
        return titolo;
    }
    
    public String getAutore()
    {
        return autore;
    }
    
    public int getNumeroBrani()
    {
        return numeroBrani;
    }
    
    public double getDurata()
    {
        return durata;
    }
    
    public String toString()
    {
        return "CD\n" + 
        "Titolo: " + getTitolo() + "\nAutore: " + getAutore() + "\nNumero brani: " + getNumeroBrani() + "\nDurata: " + getDurata() + "\n";
    }
    
    public String compareAnno(CD a)
    {
        if(getDurata() > a.getDurata())
        {
            return getTitolo() + " dura di più di " + a.getTitolo();
        }
        else if(getDurata() < a.getDurata())
        {
            return getTitolo() + " dura di meno di " + a.getTitolo();
        }
        else
        {
            return getTitolo() + a.getTitolo() + " sono stati prodotti lo stesso anno";
        }
    }
}
