package Servicos;

import DAO.HabilitacaoExameDAO;
import model.HabilitacaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoHabilitacaoExame extends HabilitacaoExameDAO {

    @Override
    public void insertHabilitacao_exame(HabilitacaoExame entidade) {
        super.insertHabilitacao_exame(entidade);
    }

    @Override
    public HabilitacaoExame selectHabilitacao_exame(int id) {
        return super.selectHabilitacao_exame(id);
    }

    @Override
    public List<HabilitacaoExame> selectAllHabilitacao_exame() {
        return super.selectAllHabilitacao_exame();
    }

    @Override
    public boolean deleteHabilitacao_exame(int id) throws SQLException {
        return super.deleteHabilitacao_exame(id);
    }

    @Override
    public boolean updateHabilitacao_exame(HabilitacaoExame entidade) throws SQLException {
        return super.updateHabilitacao_exame(entidade);
    }
}