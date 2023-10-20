package iphone;

public class Iphone implements aparelhoTelefonico, reprodutorMusical, navegadorInternet {

    public void ligar() {
        System.out.println("Fazendo Ligação...");
    }

    public void atender() {
        System.out.println("Ligação Atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo Página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página Web...");
    }

    public void tocar() {
        System.out.println("Tocando Música...");
    }

    public void pausar() {
        System.out.println("Música Pausada.");
    }

    public void selecionarMusica() {
        System.out.println("Música Selecionada.");
    }
}