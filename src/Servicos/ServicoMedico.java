package Servicos;

import DAO.MedicoDAO;
import model.Medico;

import java.sql.SQLException;
import java.util.List;

public class ServicoMedico extends MedicoDAO {

    @Override
    public void insertMedico(Medico entidade) {
        super.insertMedico(entidade);
    }

    @Override
    public Medico selectMedico(int id) {
        return super.selectMedico(id);
    }

    @Override
    public List<Medico> selectAllMedico() {
        return super.selectAllMedico();
    }

    @Override
    public boolean deleteMedico(int id) throws SQLException {
        return super.deleteMedico(id);
    }

    @Override
    public boolean updateMedico(Medico entidade) throws SQLException {
        return super.updateMedico(entidade);
    }
}