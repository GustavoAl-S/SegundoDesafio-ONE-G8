package Models;

public class Musicas extends Audio{
    private String cantor;
    private String genero;

    public Musicas(String titulo, int totalDeCurtidas, int totalDeReproducoes, int duracaoEmMinutos, String cantor, String genero) {
        super(titulo, totalDeCurtidas, totalDeReproducoes, duracaoEmMinutos);
        this.cantor = cantor;
        this.genero = genero;
    }

    @Override
    public void apresentarAudio() {
        System.out.println("Música: " + getTitulo());
        System.out.println("Cantor: " + getCantor());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Total de curtidas: " + getTotalDeCurtidas());
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
