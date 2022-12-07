package Servicos;

import DAO.MedicoHasEspecialidadeDAO;
import model.MedicoHasEspecialidade;

import java.sql.SQLException;
import java.util.List;

public class ServicoMedicoHasEspecialidade extends MedicoHasEspecialidadeDAO {

    @Override
    public void insertMedico_has_especialidade(MedicoHasEspecialidade entidade) {
        super.insertMedico_has_especialidade(entidade);
    }

    @Override
    public MedicoHasEspecialidade selectMedico_has_especialidade(int id) {
        return super.selectMedico_has_especialidade(id);
    }

    @Override
    public List<MedicoHasEspecialidade> selectAllMedico_has_especialidade() {
        return super.selectAllMedico_has_especialidade();
    }

    @Override
    public boolean deleteMedico_has_especialidade(int id) throws SQLException {
        return super.deleteMedico_has_especialidade(id);
    }

    @Override
    public boolean updateMedico_has_especialidade(MedicoHasEspecialidade entidade) throws SQLException {
        return super.updateMedico_has_especialidade(entidade);
    }
}