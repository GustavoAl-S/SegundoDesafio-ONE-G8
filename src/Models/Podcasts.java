package Models;

public class Podcasts extends Audio{
    private String nomeDoEpisodio;
    private int numeroDoEpisodio;
    private String apresentador;
    private String descricao;

    public Podcasts(String titulo, int totalDeCurtidas, int totalDeReproducoes, int duracaoEmMinutos, String nomeDoEpisodio, int numeroDoEpisodio,
                    String apresentador, String descricao) {
        super(titulo, totalDeCurtidas, totalDeReproducoes, duracaoEmMinutos);
        this.nomeDoEpisodio = nomeDoEpisodio;
        this.numeroDoEpisodio = numeroDoEpisodio;
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    @Override
    public void apresentarAudio() {
            System.out.println("Podcast: " + getTitulo());
            System.out.println("Apresentador: " + getApresentador());
            System.out.println("Episódio: " + getNumeroDoEpisodio() + " - " + getNomeDoEpisodio());
            System.out.println("Descrição: " + getDescricao());
            System.out.println("Total de curtidas: " + getTotalDeCurtidas());
            System.out.println("Total de reproduções: " + getTotalDeReproducoes());
    }

    public String getNomeDoEpisodio() {
        return nomeDoEpisodio;
    }

    public void setNomeDoEpisodio(String nomeDoEpisodio) {
        this.nomeDoEpisodio = nomeDoEpisodio;
    }

    public int getNumeroDoEpisodio() {
        return numeroDoEpisodio;
    }

    public void setNumeroDoEpisodio(int numeroDoEpisodio) {
        this.numeroDoEpisodio = numeroDoEpisodio;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
