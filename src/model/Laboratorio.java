package model;

public class Laboratorio extends GenericModel {
    public Laboratorio(Integer id, String descricao, String CNES, String CNPJ, String CRBM, String nome_fantasia) {
        super(id);
        this.descricao = descricao;
        this.CNES = CNES;
        this.CNPJ = CNPJ;
        this.CRBM = CRBM;
        this.nome_fantasia = nome_fantasia;
    }

    private String descricao;
    private String CNES;
    private String CNPJ;
    private String CRBM;
    private String nome_fantasia;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCNES() {
        return CNES;
    }

    public void setCNES(String CNES) {
        this.CNES = CNES;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCRBM() {
        return CRBM;
    }

    public void setCRBM(String CRBM) {
        this.CRBM = CRBM;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "id='" + this.getId() + '\'' +
                ", descricao='" + descricao + '\'' +
                ", CNES='" + CNES + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", CRBM='" + CRBM + '\'' +
                ", nome_fantasia='" + nome_fantasia + '\'' +
                '}';
    }
}
