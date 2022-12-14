package Servicos;

import DAO.PacienteDAO;
import model.Paciente;

import java.sql.SQLException;
import java.util.List;

public class ServicoPaciente {

    PacienteDAO pacienteDAO = new PacienteDAO();

    public void insert(Paciente entidade) {
        pacienteDAO.insert(entidade);
    }

    public Paciente select(int id) {
        return pacienteDAO.select(id);
    }

    public List<Paciente> select() {
        return pacienteDAO.select();
    }

    public boolean delete(int id) throws SQLException {
        return pacienteDAO.delete(id);
    }

    public boolean update(Paciente entidade) throws SQLException {
        return pacienteDAO.update(entidade);
    }
}