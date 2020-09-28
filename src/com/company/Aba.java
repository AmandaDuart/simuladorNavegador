package com.company;
import java.time.*;

public class Aba {
    private String url;
//    private LocalDateTime acessado;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Aba(String url){
        this.setUrl(url);
//        this.acessado = LocalDateTime.now();
    }
}
