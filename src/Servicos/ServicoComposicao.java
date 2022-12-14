package Servicos;

import DAO.ComposicaoDAO;
import model.Composicao;

import java.sql.SQLException;
import java.util.List;

public class ServicoComposicao {

    ComposicaoDAO composicaoDAO = new ComposicaoDAO();

    public void insert(Composicao entidade) {
        composicaoDAO.insert(entidade);
    }


    public Composicao select(int id) {
        return composicaoDAO.select(id);
    }


    public List<Composicao> selectAll() {
        return composicaoDAO.selectAll();
    }


    public boolean delete(int id) throws SQLException {
        return composicaoDAO.delete(id);
    }

    public boolean update(Composicao entidade) throws SQLException {
        return composicaoDAO.update(entidade);
    }
}