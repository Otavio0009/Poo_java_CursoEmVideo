package Aula_08;


public class Main {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "Estados Unidos da America", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Estados Unidos da America", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdard", "Brasil", 30, 1.90, 109.0, 20, 0, 1);

        Luta UEC01 = new Luta();
        UEC01.marcarluta(l[0], l[1]);
        UEC01.lutar();
    }
}
