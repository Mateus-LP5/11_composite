public class Assunto {

    private PaginaWiki pagina;

    public void setPagina(PaginaWiki pagina) {
        this.pagina = pagina;
    }

    public String getPagina() {
        if (this.pagina == null){
            throw new NullPointerException("Assunto sem conteúdo.");
        }
        return this.pagina.getPaginaWiki();
    }
}
