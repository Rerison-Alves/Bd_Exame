package model;

public class Habilitacao_exame extends GenericModel{
    private String observacao;
    private Double custo;
    private Integer laboratorio_id;
    private Integer tipo_exame_id;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Integer getLaboratorio_id() {
        return laboratorio_id;
    }

    public void setLaboratorio_id(Integer laboratorio_id) {
        this.laboratorio_id = laboratorio_id;
    }

    public Integer getTipo_exame_id() {
        return tipo_exame_id;
    }

    public void setTipo_exame_id(Integer tipo_exame_id) {
        this.tipo_exame_id = tipo_exame_id;
    }

    @Override
    public String toString() {
        return "Habilitacao_exame{" +
                "observacao='" + observacao + '\'' +
                ", custo=" + custo +
                ", laboratorio_id=" + laboratorio_id +
                ", tipo_exame_id=" + tipo_exame_id +
                "} " + super.toString();
    }
}
