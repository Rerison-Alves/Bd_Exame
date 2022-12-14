package Servicos;

import DAO.SolicitacaoExameDAO;
import model.SolicitacaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoSolicitacaoExame {

    SolicitacaoExameDAO solicitacaoExameDAO = new SolicitacaoExameDAO();

    public void insert(SolicitacaoExame entidade) {
        solicitacaoExameDAO.insert(entidade);
    }

    public SolicitacaoExame select(int id) {
        return solicitacaoExameDAO.select(id);
    }

    public List<SolicitacaoExame> selectAll() {
        return solicitacaoExameDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return solicitacaoExameDAO.delete(id);
    }

    public boolean update(SolicitacaoExame entidade) throws SQLException {
        return solicitacaoExameDAO.update(entidade);
    }
}