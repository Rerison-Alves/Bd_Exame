package model;

public class MedicoHasEspecialidade {
    public MedicoHasEspecialidade(Integer medicoId, Integer especialidade_id) {
        this.medicoId = medicoId;
        this.especialidadeId = especialidade_id;
    }

    private Integer medicoId;
    private Integer especialidadeId;

    public Integer getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Integer medicoId) {
        this.medicoId = medicoId;
    }

    public Integer getEspecialidadeId() {
        return especialidadeId;
    }

    public void setEspecialidadeId(Integer especialidadeId) {
        this.especialidadeId = especialidadeId;
    }

    @Override
    public String toString() {
        return "Medico_has_especialidade{" +
                "medico_id=" + medicoId +
                ", especialidade_id=" + especialidadeId +
                "} ";
    }
}
