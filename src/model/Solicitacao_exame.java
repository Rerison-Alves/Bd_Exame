package model;

import java.util.Date;

public class Solicitacao_exame extends GenericModel{
    private String nm_prescrito;
    private Date dt_solicitacao;
    private Integer consulta_medica_id;
    private Integer habilitacao_exame_id;

    public String getNm_prescrito() {
        return nm_prescrito;
    }

    public void setNm_prescrito(String nm_prescrito) {
        this.nm_prescrito = nm_prescrito;
    }

    public Date getDt_solicitacao() {
        return dt_solicitacao;
    }

    public void setDt_solicitacao(Date dt_solicitacao) {
        this.dt_solicitacao = dt_solicitacao;
    }

    public Integer getConsulta_medica_id() {
        return consulta_medica_id;
    }

    public void setConsulta_medica_id(Integer consulta_medica_id) {
        this.consulta_medica_id = consulta_medica_id;
    }

    public Integer getHabilitacao_exame_id() {
        return habilitacao_exame_id;
    }

    public void setHabilitacao_exame_id(Integer habilitacao_exame_id) {
        this.habilitacao_exame_id = habilitacao_exame_id;
    }

    @Override
    public String toString() {
        return "Solicitacao_exame{" +
                "nm_prescrito='" + nm_prescrito + '\'' +
                ", dt_solicitacao=" + dt_solicitacao +
                ", consulta_medica_id=" + consulta_medica_id +
                ", habilitacao_exame_id=" + habilitacao_exame_id +
                "} " + super.toString();
    }
}
