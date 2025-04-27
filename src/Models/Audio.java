package Models;

public class Audio {
    private String titulo;
    // Classificação é sobre um rank
    private int classificacao;
    private int totalDeCurtidas;
    private int totalDeReproducoes;
    private int duracaoEmMinutos;

    // Metodos para curtir os Audios

    public void curtir(){
        this.totalDeCurtidas ++;
    }

    public void reproduzir(){
        this.totalDeReproducoes ++;
    }

    // Metodos para simular Visualizaçoes e Curtidas

    public void simularReproduçoes(int reproduçoes){
        for (int i = 0; i < reproduçoes ; i++) {
            this.reproduzir();
        }
    }

    public void simularCurtidas(int curtidas){
        for (int i = 0; i < curtidas ; i++) {
            this.curtir();
        }
    }

    // Metodo para apresentar um Audio

    public void apresentarAudio(){
        System.out.println("Nome: "+ getTitulo());
        System.out.println("Total de reproduçoes: "+ getTotalDeReproducoes());
        System.out.println("Total de curtidas: "+ getTotalDeCurtidas());
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getClassificacao() {
        return classificacao;
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
