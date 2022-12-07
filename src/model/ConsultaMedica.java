package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsultaMedica extends GenericModel{
    public ConsultaMedica(Integer id, Date dt_consulta, Integer medico_id, Integer paciente_id, String nm_atendimento) {
        super(id);
        this.dt_consulta = dt_consulta;
        this.medico_id = medico_id;
        this.paciente_id = paciente_id;
        this.nm_atendimento = nm_atendimento;
    }

    private Date dt_consulta;
    private Integer medico_id;
    private Integer paciente_id;
    private String  nm_atendimento;

    public Date getDt_consulta() {
        return dt_consulta;
    }

    public void setDt_consulta(Date dt_consulta) {
        this.dt_consulta = dt_consulta;
    }

    public Integer getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(Integer medico_id) {
        this.medico_id = medico_id;
    }

    public Integer getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Integer paciente_id) {
        this.paciente_id = paciente_id;
    }

    public String getNm_atendimento() {
        return nm_atendimento;
    }

    public void setNm_atendimento(String nm_atendimento) {
        this.nm_atendimento = nm_atendimento;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String dt_consulta = dateFormat.format(this.dt_consulta);
        return "Consulta_medica{" +
                "dt_consulta=" + dt_consulta +
                ", medico_id=" + medico_id +
                ", paciente_id=" + paciente_id +
                ", nm_atendimento='" + nm_atendimento + '\'' +
                "} " + super.toString();
    }
}
