package model;

public class Tipo_exame extends GenericModel{
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
        return "Tipo_exame{" +
                "descricao='" + descricao + '\'' +
                ", observacao='" + observacao + '\'' +
                "} " + super.toString();
    }
}
