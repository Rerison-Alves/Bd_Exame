package model;

public class Unidade_medida extends GenericModel{
    public Unidade_medida(Integer id, String descricao) {
        super(id);
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Unidade_medida{" +
                "descricao='" + descricao + '\'' +
                "} " + super.toString();
    }
}
