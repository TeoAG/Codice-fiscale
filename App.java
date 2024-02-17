public class App {
    public static void main(String[] args) throws Exception {
        Cognome_Nome nome = new Cognome_Nome();
        Comuni c= new Comuni();
        Mese m=new Mese();
        Giorno_Gender giorno= new Giorno_Gender();
        Anno a=new Anno();
        Codice code=new Codice();
        nome.cognome();
        nome.nome(); 
        a.Anno();
        m.ListaMesi();
        giorno.GG();
        c.ListaComuni();
        code.stampa();
    }
}
