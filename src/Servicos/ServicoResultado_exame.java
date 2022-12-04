package Servicos;

import DAO.Resultado_exameDAO;
import model.Resultado_exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoResultado_exame extends Resultado_exameDAO {

    @Override
    public void insertResultado_exame(Resultado_exame entidade) {
        super.insertResultado_exame(entidade);
    }

    @Override
    public Resultado_exame selectResultado_exame(int id) {
        return super.selectResultado_exame(id);
    }

    @Override
    public List<Resultado_exame> selectAllResultado_exame() {
        return super.selectAllResultado_exame();
    }

    @Override
    public boolean deleteResultado_exame(int id) throws SQLException {
        return super.deleteResultado_exame(id);
    }

    @Override
    public boolean updateResultado_exame(Resultado_exame entidade) throws SQLException {
        return super.updateResultado_exame(entidade);
    }
}