package Servicos;

import DAO.SiglaFormacaoDAO;
import model.SiglaFormacao;

import java.sql.SQLException;
import java.util.List;

public class ServicoSiglaFormacao extends SiglaFormacaoDAO {

    @Override
    public void insertSigla_formacao(SiglaFormacao entidade) {
        super.insertSigla_formacao(entidade);
    }

    @Override
    public SiglaFormacao selectSigla_formacao(int id) {
        return super.selectSigla_formacao(id);
    }

    @Override
    public List<SiglaFormacao> selectAllSigla_formacao() {
        return super.selectAllSigla_formacao();
    }

    @Override
    public boolean deleteSigla_formacao(int id) throws SQLException {
        return super.deleteSigla_formacao(id);
    }

    @Override
    public boolean updateSigla_formacao(SiglaFormacao entidade) throws SQLException {
        return super.updateSigla_formacao(entidade);
    }
}