package aula10;
public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Diego");
        p1.setSexo("M");
        p1.setIdade(27);
        
        p2.setNome("Maria");
        p2.setSexo("F");
        p2.setIdade(24);
        p2.setCurso("Informatica");
        p2.cancelarCurso();
        
        
        p3.setNome("Claudio");
        p3.setSexo("M");
        p3.setIdade(47);
        p3.setSalario(3000.75f);
        p3.receberAumento(500.00f);
        
        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setIdade(22);
        p4.setSetor("Estoque");
        p4.mudarTrab();
        
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
