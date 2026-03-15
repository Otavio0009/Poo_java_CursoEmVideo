package Aula_03;

public class Main {
    static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "BIC Cristal";
        c1.cor = "Vermelho";

        // c1.ponta = 0.5;

        c1.carga = 100;
        // c1.tampada = false;

        c1.destampar();

        c1.status();

        c1.rabiscar();
    }
}
