package com.company;

public class Main {
    public static void main(String[] args) {
        Navegador raposa = new Navegador("Firefox","http://pesquisadores.uff.br/researcher/carlos-bazilio-martins");
        raposa.adicionaAba(new AbaAnonima("http://www.ic.uff.br/~bazilio/"));
        raposa.adicionaAba(new Aba("https://www.escavador.com/sobre/7717446/carlosbazilio-martins"));

        System.out.println(raposa.exibePaginas());
        raposa.proximaAba();
        raposa.acessaPagina("https://github.com/carlosbazilio");
        System.out.println(raposa.exibePaginas());
        raposa.proximaAba();
        raposa.acessaPagina("https://www.youtube.com/channel/UCCqz9CJtH17DSMU4KJs-mfQ");
        System.out.println(raposa.exibePaginas());
        raposa.proximaAba();
        raposa.fechaAba();
        System.out.println(raposa.exibePaginas());


    }
}
