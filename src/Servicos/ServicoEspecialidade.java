package Servicos;

import DAO.EspecialidadeDAO;
import model.Especialidade;

import java.sql.SQLException;
import java.util.List;

public class ServicoEspecialidade extends EspecialidadeDAO {

    @Override
    public void insert(Especialidade entidade) {
        super.insert(entidade);
    }

    @Override
    public Especialidade select(int id) {
        return super.select(id);
    }

    @Override
    public List<Especialidade> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Especialidade entidade) throws SQLException {
        return super.update(entidade);
    }
}