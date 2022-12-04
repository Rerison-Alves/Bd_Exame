package Servicos;

import DAO.ExameDAO;
import model.Exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoExame extends ExameDAO {

    @Override
    public void insertExame(Exame entidade) {
        super.insertExame(entidade);
    }

    @Override
    public Exame selectExame(int id) {
        return super.selectExame(id);
    }

    @Override
    public List<Exame> selectAllExame() {
        return super.selectAllExame();
    }

    @Override
    public boolean deleteExame(int id) throws SQLException {
        return super.deleteExame(id);
    }

    @Override
    public boolean updateExame(Exame entidade) throws SQLException {
        return super.updateExame(entidade);
    }
}