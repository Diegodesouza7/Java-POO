
package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.ponta = 0.5f;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Vermeha";
        c2.modelo = "Faber";
        c2.ponta = 0.5f;
        c2.destampar();
        
        c2.status();
        c2.rabiscar();
    }
    
    
}
