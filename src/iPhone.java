public class iPhone extends ReprodutorMusical {
    private AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
    private NavegadorInternet navegadorInternet = new NavegadorInternet();

    // Reprodutor Musical (herdado da classe ReprodutorMusical)
    public void tocar() {
        super.tocar();
    }

    public void pausar() {
        super.pausar();
    }

    public void selecionarMusica(String musica) {
        super.selecionarMusica(musica);
    }

    // Aparelho Telefônico
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atender() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    // Navegador Internet
    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
