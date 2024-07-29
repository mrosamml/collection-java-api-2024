package main.maps.Ordenacao;

public class Eventos {
    private String nomeEvento;
    private String atracao;

    public Eventos(String nomeEvento, String atracao) {
        this.nomeEvento = nomeEvento;
        this.atracao = atracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
