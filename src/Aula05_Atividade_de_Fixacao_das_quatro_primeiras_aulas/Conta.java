package Aula05_Atividade_de_Fixacao_das_quatro_primeiras_aulas;

public class Conta {
    public int numConta;
    protected String tipo;
    private  String dono;
    private double saldo;
    private boolean status;

    // Metodos Especiais
    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Metodos personalizados

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if(tipo.equals("CC")) {
            
            this.setSaldo(50);
            
        } else if(tipo.equals("CP")) {
            
            this.setSaldo(100);
        }

        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if(this.getSaldo() > 0) {

            System.out.println("Conta não pode ser fechada, ainda tem dinheiro");

        } else if (this.getSaldo() < 0) {

            System.out.println("Conta não ppde ser feochada pois tem débito");

        } else {
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso");
        }

    }

    public void depositar(double valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta feichada");
        }
    }

    public void sacar(double valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
            }  else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar em uma conta feichada");
        }
    }

    public  void pagarMensal(String tipo) {
        int valor = 0;

        if (this.getTipo().equals("CC")) {
            valor = 20;
        } else if (this.getTipo().equals("CP")) {
            valor = 15;
        }

        if (this.isStatus()) {

            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade pagamento com sucesso por " + this.getDono());

        }  else {

            System.out.println("Impossivel pagar em uma conta feichada");
        }
    }

    public void extrato() {
        System.out.println("-----------------------");
        System.out.println("Conta: " +  this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());

    }
}
