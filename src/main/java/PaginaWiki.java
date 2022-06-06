public abstract class PaginaWiki {

    private String descricao;

    public PaginaWiki(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public PaginaWiki setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public abstract String getPaginaWiki();
}
