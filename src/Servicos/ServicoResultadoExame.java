package Servicos;

import DAO.ResultadoExameDAO;
import model.ResultadoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoResultadoExame extends ResultadoExameDAO {

    @Override
    public void insert(ResultadoExame entidade) {
        super.insert(entidade);
    }

    @Override
    public ResultadoExame select(int id) {
        return super.select(id);
    }

    @Override
    public List<ResultadoExame> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(ResultadoExame entidade) throws SQLException {
        return super.update(entidade);
    }
}