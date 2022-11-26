package model;

public class Exame extends GenericModel{
    private Integer tipo_exame_id;
    private Integer material_exame_id;
    private String descricao;
    private String metodo;

    public Integer getTipo_exame_id() {
        return tipo_exame_id;
    }

    public void setTipo_exame_id(Integer tipo_exame_id) {
        this.tipo_exame_id = tipo_exame_id;
    }

    public Integer getMaterial_exame_id() {
        return material_exame_id;
    }

    public void setMaterial_exame_id(Integer material_exame_id) {
        this.material_exame_id = material_exame_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Exame{" +
                "tipo_exame_id=" + tipo_exame_id +
                ", material_exame_id=" + material_exame_id +
                ", descricao='" + descricao + '\'' +
                ", metodo='" + metodo + '\'' +
                "} " + super.toString();
    }
}
