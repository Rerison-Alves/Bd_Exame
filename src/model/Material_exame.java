package model;

public class Material_exame extends GenericModel{
    private String material;
    private String observacao;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Material_exame{" +
                "material='" + material + '\'' +
                ", observacao='" + observacao + '\'' +
                "} " + super.toString();
    }
}
