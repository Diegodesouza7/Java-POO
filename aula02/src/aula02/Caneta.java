package aula02;
public class Caneta {
   public String modelo;
   public String cor;
   float ponta;
   protected int carga;
   protected boolean tampada;
    
   public void status() {
        System.out.println("Modelo" + this.modelo);
        System.out.println("Uma caneta" + this.cor);
        System.out.println("Ponta" + this.ponta);
        System.out.println("Carga" + this.carga);
        System.out.println("Está tampada ?" + this.tampada);
    }
   void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO ! não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando");
        }
    }
    
   protected void tampar() {
        this.tampada = true;    
    }
    
   protected void destampar() {
        this.tampada = false;
    }
}
