# ProgettoContoCorrenteFloresNavarroRoberto


DOCUMENTAZIONE DEL MIO CODICE:



CLASSE PERSONA:

Questa classe si occupa esclusivamente di gestire l'anagrafica e l'identità del titolare del conto corrente.



Attributi: private String nome: Memorizza il nome proprio della persona (es. "Roberto"). È privato per garantire che non venga modificato accidentalmente

&#x09;   private String cognome: Memorizza il cognome della persona (es. "Flores"). Anch'esso privato per evitare di modificarlo




Metodi:  public Persona(String nome, String cognome): Costruttore della classe. Serve a inizializzare un nuovo oggetto Persona assegnando subito il nome e il cognome 	   	 passati come parametri al momento della creazione.

&#x09; public String getNome(): Metodo Getter. Permette alle classi esterne di leggere il valore dell'attributo privato nome.

&#x09; public void setNome(String nome): Metodo Setter. Permette di modificare il nome della persona dall'esterno (nel main).

&#x09; public String getCognome(): Metodo Getter. Permette alle classi esterne di leggere il valore dell'attributo privato cognome.

&#x09; public void setCognome(String cognome): Metodo Setter. Consente la modifica del cognome dall'esterno della classe.

&#x09; public String toString():metodo modificato in modo tale da poter visualizzare il nome e il cognome del titolare del conto corrente.



CLASSE CONTOCORRENTE:

Questa classe contiene come avviene un versamento o prelievo



ATTRIBUTI: private int soldi: Rappresenta il saldo monetario attuale disponibile sul conto corrente. È di tipo int per evitare decimali complessi ed è privato per impedire 	  	   di essere modificato.

&#x09;   private Persona utente: Rappresenta il titolare del conto. È un attributo di tipo oggetto (Persona).

&#x09;

METODI:	 public ContoCorrente(int soldi, Persona utente): Costruttore della classe. Inizializza il conto corrente impostando il saldo iniziale e associando l'oggetto Persona 	 che farà da titolare del conto.

&#x09; public int getSoldi(): Metodo Getter. È fondamentale perché permette alle altre classi (incluso il Main per i controlli nell'if) di leggere quanti soldi ci sono 	 attualmente sul conto, senza poterne modificare direttamente la variabile.

&#x09; public void setSoldi(int soldi): Metodo Setter. Permette di sovrascrivere direttamente il saldo del conto dall'esterno (se necessario per azzeramenti o impostazioni 	 manuali).

&#x09; public int versamentoS(int soldi):Genera un importo casuale compreso tra 1 e 200, lo somma al saldo attuale del conto e restituisce l'esatto importo di versamento 	 (permette la stampa nel main)

&#x09; public int prelievoS(int soldi):Genera un importo casuale compreso tra 1 e 540, lo sottrae dal saldo attuale del conto e restituisce l'importo che e' stato sottratto

&#x09; public String toString(): restituisce i valori (soldi) del conto corrente in €







