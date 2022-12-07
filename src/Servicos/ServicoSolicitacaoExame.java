package Servicos;

import DAO.SolicitacaoExameDAO;
import model.SolicitacaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoSolicitacaoExame extends SolicitacaoExameDAO {

    @Override
    public void insertSolicitacao_exame(SolicitacaoExame entidade) {
        super.insertSolicitacao_exame(entidade);
    }

    @Override
    public SolicitacaoExame selectSolicitacao_exame(int id) {
        return super.selectSolicitacao_exame(id);
    }

    @Override
    public List<SolicitacaoExame> selectAllSolicitacao_exame() {
        return super.selectAllSolicitacao_exame();
    }

    @Override
    public boolean deleteSolicitacao_exame(int id) throws SQLException {
        return super.deleteSolicitacao_exame(id);
    }

    @Override
    public boolean updateSolicitacao_exame(SolicitacaoExame entidade) throws SQLException {
        return super.updateSolicitacao_exame(entidade);
    }
}