package aula14;
public class Aula14 {
    public static void main(String[] args) {
       
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO 01");
        v[1] = new Video("Aula de JAVA 02");
        v[2] = new Video("Aula de HTML 03");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Diego", 27, "M", "dieguito");
        g[1] = new Gafanhoto("Alice", 19, "F", "alicita");
        
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
        
        
        vis[1] = new Visualizacao(g[0], v[0]);
        vis[1].avaliar();
        System.out.println(vis[1].toString());
        
    }
    
}
