import Models.Musicas;
import Models.Podcasts;

public class Main {
    public static void main(String[] args) {

        Musicas musica1 = new Musicas();

        musica1.setTitulo("Fix You");
        musica1.setCantor("ColdPlay");
        musica1.setDuracaoEmMinutos(4);

        musica1.simularCurtidas(100);
        musica1.simularReproduçoes(1000);

        Podcasts podcast1 = new Podcasts();

        // Titulo seria o nome do Podcast
        podcast1.setTitulo("InteraçãoDev");
        podcast1.setApresentador("Jovem Tranquilao");
        podcast1.setNomeDoEpisodio("Tamo codando em java, tamo codando em java?");
        podcast1.setNumeroDoEpisodio(1);

        podcast1.simularCurtidas(1000);
        podcast1.simularReproduçoes(1500);

        podcast1.apresentarAudio();
        System.out.println();
        musica1.apresentarAudio();
    }
}