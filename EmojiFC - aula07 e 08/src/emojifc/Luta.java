
package emojifc;

import java.util.Random;


public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    // Metodos Publicos
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())&& l1 != l2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("========== RESULTADO ==========");
            switch(vencedor) {
                case 0: //EMPATE
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: //DESAFIANTE VENCE
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2: //DESAFIADO VENCE
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
            System.out.println("====================");
        }else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    // Metodos Especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }
    
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
