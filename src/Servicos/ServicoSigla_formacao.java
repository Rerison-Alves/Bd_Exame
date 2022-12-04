package Servicos;

import DAO.Sigla_formacaoDAO;
import model.Sigla_formacao;

import java.sql.SQLException;
import java.util.List;

public class ServicoSigla_formacao extends Sigla_formacaoDAO {

    @Override
    public void insertSigla_formacao(Sigla_formacao entidade) {
        super.insertSigla_formacao(entidade);
    }

    @Override
    public Sigla_formacao selectSigla_formacao(int id) {
        return super.selectSigla_formacao(id);
    }

    @Override
    public List<Sigla_formacao> selectAllSigla_formacao() {
        return super.selectAllSigla_formacao();
    }

    @Override
    public boolean deleteSigla_formacao(int id) throws SQLException {
        return super.deleteSigla_formacao(id);
    }

    @Override
    public boolean updateSigla_formacao(Sigla_formacao entidade) throws SQLException {
        return super.updateSigla_formacao(entidade);
    }
}