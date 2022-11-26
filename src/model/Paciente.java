package model;

import java.util.Date;

public class Paciente extends GenericModel{
    private String nome;
    private Date dt_nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", dt_nascimento=" + dt_nascimento +
                "} " + super.toString();
    }
}
