package Models;

public class Audio {
    private String titulo;
    private String classificacao;
    private int totalDeCurtidas;
    private int totalDeReproducoes;
    private double duracao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void curtir(){
        this.totalDeCurtidas ++;
    }
    public void reproduzir(){
        this.totalDeReproducoes ++;
    }
}
