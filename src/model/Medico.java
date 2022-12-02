package model;

public class Medico extends GenericModel{
    public Medico(Integer id, String crm, String nome) {
        super(id);
        this.crm = crm;
        this.nome = nome;
    }

    private String crm;
    private String nome;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                "} " + super.toString();
    }
}

