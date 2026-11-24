public class Zug
{
    private String bezeichnung;
    private int wagen;
    private boolean klimatisiert;
    
    public Zug ( String neuBezeichnung, int neuWagen, boolean neuKlimatisiert)
    {
        setBezeichnung (neuBezeichnung);
        setWagen( neuWagen);
        setKlimatisiert( neuKlimatisiert);
    }
    
    public Zug ( String neubezeichnung, int neuWagen)
    {
        setBezeichnung ( neubezeichnung);
        setWagen( neuWagen);
        setKlimatisiert( false );
    }
    
    public Zug ( String neuBezeichnung)
    {
        setBezeichnung( neuBezeichnung);
        setWagen( 0 );
        setKlimatisiert( false );
    }
    
    public Zug ( )
    {
        setBezeichnung( "UNKN");
        setWagen( 0);
        setKlimatisiert( false);
    }
    
    public String getBezeichnung()
    {
        return bezeichnung;
    }
    
    public int getWagen()
    {
        return wagen;
    }
    
    public boolean getKlimatisiert()
    {
        return klimatisiert;
    }
    
    public void setBezeichnung( String neuBezeichnung)
    {
        bezeichnung = neuBezeichnung;
    }
    
    public void setWagen( int neuWagen)
    {
        wagen = neuWagen;
    }
    
    public void setKlimatisiert( boolean neuKlimatisiert)
    {
        klimatisiert = neuKlimatisiert;
    }
    
    public void printZug()
    {
        if ( klimatisiert == true )
        {
            System.out.println( bezeichnung + " Zug : " + wagen + " Wagen -  klimatisiert");
        }
        
        else 
        {
            System.out.println( bezeichnung + " Zug : " + + wagen + " Wagen - nicht klimatisiert" );
        }
    }
    
    /*
     
     @Test
    public void test_printZug()
    {
        Zug railjet;
        Zug regionalzug;
        railjet = new Zug ("Railjet", 7 , true);
        regionalzug = new Zug ( "Regionalzug" , 4 , false );
        railjet.printZug();
        // Railjet Zug: - 7 Wagen - klimatisiert
        regional.printZug();
        //Regonalzug ZUg : 4 Wagen - nicht klimatisiert
    } 
    
     */
    
    
}