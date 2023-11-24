package br.com.musicplatform.modelos;

public class Podcast extends Audio{
    public Podcast(String titulo, int duracao) {
        super(titulo, duracao);
    }
    private String host;

    //Getters e Setters

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
