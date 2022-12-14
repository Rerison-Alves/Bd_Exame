package Servicos;

import DAO.HabilitacaoExameDAO;
import model.HabilitacaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoHabilitacaoExame {

    HabilitacaoExameDAO habilitacaoExameDAO = new HabilitacaoExameDAO();

    public void insert(HabilitacaoExame entidade) {
        habilitacaoExameDAO.insert(entidade);
    }

    public HabilitacaoExame select(int id) {
        return habilitacaoExameDAO.select(id);
    }

    public List<HabilitacaoExame> selectAll() {
        return habilitacaoExameDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return habilitacaoExameDAO.delete(id);
    }

    public boolean update(HabilitacaoExame entidade) throws SQLException {
        return habilitacaoExameDAO.update(entidade);
    }
}