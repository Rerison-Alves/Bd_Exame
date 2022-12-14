package Servicos;

import DAO.SiglaFormacaoDAO;
import model.SiglaFormacao;

import java.sql.SQLException;
import java.util.List;

public class ServicoSiglaFormacao {

    SiglaFormacaoDAO siglaFormacaoDAO = new SiglaFormacaoDAO();

    public void insert(SiglaFormacao entidade) {
        siglaFormacaoDAO.insert(entidade);
    }

    public SiglaFormacao select(int id) {
        return siglaFormacaoDAO.select(id);
    }

    public List<SiglaFormacao> selectAll() {
        return siglaFormacaoDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return siglaFormacaoDAO.delete(id);
    }

    public boolean update(SiglaFormacao entidade) throws SQLException {
        return siglaFormacaoDAO.update(entidade);
    }
}