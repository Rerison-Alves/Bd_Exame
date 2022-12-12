package Servicos;

import DAO.MedicoDAO;
import model.Medico;

import java.sql.SQLException;
import java.util.List;

public class ServicoMedico extends MedicoDAO {

    @Override
    public void insert(Medico entidade) {
        super.insert(entidade);
    }

    @Override
    public Medico select(int id) {
        return super.select(id);
    }

    @Override
    public List<Medico> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Medico entidade) throws SQLException {
        return super.update(entidade);
    }
}