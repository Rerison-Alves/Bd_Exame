package Servicos;

import DAO.ComposicaoExameDAO;
import model.ComposicaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoComposicaoExame {

    ComposicaoExameDAO composicaoExameDAO = new ComposicaoExameDAO();

    public void insert(ComposicaoExame entidade) {
        composicaoExameDAO.insert(entidade);
    }


    public ComposicaoExame select(int id) {
        return composicaoExameDAO.select(id);
    }


    public List<ComposicaoExame> selectAll() {
        return composicaoExameDAO.selectAll();
    }


    public boolean delete(int id) throws SQLException {
        return composicaoExameDAO.delete(id);
    }


    public boolean update(ComposicaoExame entidade) throws SQLException {
        return composicaoExameDAO.update(entidade);
    }
}