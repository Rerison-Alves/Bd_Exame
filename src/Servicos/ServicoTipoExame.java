package Servicos;

import DAO.TipoExameDAO;
import model.TipoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoTipoExame extends TipoExameDAO {

    @Override
    public void insertTipo_exame(TipoExame entidade) {
        super.insertTipo_exame(entidade);
    }

    @Override
    public TipoExame selectTipo_exame(int id) {
        return super.selectTipo_exame(id);
    }

    @Override
    public List<TipoExame> selectAllTipo_exame() {
        return super.selectAllTipo_exame();
    }

    @Override
    public boolean deleteTipo_exame(int id) throws SQLException {
        return super.deleteTipo_exame(id);
    }

    @Override
    public boolean updateTipo_exame(TipoExame entidade) throws SQLException {
        return super.updateTipo_exame(entidade);
    }
}