public class TesteIphone {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador Internet
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
