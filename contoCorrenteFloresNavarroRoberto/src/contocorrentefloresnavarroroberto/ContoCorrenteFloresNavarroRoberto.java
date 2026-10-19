/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contocorrentefloresnavarroroberto;

/**
 *
 * @author floresnavarro.robert
 */
public class ContoCorrenteFloresNavarroRoberto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //creazione oggetto persona
        Persona p1 = new Persona ("Roberto","Flores");
        //creazione del contocorrente
        ContoCorrente c1= new ContoCorrente (522,p1);
        
        //scelta attraverso random se prelevare(0) o versare(1) 
        int versaOPrelie = (int)(Math.random()*2);
        if (versaOPrelie== 0){
            //richiamo della funzione prelievo e lo salvo in un altra variabile intera (soldiP) cosi da poter poi stampare il saldo prevelevato
            int soldiP=c1.prelievoS(c1.getSoldi());
            //mi dice se i soldi del conto corrente sono in negativo se si esce errore se no stampa il prelievo e il saldo attuale dopo il prelievo
            if (c1.getSoldi() < 0)
            {
                System.out.println(p1.toString()+ "\nERRORE: il prelievo che e' stato fatto e maggiore del saldo a disposizione. Riprova");
            }
            else 
            {
                System.out.println(p1.toString()+"\nPRELIEVO AVVENUTO CON SUCCESSO:\nil saldo prelevato e' di: "+soldiP+"€"+c1.toString());
            }
        }
        // richiamo della funzione versamento e stampare il tutto
        else {
            int soldiV=c1.versamentoS(c1.getSoldi());
            System.out.println(p1.toString()+"\nVERSAMENTO AVVENUTO CON SUCCESSO:\nil saldo versato e' di: "+soldiV+"€"+c1.toString());
        }
        
    }
    
}
