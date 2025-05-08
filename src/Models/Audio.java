package Models;

public class Audio {
    private String titulo;
    private int totalDeCurtidas;
    private int totalDeReproducoes;
    private int duracaoEmMinutos;

    public Audio(String titulo, int totalDeCurtidas, int totalDeReproducoes, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.totalDeCurtidas = totalDeCurtidas;
        this.totalDeReproducoes = totalDeReproducoes;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Metodos para curtir os Audios e "Reproduzir"

    public void curtir(){
        this.totalDeCurtidas ++;
    }

    public void reproduzir(){
        this.totalDeReproducoes ++;
    }

    // Metodo para apresentar um Audio

    public void apresentarAudio(){
        System.out.println("Nome: "+ getTitulo());
        System.out.println("Total de reproduçoes: "+ getTotalDeReproducoes());
        System.out.println("Total de curtidas: "+ getTotalDeCurtidas());
    }

    // Metodos para simular Visualizaçoes e Curtidas
    public void simularReproducoes(int reproducoes){
        for (int i = 0; i < reproducoes ; i++) {
            this.reproduzir();
        }
    }

    public void simularCurtidas(int curtidas){
        for (int i = 0; i < curtidas ; i++) {
            this.curtir();
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Os Setters das curtidas e reproduçoes nao sao criados para evitar modificaçoes invalidas
    // As curtidas e reproduçoes so podem ser alterados atraves dos metodos
    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        if (duracaoEmMinutos > 0){
            this.duracaoEmMinutos = duracaoEmMinutos;
        }
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
