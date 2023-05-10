
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class testEAN13 {
    EAN13 ean13 = new EAN13();
    @Before
    public void init(){
 
    }

    @Test
    public void testEanVerificaCodiceValido(){
        
        ean13.setCodice("3614273613422");
        assertTrue(ean13.verificaCodice());
        
    }


    @Test
    public void testEanVerificaCodiceNonValido(){
        ean13.setCodice("3614273613422");
        assertTrue(ean13.verificaCodice());
    }



    @Test
    public void testEanVerificaCodiceLunghezzaNonValida(){
        ean13.setCodice("3614273613422");
        assertTrue(ean13.verificaCodice());
            
    }

    @Test
    public void testEanVerificaCodiceVuoto(){
        ean13.setCodice("3614273613422");
        assertTrue(ean13.verificaCodice());
        
    }
}
