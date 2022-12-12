package model;

import java.util.List;

public class Medico extends GenericModel{
    private String crm;
    private String nome;

    private List<Especialidade> especialidades;
    public Medico(Integer id, String crm, String nome) {
        super(id);
        this.crm = crm;
        this.nome = nome;
    }
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

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                "} " + super.toString();
    }
}

