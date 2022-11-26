package model;

public class Responsavel_tecnico extends GenericModel{
    private String nome;
    private String conselho;
    private String formacao;
    private Integer sigla_formacao_id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConselho() {
        return conselho;
    }

    public void setConselho(String conselho) {
        this.conselho = conselho;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Integer getSigla_formacao_id() {
        return sigla_formacao_id;
    }

    public void setSigla_formacao_id(Integer sigla_formacao_id) {
        this.sigla_formacao_id = sigla_formacao_id;
    }

    @Override
    public String toString() {
        return "Responsavel_tecnico{" +
                "nome='" + nome + '\'' +
                ", conselho='" + conselho + '\'' +
                ", formacao='" + formacao + '\'' +
                ", sigla_formacao_id=" + sigla_formacao_id +
                "} " + super.toString();
    }
}
