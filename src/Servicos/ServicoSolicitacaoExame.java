package Servicos;

import DAO.SolicitacaoExameDAO;
import model.SolicitacaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoSolicitacaoExame extends SolicitacaoExameDAO {

    @Override
    public void insert(SolicitacaoExame entidade) {
        super.insert(entidade);
    }

    @Override
    public SolicitacaoExame select(int id) {
        return super.select(id);
    }

    @Override
    public List<SolicitacaoExame> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(SolicitacaoExame entidade) throws SQLException {
        return super.update(entidade);
    }
}