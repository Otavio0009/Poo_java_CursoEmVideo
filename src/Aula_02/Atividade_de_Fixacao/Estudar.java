package Aula_02.Atividade_de_Fixacao;

public class Estudar {
    boolean vai;
    String tempo;
    String coteudo;
    boolean exercicio;
    String material;
    String aluno;

    void vai(){
        this.vai = true;
    }

    void naoVai() {
        this.vai = false;
    }

    void fazExercicio(){
        this.exercicio = true;
    }

    void naoExercicio(){
        this.exercicio = false;
    }

    void esta(){
        if(this.vai == true){
            System.out.println(this.aluno + " está estudando!");
        } else {
            System.out.println(this.aluno + " não está estudando!");
        }
    }

    void fazerAtividade(){
        if (this.exercicio == true){
            System.out.println(this.aluno + " está fazendo o exercicio!");
        } else {
            System.out.println(this.aluno + " não está fazendo o exercicio!");
        }
    }

    void status(){
        System.out.println("Aluno: " + this.aluno);
        System.out.println("O aluno foi a aula: " +  this.vai);
        System.out.println("Estudou por quanto tempo: " + this.tempo);
        System.out.println("Qual foi o conteudo: " + this.coteudo);
        System.out.println("Fez exercicio: " + this.exercicio);
        System.out.println("Qual foi o material usado: " + this.material);
    }
}
