import java.util.ArrayList;
import java.util.List;

public class Artigo extends PaginaWiki {

    private List<PaginaWiki> paginasWiki;

    public Artigo (String descricao) {
        super(descricao);
        this.paginasWiki = new ArrayList<>();
    }

    public void addPagina(PaginaWiki pagina){
        this.paginasWiki.add(pagina);
    }

    public String getPaginaWiki() {
        String saida = "";
        saida = "Artigo: " + this.getDescricao() + "\n";
        for (PaginaWiki pagina : paginasWiki) {
            saida += pagina.getPaginaWiki();
        }
        return saida;
    }
}
