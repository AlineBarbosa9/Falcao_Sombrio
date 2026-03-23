package enums;

public enum NivelAcesso {
    COMANDANTE(1, "Acesso Total e Autorização de Missão"),
    SOLDADO(2, "Acesso a Telemetria e Monitoramento de Campo");

    private final int prioridade;
    private final String descricao;

    NivelAcesso(int prioridade, String descricao) {
        this.prioridade = prioridade;
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDescricao() {
        return descricao;
    }
}
