public class EAN13 {

    /**
     * Classe che verifica la validità del codice EAN European Article Number
     * @author Corbino Piermaria 5^INF
     * @version 1.1
     * @since 10/05/2023
     */
    
    private String codice;

    /**
     * Metodo setCodice() - serve ad impostare il codice
     * @param c È il codice che verrà passato come parametro
     */
   
    public void setCodice(String c){
        codice = c;
    }

    /**
     * Metodo getCodice() - serve a restituire il codice
     * @return codice
     */

    public String getCodice(){
        return codice;
    }

    /**
     * 
     * Metodo verificaCodice() - serve a ad effettuare tutte le verifiche sul codice
     * 
     */


    public boolean verificaCodice(){


        /**
         * 
         * Verifica se l'attributo del codice è vuoto o nullo
         * 
         */
        if (codice.equals(null) || codice == ""){
            throw new NullPointerException("Il codice EAN-13 risulta vuoto o nullo");
        }

        

        /**
         * 
         * Verifica se la lunghezza dell'attributo codice è di 13
         * 
         */
        if(codice.length() != 13) {
            return false;
        }
        
        /**
         * 
         * Implementazione dell'algoritmo di calcolo della cifra di controllo
         * 
         */
        int somma = 0;
        int cifra;
        
        for(int i = 0; i < codice.length() - 1; i++) {   
            cifra = Character.getNumericValue(codice.charAt(i));
            
            if(i % 2 == 0) {
                somma += cifra * 1;  
            } else {
                somma += cifra * 3; 
            }
        }
        
        /**
         * 
         * Calcola la cifra di controllo
         * 
         */
        int cifraDiControllo = (10 - (somma % 10));

        /**
         * 
         * Confronta la cifra di controllo con quella contenuta nel codice EAN13 (ultima cifra)
         * 
         */
        return cifraDiControllo == Character.getNumericValue(codice.charAt(12)); 
    }


}
