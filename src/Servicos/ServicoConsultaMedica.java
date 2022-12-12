package Servicos;

import DAO.ConsultaMedicaDAO;
import model.ConsultaMedica;

import java.sql.SQLException;
import java.util.List;

public class ServicoConsultaMedica extends ConsultaMedicaDAO {

    @Override
    public void insert(ConsultaMedica entidade) {
        super.insert(entidade);
    }

    @Override
    public ConsultaMedica select(int id) {
        return super.select(id);
    }

    @Override
    public List<ConsultaMedica> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(ConsultaMedica entidade) throws SQLException {
        return super.update(entidade);
    }
}