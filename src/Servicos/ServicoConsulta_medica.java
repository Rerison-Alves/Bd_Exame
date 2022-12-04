package Servicos;

import DAO.Consulta_medicaDAO;
import model.Consulta_medica;

import java.sql.SQLException;
import java.util.List;

public class ServicoConsulta_medica extends Consulta_medicaDAO {

    @Override
    public void insertConsulta_medica(Consulta_medica entidade) {
        super.insertConsulta_medica(entidade);
    }

    @Override
    public Consulta_medica selectConsulta_medica(int id) {
        return super.selectConsulta_medica(id);
    }

    @Override
    public List<Consulta_medica> selectAllConsulta_medica() {
        return super.selectAllConsulta_medica();
    }

    @Override
    public boolean deleteConsulta_medica(int id) throws SQLException {
        return super.deleteConsulta_medica(id);
    }

    @Override
    public boolean updateConsulta_medica(Consulta_medica entidade) throws SQLException {
        return super.updateConsulta_medica(entidade);
    }
}