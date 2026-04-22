package Aula_09_Atividade_de_Fixacao;

public interface Publicacao {
    public void abrir();
    public void feichado();
    public void folhear(int pagina);
    public void avancar();
    public void voltar();
    public boolean iniciouLeitura();
}
