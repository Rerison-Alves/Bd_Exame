package Servicos;

import DAO.LaudoDAO;
import model.Laudo;

import java.sql.SQLException;
import java.util.List;

public class ServicoLaudo {

    LaudoDAO laudoDAO = new LaudoDAO();

    public void insert(Laudo entidade) {
        laudoDAO.insert(entidade);
    }

    public Laudo select(int id) {
        return laudoDAO.select(id);
    }

    public List<Laudo> selectAll() {
        return laudoDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return laudoDAO.delete(id);
    }

    public boolean update(Laudo entidade) throws SQLException {
        return laudoDAO.update(entidade);
    }
}