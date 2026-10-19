/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contocorrentefloresnavarroroberto;

/**
 *
 * @author floresnavarro.robert
 */
public class ContoCorrente {
    //dichiarazione attributi
    private int soldi;
    private Persona utente;
    
    //metodo costruttore
    public ContoCorrente(int soldi,Persona utente){
        this.soldi = soldi;
        this.utente = utente;
    }
    //metodi getter
    /**
     * Metodo get, serve per  leggere il valore di un attributo privato all’interno della classe
     * @return i soldi attuali che si trovano nel conto corrente
     */
    public int getSoldi(){
        return this.soldi;
    }
    //metodi setter
    /**
     * metodi set serve per modificare un attributo privato all’interno della classe
     * @param soldi 
     */
    public void setSoldi(int soldi){
        this.soldi=soldi;
    }
    
    //metodi della classe
    /**
     * serve per versare una quantita di soldi (random) al conto corrente 
     * @param soldi
     * @return la quantita (il numero) di soldi versati
     */
    public int versamentoS (int soldi){        
        int sVersamento = (int) (Math.random()*201)+1;
        soldi = sVersamento;
        this.soldi += sVersamento;
        return soldi;
    }
    /**
     * serve per prelevare una quantita di soldi (random) dal conto corrente
     * @param soldi
     * @return quantita (il numero) di soldi prelevati
     */
    public int prelievoS (int soldi){
        int sPrelievo = (int) (Math.random()*541)+1;
        soldi = sPrelievo;
        this.soldi-= sPrelievo;
        return soldi;
    }
    /**
     * modifica del metodo tostring
     * @return il valore (i soldi) del conto corrente.
     */
    //tostring
    public String toString (){
        return "\nil suo conto corrente ha attualmente: "+getSoldi()+"€"; 
    }
    
    
}
