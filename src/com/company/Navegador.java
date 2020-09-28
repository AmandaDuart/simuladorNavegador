package com.company;

import java.util.ArrayList;

public class Navegador {
    private String navegador;
    private ArrayList<Aba> abas;
    private int abaAtual;

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public ArrayList<Aba> getAbas() {
        return abas;
    }

    public void setAbas(int index, String url) {
        this.abas.get(index).setUrl(url);
    }

    public void adicionaAba(Aba url){
        this.abas.add(url);
    }

    public String exibePaginas(){
        String retorno = "";
        int i = 0;
        for(Aba a: abas){
            retorno = retorno +"Abas "+ i  +" : "+ a.getUrl() +"\n";
            i++;
        }
        return (retorno);
    }
    public void proximaAba(){
        this.abaAtual = abaAtual+1;
        if (this.abaAtual > this.abas.size()-1) {
            this.abaAtual = 0;
        }
    }

    public void acessaPagina(String url){
       this.setAbas(this.abaAtual, url);
    }
    public  void fechaAba(){
        this.abas.remove(this.abaAtual);
    }
    public Navegador(String navegador, String url){
        this.setNavegador(navegador);

        Aba pAba = new Aba(url);
        if(url.isBlank()){
            pAba.setUrl("http://www.uff.br/");
        }
        this.abas = new ArrayList<Aba>();
        this.adicionaAba(pAba);

        this.abaAtual = 0;
    }
}
