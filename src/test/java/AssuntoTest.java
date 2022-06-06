import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssuntoTest {

    @Test
    void deveRetornarArtigoSobreAssunto() {

        Artigo artigo1 = new Artigo("Viajando pelos coworkings do mundo");

        Artigo artigo2 = new Artigo("A segmentação dos coworkings");
        Glossario glossario21 = new Glossario("coworkings", "significado_coworkings");
        artigo2.addPagina(glossario21);

        Artigo artigo3 = new Artigo("Um guia para colocar ordem no seu coworking");
        Glossario glossario31 = new Glossario("funcionario", "significado_funcionario");
        Glossario glossario32 = new Glossario("trabalho", "significado_trabalho");
        artigo3.addPagina(glossario31);
        artigo3.addPagina(glossario32);

        Artigo coworking = new Artigo("O que é coworking?");
        coworking.addPagina(artigo1);
        coworking.addPagina(artigo2);
        coworking.addPagina(artigo3);

        Assunto assunto = new Assunto ();
        assunto.setPagina(coworking);

        assertEquals("Artigo: O que é coworking?\n" +
                "Artigo: Viajando pelos coworkings do mundo\n" +
                "Artigo: A segmentação dos coworkings\n" +
                "Glossario: coworkings - significado: significado_coworkings\n" +
                "Artigo: Um guia para colocar ordem no seu coworking\n" +
                "Glossario: funcionario - significado: significado_funcionario\n" +
                "Glossario: trabalho - significado: significado_trabalho\n", assunto.getPagina());

    }

    @Test
    void deveRetornarExecacaoDisciplinaSemEmenta() {
        try {
            Assunto assunto = new Assunto();
            assunto.getPagina();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Assunto sem conteúdo.", e.getMessage());
        }
    }

}