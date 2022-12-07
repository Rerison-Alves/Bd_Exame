package Servicos;

import DAO.ConsultaMedicaDAO;
import model.ConsultaMedica;

import java.sql.SQLException;
import java.util.List;

public class ServicoConsultaMedica extends ConsultaMedicaDAO {

    @Override
    public void insertConsulta_medica(ConsultaMedica entidade) {
        super.insertConsulta_medica(entidade);
    }

    @Override
    public ConsultaMedica selectConsulta_medica(int id) {
        return super.selectConsulta_medica(id);
    }

    @Override
    public List<ConsultaMedica> selectAllConsulta_medica() {
        return super.selectAllConsulta_medica();
    }

    @Override
    public boolean deleteConsulta_medica(int id) throws SQLException {
        return super.deleteConsulta_medica(id);
    }

    @Override
    public boolean updateConsulta_medica(ConsultaMedica entidade) throws SQLException {
        return super.updateConsulta_medica(entidade);
    }
}