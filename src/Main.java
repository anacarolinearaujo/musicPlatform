import br.com.musicplatform.modelos.Musica;
import br.com.musicplatform.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        //Instancia objeto Música
        Musica audio1 = new Musica();
        audio1.setTitulo("Young And Beautiful");
        audio1.setArtista("Lana Del Rey");
        audio1.classificar(5);
        audio1.reproduzir();
        audio1.reproduzir();
        audio1.reproduzir();
        System.out.println("Total de Reprodução: " + audio1.getTotalReproducao());

        //Instancia objeto Podcast
        Podcast audio2 = new Podcast();
        audio2.setTitulo("Modus Operandi");
        audio2.setHost(" Carol Moreira e Mabê Bonafé");
        audio2.classificar(5);
        audio2.reproduzir();
        audio2.reproduzir();
        System.out.println("Total de Reprodução: " + audio2.getTotalReproducao());





    }
}