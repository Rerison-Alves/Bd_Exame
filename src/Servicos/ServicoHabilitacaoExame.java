package Servicos;

import DAO.HabilitacaoExameDAO;
import model.HabilitacaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoHabilitacaoExame extends HabilitacaoExameDAO {

    @Override
    public void insert(HabilitacaoExame entidade) {
        super.insert(entidade);
    }

    @Override
    public HabilitacaoExame select(int id) {
        return super.select(id);
    }

    @Override
    public List<HabilitacaoExame> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(HabilitacaoExame entidade) throws SQLException {
        return super.update(entidade);
    }
}