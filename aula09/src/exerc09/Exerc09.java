
package exerc09;
public class Exerc09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Diego", 27, "M");
        p[1] = new Pessoa("Alice", 18, "F");
        
        l[0] = new Livro("Harry Potter e as Reliqueas da Morte", "J.K.R", 600, p[0]);
        l[1] = new Livro("Harry Potter e a Pedra Filosofal", "J.K.R", 400, p[1]);
        l[2] = new Livro("Animais Fantasticos", "J.K.R", 300, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avanPage();
        
        l[1].abrir();
        l[1].folhear(90);
        l[1].avanPage();
        
        
        System.out.println(l[0].detalhes());
        
        System.out.println("============================");
        
        System.out.println(l[1].detalhes());
        
    }
    
}
