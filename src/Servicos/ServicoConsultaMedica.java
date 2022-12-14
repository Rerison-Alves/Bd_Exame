package Servicos;

import DAO.ConsultaMedicaDAO;
import model.ConsultaMedica;

import java.sql.SQLException;
import java.util.List;

public class ServicoConsultaMedica {

    ConsultaMedicaDAO consultaMedicaDAO = new ConsultaMedicaDAO();

    public void insert(ConsultaMedica entidade) {
        consultaMedicaDAO.insert(entidade);
    }

    public ConsultaMedica select(int id) {
        return consultaMedicaDAO.select(id);
    }

    public List<ConsultaMedica> selectAll() {
        return consultaMedicaDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return consultaMedicaDAO.delete(id);
    }

    public boolean update(ConsultaMedica entidade) throws SQLException {
        return consultaMedicaDAO.update(entidade);
    }
}