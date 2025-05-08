package Main;

import Models.Musicas;
import Models.Podcasts;

public class Main {
    public static void main(String[] args) {

        Musicas musica1 = new Musicas("Fix You",100,1000,4,"ColdPlay", null);

        // Adicionando mais curtidas e visualizações
        musica1.simularCurtidas(100);
        musica1.simularReproducoes(1000);

        Podcasts podcast1 = new Podcasts("InteraçãoDev",1000,5000,120,
                "Tamo codando em java, tamo codando em java?",1,
                "Jovem Tranquilao","Podcast focado em converter pessoas para codar em java");

        // Adicionando mais curtidas e visualizações
        podcast1.simularCurtidas(1000);
        podcast1.simularReproducoes(1500);

        podcast1.apresentarAudio();
        System.out.println();
        musica1.apresentarAudio();
    }
}