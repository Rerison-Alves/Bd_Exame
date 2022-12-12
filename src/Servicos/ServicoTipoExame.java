package Servicos;

import DAO.TipoExameDAO;
import model.TipoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoTipoExame extends TipoExameDAO {

    @Override
    public void insert(TipoExame entidade) {
        super.insert(entidade);
    }

    @Override
    public TipoExame select(int id) {
        return super.select(id);
    }

    @Override
    public List<TipoExame> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(TipoExame entidade) throws SQLException {
        return super.update(entidade);
    }
}