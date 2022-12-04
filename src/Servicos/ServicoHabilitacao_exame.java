package Servicos;

import DAO.Habilitacao_exameDAO;
import model.Habilitacao_exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoHabilitacao_exame extends Habilitacao_exameDAO {

    @Override
    public void insertHabilitacao_exame(Habilitacao_exame entidade) {
        super.insertHabilitacao_exame(entidade);
    }

    @Override
    public Habilitacao_exame selectHabilitacao_exame(int id) {
        return super.selectHabilitacao_exame(id);
    }

    @Override
    public List<Habilitacao_exame> selectAllHabilitacao_exame() {
        return super.selectAllHabilitacao_exame();
    }

    @Override
    public boolean deleteHabilitacao_exame(int id) throws SQLException {
        return super.deleteHabilitacao_exame(id);
    }

    @Override
    public boolean updateHabilitacao_exame(Habilitacao_exame entidade) throws SQLException {
        return super.updateHabilitacao_exame(entidade);
    }
}