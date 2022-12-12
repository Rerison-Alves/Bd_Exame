package Servicos;

import DAO.SiglaFormacaoDAO;
import model.SiglaFormacao;

import java.sql.SQLException;
import java.util.List;

public class ServicoSiglaFormacao extends SiglaFormacaoDAO {

    @Override
    public void insert(SiglaFormacao entidade) {
        super.insert(entidade);
    }

    @Override
    public SiglaFormacao select(int id) {
        return super.select(id);
    }

    @Override
    public List<SiglaFormacao> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(SiglaFormacao entidade) throws SQLException {
        return super.update(entidade);
    }
}