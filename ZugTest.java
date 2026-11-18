

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZugTest{
    
@Test
    
public void test_printZug()
{
    
    Zug railjet;
    Zug regionalzug;
    railjet = new Zug ("Railjet", 7 , true);
    regionalzug = new Zug ( "Regionalzug" , 4 , false );
    railjet.printZug();
    // Railjet Zug: - 7 Wagen - klimatisiert
    regionalzug.printZug();
    //Regonalzug ZUg : 4 Wagen - nicht klimatisiert
}

}