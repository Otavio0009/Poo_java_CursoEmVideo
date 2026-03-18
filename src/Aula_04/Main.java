package Aula_04;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.1, "Vinho");

        //  c1.modelo = "BIC"; ou
        // c1.setModelo("BIC");
        // c1.setPonta(2.5);

        // System.out.println("Sobre a caneta \n" + "Modelo: " + c1.getModelo() + "Tamaho da ponta: " + c1.getPonta());

        c1.status();

        System.out.println();

        Caneta c2 = new Caneta("NIKA", 0.3, "Amarelo");
        c2.status();
    }
}
