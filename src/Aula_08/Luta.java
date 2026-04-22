package Aula_08;

import java.util.Random;

public class Luta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void marcarluta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria()) {
            if (l1.getNome() != l2.getNome()) {
                this.aprovado = true;
                this.desafiado = l1;
                this.desafiante = l2;
            }

        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovado) {

            System.out.println("Apresentado desafiante");
            this.desafiado.apresentar();

            System.out.println();

            System.out.println("Apresentado desafiante");
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiante.empatarluta();
                    this.desafiado.empatarluta();
                    break;
                case 1:
                    System.out.println("Luatdor " + this.desafiado.getNome() + " Venceu!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
                case 2:
                    System.out.println("Desafiante " + this.desafiante.getNome() + " Venceu!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        } else {

            System.out.println("Luta não pode aconteser!");
        }
    }
}
