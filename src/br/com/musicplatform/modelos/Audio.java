package br.com.musicplatform.modelos;

public class Audio {
    //Atributos
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int curtidas;
    private int classificao;

    //Método Construtor

    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducao = 0;
        this.curtidas = 0;
        this.classificao = 0;
    }

    //Métodos Encapsulados
    public void repoduzir(){
        //A cada reproduzir contar um
        this.totalReproducao++;
        System.out.println("Reproduzindo: " + titulo);
    }

    public void curtir(){
        this.curtidas++;
        System.out.println("Curtiu + " + curtidas);
    }

    public void classificar(int novaClassificao){
        if (novaClassificao >=1 && novaClassificao <= 5){
            classificao = novaClassificao;
            System.out.println("Classificou " + titulo + "com" + novaClassificao);
        }
    }

    //Métodos Getters


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificao() {
        return classificao;
    }
}
