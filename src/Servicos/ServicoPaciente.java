package Servicos;

import DAO.PacienteDAO;
import model.Paciente;

import java.sql.SQLException;
import java.util.List;

public class ServicoPaciente extends PacienteDAO {

    @Override
    public void insert(Paciente entidade) {
        super.insert(entidade);
    }

    @Override
    public Paciente select(int id) {
        return super.select(id);
    }

    @Override
    public List<Paciente> select() {
        return super.select();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Paciente entidade) throws SQLException {
        return super.update(entidade);
    }
}