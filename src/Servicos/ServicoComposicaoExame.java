package Servicos;

import DAO.ComposicaoExameDAO;
import model.ComposicaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoComposicaoExame extends ComposicaoExameDAO {

    @Override
    public void insert(ComposicaoExame entidade) {
        super.insert(entidade);
    }

    @Override
    public ComposicaoExame select(int id) {
        return super.select(id);
    }

    @Override
    public List<ComposicaoExame> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(ComposicaoExame entidade) throws SQLException {
        return super.update(entidade);
    }
}