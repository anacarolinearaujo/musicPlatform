package br.com.musicplatform.modelos;

public class Audio {
    //Atributos
    private String titulo;
    private int totalReproducao;
    private int classificao;


    //Métodos Encapsulados
    public void reproduzir(){
        //A cada reproduzir contar um
        this.totalReproducao++;
        System.out.println("Reproduzindo: " + titulo);
    }


    public void classificar(int novaClassificao){
        if (novaClassificao >=1 && novaClassificao <= 5){
            classificao = novaClassificao;
            System.out.println("Classificou " + titulo + " com nota " + novaClassificao);
        }
    }


    //Métodos Getters


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }


    public int getClassificao() {
        return classificao;
    }
}
