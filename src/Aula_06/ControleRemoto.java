package Aula_06;

public class ControleRemoto implements Controle {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {

            System.out.println("----MENU----");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());

            for (int i = 0; i <= getVolume(); i += 10) {

                System.out.print(" |");
            }

        } else {

            System.out.println("Teve desligada!");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()){

            System.out.println(" Fechando Menu...");
        } else {

            System.out.println("Teve desligada!");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {

            this.setVolume(getVolume() + 5);
        } else {

            System.out.println("Teve desligada!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {

            this.setVolume(getVolume() - 5);
        } else {

            System.out.println("Teve desligada!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() &&  this.getVolume() > 0) {

            this.setVolume(0);

        } else {

            System.out.println("Teve desligada!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() &&  this.getVolume() == 0) {

            setVolume(50);
        } else {

            System.out.println("Teve desligada!");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {

            this.setTocando(true);
        } else {

            System.out.println("Teve desligada!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {

            this.setTocando(false);
        } else {

            System.out.println("Teve desligada!");
        }
    }
}
