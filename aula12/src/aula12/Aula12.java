package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldf g = new Goldf();
        Arara e = new Arara();
        
        c.locomover();
        c.emitirSom();  
        k.locomover();
        k.emitirSom();
    }
    
}