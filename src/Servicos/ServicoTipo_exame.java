package Servicos;

import DAO.Tipo_exameDAO;
import model.Tipo_exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoTipo_exame extends Tipo_exameDAO {

    @Override
    public void insertTipo_exame(Tipo_exame entidade) {
        super.insertTipo_exame(entidade);
    }

    @Override
    public Tipo_exame selectTipo_exame(int id) {
        return super.selectTipo_exame(id);
    }

    @Override
    public List<Tipo_exame> selectAllTipo_exame() {
        return super.selectAllTipo_exame();
    }

    @Override
    public boolean deleteTipo_exame(int id) throws SQLException {
        return super.deleteTipo_exame(id);
    }

    @Override
    public boolean updateTipo_exame(Tipo_exame entidade) throws SQLException {
        return super.updateTipo_exame(entidade);
    }
}