package model;

public class ResponsavelTecnicoHasLaboratorio{
    public ResponsavelTecnicoHasLaboratorio(Integer responsavel_tecnico_id, Integer laboratorio_id) {
        this.responsavel_tecnico_id = responsavel_tecnico_id;
        this.laboratorio_id = laboratorio_id;
    }

    private Integer responsavel_tecnico_id;
    private Integer laboratorio_id;

    public Integer getResponsavel_tecnico_id() {
        return responsavel_tecnico_id;
    }

    public void setResponsavel_tecnico_id(Integer responsavel_tecnico_id) {
        this.responsavel_tecnico_id = responsavel_tecnico_id;
    }

    public Integer getLaboratorio_id() {
        return laboratorio_id;
    }

    public void setLaboratorio_id(Integer laboratorio_id) {
        this.laboratorio_id = laboratorio_id;
    }

    @Override
    public String toString() {
        return "Responsavel_tecnico_has_laboratorio{" +
                "responsavel_tecnico_id=" + responsavel_tecnico_id +
                ", laboratorio_id=" + laboratorio_id +
                "} ";
    }
}
