package Servicos;

import DAO.Solicitacao_exameDAO;
import model.Solicitacao_exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoSolicitacao_exame extends Solicitacao_exameDAO {

    @Override
    public void insertSolicitacao_exame(Solicitacao_exame entidade) {
        super.insertSolicitacao_exame(entidade);
    }

    @Override
    public Solicitacao_exame selectSolicitacao_exame(int id) {
        return super.selectSolicitacao_exame(id);
    }

    @Override
    public List<Solicitacao_exame> selectAllSolicitacao_exame() {
        return super.selectAllSolicitacao_exame();
    }

    @Override
    public boolean deleteSolicitacao_exame(int id) throws SQLException {
        return super.deleteSolicitacao_exame(id);
    }

    @Override
    public boolean updateSolicitacao_exame(Solicitacao_exame entidade) throws SQLException {
        return super.updateSolicitacao_exame(entidade);
    }
}