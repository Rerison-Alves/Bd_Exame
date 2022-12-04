package Servicos;

import DAO.EspecialidadeDAO;
import model.Especialidade;

import java.sql.SQLException;
import java.util.List;

public class ServicoEspecialidade extends EspecialidadeDAO {

    @Override
    public void insertEspecialidade(Especialidade entidade) {
        super.insertEspecialidade(entidade);
    }

    @Override
    public Especialidade selectEspecialidade(int id) {
        return super.selectEspecialidade(id);
    }

    @Override
    public List<Especialidade> selectAllEspecialidade() {
        return super.selectAllEspecialidade();
    }

    @Override
    public boolean deleteEspecialidade(int id) throws SQLException {
        return super.deleteEspecialidade(id);
    }

    @Override
    public boolean updateEspecialidade(Especialidade entidade) throws SQLException {
        return super.updateEspecialidade(entidade);
    }
}