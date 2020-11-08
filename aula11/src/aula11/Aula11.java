package aula11;
public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno al = new Aluno();
        Bolsista b1 = new Bolsista();
        
        al.setNome("Diego");
        al.setIdade(27);
        al.setSexo("M");
        
        v1.setNome("Amanda");
        v1.setIdade(30);
        v1.setSexo("F");
        
        b1.setNome("Alice");
        b1.setIdade(18);
        b1.setSexo("F");
        
    }
    
}
