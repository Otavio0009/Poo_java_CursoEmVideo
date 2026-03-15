package Aula_02;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5;
        //c1.tampada = false;
        c1.carga = 90;
        c1.modelo = "Azul cristal";

        c1.tampada();
        c1.status();
        c1.rabiscar();

        System.out.println();

        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.5;
        c2.carga = 80;
        c2.modelo = "Hostnet";

        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
