package model;

public class Composicao_exame extends GenericModel{
    private String descricao;
    private Integer unidade_medida_id;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getUnidade_medida_id() {
        return unidade_medida_id;
    }

    public void setUnidade_medida_id(Integer unidade_medida_id) {
        this.unidade_medida_id = unidade_medida_id;
    }

    @Override
    public String toString() {
        return "Composicao_exame{" +
                "descricao='" + descricao + '\'' +
                ", unidade_medida_id=" + unidade_medida_id +
                "} " + super.toString();
    }
}
