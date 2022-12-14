package Servicos;

import DAO.ExameDAO;
import model.Exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoExame {

    ExameDAO exameDAO = new ExameDAO();

    public void insert(Exame entidade) {
        exameDAO.insert(entidade);
    }

    public Exame select(int id) {
        return exameDAO.select(id);
    }

    public List<Exame> selectAll() {
        return exameDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return exameDAO.delete(id);
    }

    public boolean update(Exame entidade) throws SQLException {
        return exameDAO.update(entidade);
    }
}