package Servicos;

import DAO.Medico_has_especialidadeDAO;
import model.Medico_has_especialidade;

import java.sql.SQLException;
import java.util.List;

public class ServicoMedico_has_especialidade extends Medico_has_especialidadeDAO {

    @Override
    public void insertMedico_has_especialidade(Medico_has_especialidade entidade) {
        super.insertMedico_has_especialidade(entidade);
    }

    @Override
    public Medico_has_especialidade selectMedico_has_especialidade(int id) {
        return super.selectMedico_has_especialidade(id);
    }

    @Override
    public List<Medico_has_especialidade> selectAllMedico_has_especialidade() {
        return super.selectAllMedico_has_especialidade();
    }

    @Override
    public boolean deleteMedico_has_especialidade(int id) throws SQLException {
        return super.deleteMedico_has_especialidade(id);
    }

    @Override
    public boolean updateMedico_has_especialidade(Medico_has_especialidade entidade) throws SQLException {
        return super.updateMedico_has_especialidade(entidade);
    }
}