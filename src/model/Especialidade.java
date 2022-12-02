package model;

public class Especialidade extends GenericModel{
    public Especialidade(Integer id, String descricao, String observacao) {
        super(id);
        this.descricao = descricao;
        this.observacao = observacao;
    }

    private String descricao;
    private String observacao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Especialidade{" +
                "descricao='" + descricao + '\'' +
                ", observacao='" + observacao + '\'' +
                "} " + super.toString();
    }
}
