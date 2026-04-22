package Aula_08;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setCategoria() {
        if (this.peso < 52.2) {

            this.categoria = "Invalida";

        } else if (this.peso <= 70.3) {

            this.categoria = "Leve";

        } else if (this.peso <= 83.9) {

            this.categoria = "Médio";

        } else if (this.peso <= 120.2) {

            this.categoria = "Pesado";

        } else {

            this.categoria = "Invalida";
        }
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println("Tem " + this.getVitoria() + " Vitorias");
        System.out.println(this.getEmpates() + " Empates");
        System.out.println(this.getDerrota() + " Derotas");
    }

    public void ganharLuta(){
        setVitoria(getVitoria() + 1);
    }

    public void perderLuta(){
        setDerrota(getDerrota() + 1);
    }

    public void empatarluta(){
        setEmpates(getEmpates() + 1);
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(this.getVitoria() + " Vitorias");
        System.out.println(this.getDerrota() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
}
