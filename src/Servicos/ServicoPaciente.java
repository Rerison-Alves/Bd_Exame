package Servicos;

import DAO.PacienteDAO;
import model.Paciente;

import java.sql.SQLException;
import java.util.List;

public class ServicoPaciente extends PacienteDAO {

    @Override
    public void insertPaciente(Paciente entidade) {
        super.insertPaciente(entidade);
    }

    @Override
    public Paciente selectPaciente(int id) {
        return super.selectPaciente(id);
    }

    @Override
    public List<Paciente> selectAllPaciente() {
        return super.selectAllPaciente();
    }

    @Override
    public boolean deletePaciente(int id) throws SQLException {
        return super.deletePaciente(id);
    }

    @Override
    public boolean updatePaciente(Paciente entidade) throws SQLException {
        return super.updatePaciente(entidade);
    }
}