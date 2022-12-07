package Servicos;

import DAO.ResultadoExameDAO;
import model.ResultadoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoResultadoExame extends ResultadoExameDAO {

    @Override
    public void insertResultado_exame(ResultadoExame entidade) {
        super.insertResultado_exame(entidade);
    }

    @Override
    public ResultadoExame selectResultado_exame(int id) {
        return super.selectResultado_exame(id);
    }

    @Override
    public List<ResultadoExame> selectAllResultado_exame() {
        return super.selectAllResultado_exame();
    }

    @Override
    public boolean deleteResultado_exame(int id) throws SQLException {
        return super.deleteResultado_exame(id);
    }

    @Override
    public boolean updateResultado_exame(ResultadoExame entidade) throws SQLException {
        return super.updateResultado_exame(entidade);
    }
}