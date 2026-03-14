package Aula_02;

public class Caneta {
    String modelo;
    String cor;
    int carga;
    boolean tampada;
    double ponta;

    void rabiscar() {
        if (tampada == true) {
            System.out.println("Errro! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampada() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Esta tampada: " + this.tampada);
        System.out.println("Tamaho da tampa: " + this.ponta);
        System.out.println("A carga é de: " + this.carga + "%");
    }
}
