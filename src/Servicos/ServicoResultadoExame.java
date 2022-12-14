package Servicos;

import DAO.ResultadoExameDAO;
import model.ResultadoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoResultadoExame {

    ResultadoExameDAO resultadoExameDAO = new ResultadoExameDAO();

    public void insert(ResultadoExame entidade) {
        resultadoExameDAO.insert(entidade);
    }

    public ResultadoExame select(int id) {
        return resultadoExameDAO.select(id);
    }

    public List<ResultadoExame> selectAll() {
        return resultadoExameDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return resultadoExameDAO.delete(id);
    }

    public boolean update(ResultadoExame entidade) throws SQLException {
        return resultadoExameDAO.update(entidade);
    }
}