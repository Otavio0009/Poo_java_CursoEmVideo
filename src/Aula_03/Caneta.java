package Aula_03;

public class Caneta {
    public String modelo;
    public String cor;
    protected int carga;
    private boolean tampada;
    private double ponta;

    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Errro! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampada() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Esta tampada: " + this.tampada);
        System.out.println("Tamaho da ponta: " + this.ponta);
        System.out.println("A carga é de: " + this.carga + "%");
    }
}
