package Aula_02.Atividade_de_Fixacao;

public class Main {
    public static void main(String[] args) {
        Estudar estudar = new Estudar();

        estudar.aluno = "Otavio";
        estudar.tempo = "1h";
        estudar.coteudo = "Poo java";
        estudar.material = "Livro";

        estudar.status();

        System.out.println();

        estudar.vai();
        estudar.fazExercicio();
        estudar.esta();
        estudar.fazerAtividade();

        System.out.println();

        Estudar estudar2 = new Estudar();

        estudar2.aluno = "Maria";
        estudar2.tempo = "1h";
        estudar2.coteudo = "Poo java";
        estudar2.material = "Livro";

        estudar2.status();

        System.out.println();

        estudar.naoVai();
        estudar2.naoExercicio();
        estudar2.esta();
        estudar2.fazerAtividade();
    }
}
