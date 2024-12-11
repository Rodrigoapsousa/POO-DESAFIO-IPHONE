## Desafio DIO-POO_iphone
Reprodutor Musical
Métodos: tocar(), pausar(), selecionarMusica(String musica)
Aparelho Telefônico
Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
Navegador na Internet
Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

## Folder Structure

Java
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

- `src`: C:\estudos dio\POO-DESAFIO-IPHONE\src
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Diagrama UML 
classDiagram
    class ReprodutorMusical {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class AparelhoTelefonico {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class NavegadorInternet {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet


