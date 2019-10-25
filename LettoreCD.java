
/**
 * Aggiungi qui una descrizione della classe LettoreCD
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class LettoreCD
{
    private CD disco;
    private String marca;
    private boolean acceso;
    
    public LettoreCD(String marca)
    {
        disco=null;
        acceso=false;
        setMarca(marca);
    }
    
    private void setMarca (String m)
    {
        marca=m;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public void inserisci(CD disco)
    {
        this.disco=disco;
    }
    
    public void estrai()
    {
        this.disco=null;
    }
    
    public String toString()
    {
        String s="";
        if(this.disco==null)    
            s="Il lettore CD è vuoto.\n";
        else
            s="LETTORE CD\n"+ getMarca() + " CD Inserito: " + disco.toString();
       
        return s;
    }
}
