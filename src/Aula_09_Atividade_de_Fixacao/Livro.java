package Aula_09_Atividade_de_Fixacao;

import Aula_06.Controle;

import java.util.StringJoiner;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalDePagina;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalDePagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePagina = totalDePagina;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalDePagina() {
        return totalDePagina;
    }

    public void setTotalDePagina(int totalDePagina) {
        this.totalDePagina = totalDePagina;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public boolean verificacaoDePagina(int pagina){
        return pagina >= 1 && pagina <= this.getTotalDePagina();
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void feichado() {
        if (this.isAberto()) {
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int pagina) {
        if (!this.isAberto()) {
            System.out.println("O livro está fechado! Abra-o para folhear.");
            return;
        }

        if (this.verificacaoDePagina(pagina)) {
            this.setPaginaAtual(pagina);
        } else {
            System.out.println("Erro: A página " + pagina + " não existe!");
        }
    }

    @Override
    public void avancar() {
        if (this.isAberto()) {
            if (this.getPaginaAtual() >= this.getTotalDePagina()) {
                System.out.println("Você já chegou ao fim do livro!");
            } else {
                this.folhear(this.getPaginaAtual() + 1);
            }
        } else {
            System.out.println("Abra o livro primeiro!");
        }
    }

    @Override
    public void voltar() {
        if (this.isAberto()) {
            if (this.getPaginaAtual() <= 1) {
                System.out.println("Você já está na primeira página!");
            } else {
                this.folhear(this.getPaginaAtual() - 1);
            }
        } else {
            System.out.println("Abra o livro primeiro!");
        }
    }

    @Override
    public boolean iniciouLeitura() {
        return this.isAberto();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\nTitulo do Livro: '").append(this.titulo).append('\'');
        sb.append("\nAutor: '").append(this.autor).append('\'');
        sb.append("\nTotal De Pagina: ").append(this.totalDePagina);
        sb.append("\nPagina Atual: ").append(this.paginaAtual);

        if (this.aberto) {
            sb.append("\nO livro está aberto!");
        } else {
            sb.append("\nO livro está feichado!");
        }

        sb.append("\nQuem está com o livro é ").append(this.leitor.getNome());
        sb.append("\nSua idade é ").append(this.leitor.getIdade());
        sb.append("\nSeu sexo é ").append(this.leitor.getSexo());
        return sb.toString();
    }
}
