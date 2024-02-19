public class App {
    public static void main(String[] args) throws Exception {
        Cognome_Nome nome = new Cognome_Nome();
        Comuni c= new Comuni();
        Mese m=new Mese();
        Giorno_Gender giorno= new Giorno_Gender();
        Anno a=new Anno();
        Codice code=new Codice();
        System.out.println("inserisci il cognome");
        nome.cognome();
        System.out.println("inserisci il nome");
        nome.nome(); 
        System.out.println("inserisci l'anno di nascita");
        a.Anno();
        System.out.println("inserisci il mese di nascita");
        m.ListaMesi();
        System.out.println("inserisci giorno di nascita e sesso");
        giorno.GG();
        System.out.println("inserisci il comune di origine");
        c.ListaComuni();
        code.stampa();
    }
}
