/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contocorrentefloresnavarroroberto;

/**
 *
 * @author floresnavarro.robert
 */
public class Persona {
    //dichiarazione attributi
    private String nome;
    private String cognome;
    
    //metodo costruttore
    public Persona (String nome,String cognome){
        this.nome = nome;
        this.cognome=cognome;
    }
    //metodi getter
    /**
     *  Metodo get, serve per  leggere il valore di un attributo privato all’interno della classe
     * @return il nome dell'utente
     */
    public String getNome()
    {
        return this.nome;
    }
    /**
     *  Metodo get, serve per  leggere il valore di un attributo privato all’interno della classe
     * @return il cognome dell'utente
     */
    public String getCognome(){
        return this.cognome;
    }
    //metodi setter
    /**
     * metodi set serve per modificare un attributo privato all’interno della classe
     * @param nome 
     */
    public void setNome(String nome){
        this.nome=nome;
    }
    /**
     * metodi set serve per modificare un attributo privato all’interno della classe
     * @param cognome 
     */
    public void setCognome (String cognome){
        this.cognome=cognome;
    }
    //to string
    /**
     * modifica del metodo tostring
     * @return le descrizioni della persona nome e cognome
     */
    public String toString (){
        return "Buon pomeriggio signor/a: "+getNome()+" "+getCognome();
    }
}