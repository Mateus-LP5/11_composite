public class Glossario extends PaginaWiki {

    private String significado;

    public Glossario(String descricao, String significado) {
        super(descricao);
        this.significado = significado;
    }

    public String getSignificado() {
        return significado;
    }

    public Glossario setSignificado(String significado) {
        this.significado = significado;
        return this;
    }

    public String getPaginaWiki() {
        return "Glossario: " + this.getDescricao() + " - significado: " + this.significado + "\n";
    }
}
