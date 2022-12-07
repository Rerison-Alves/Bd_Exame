package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente extends GenericModel{
    public Paciente(Integer id, String nome, Date dt_nascimento) {
        super(id);
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
    }

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
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dt_nascimento = dateFormat.format(this.dt_nascimento);
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", dt_nascimento=" + dt_nascimento +
                "} " + super.toString();
    }
}
