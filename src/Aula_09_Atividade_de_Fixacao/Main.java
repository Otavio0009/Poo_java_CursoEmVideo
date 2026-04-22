package Aula_09_Atividade_de_Fixacao;

public class Main {
    static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Otávio", 19, "Masculino");
        p[1] = new Pessoa("Oliviá", 18, "Feminino");
        p[2] = new Pessoa("Ofélia", 20, "Feminino");

        l[0] = new Livro("Mitologia Nórdica", "Claudio blanc", 114, p[0]);
        l[1] = new Livro("Mitologia Grega", "Claudio Blanc", 150, p[1]);
        l[2] = new Livro("Mitologia Egispcia", "Claudio Blanc", 200, p[2]);

        l[0].iniciouLeitura();
        l[0].abrir();
        l[0].folhear(13);
        l[0].avancar();
        l[0].avancar();
        l[0].voltar();
        System.out.println(l[0].toString());

        System.out.println();

        l[1].iniciouLeitura();
        l[1].abrir();
        l[1].folhear(100);
        l[1].avancar();
        l[1].avancar();
        l[1].feichado();
        System.out.println(l[1].toString());

        System.out.println();

        l[2].iniciouLeitura();
        l[2].abrir();
        l[2].folhear(300);
        l[2].avancar();
        l[2].feichado();
        System.out.println(l[2].toString());
    }
}
