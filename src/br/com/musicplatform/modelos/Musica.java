package br.com.musicplatform.modelos;

public class Musica extends Audio{
    public Musica(String titulo, int duracao) {
        super(titulo, duracao);
    }
    //Atributo
    private String Artista;

    //getters e setters
    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }
}
