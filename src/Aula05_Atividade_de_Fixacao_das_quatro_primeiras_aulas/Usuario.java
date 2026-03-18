package Aula05_Atividade_de_Fixacao_das_quatro_primeiras_aulas;

public class Usuario {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.abrirConta("CC");

        conta.setNumConta(111119);

        conta.setDono("Otavio");
        conta.depositar(1000);
        conta.sacar(200);
        conta.pagarMensal("CC");

        conta.extrato();

        System.out.println();

        Conta conta2 = new Conta();

        conta2.abrirConta("CP");

        conta2.setNumConta(1111110);

        conta2.setDono("Olivia");
        conta2.depositar(500);
        conta2.sacar(30);
        conta2.pagarMensal("CP");

        conta2.extrato();

        System.out.println();

        Conta conta3 = new Conta();

        conta3.abrirConta("CC");

        conta3.setNumConta(1111111);

        conta3.setDono("Osvaldo");
        conta3.depositar(100);
        conta3.sacar(150);

        conta3.fecharConta();

        conta3.extrato();

    }
}
