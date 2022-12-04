package Servicos;

import DAO.LaboratorioDAO;
import model.Laboratorio;

import java.sql.SQLException;
import java.util.List;

public class ServicoLaboratorio extends LaboratorioDAO {

    @Override
    public void insertLaboratorio(Laboratorio entidade) {
        super.insertLaboratorio(entidade);
    }

    @Override
    public Laboratorio selectLaboratorio(int id) {
        return super.selectLaboratorio(id);
    }

    @Override
    public List<Laboratorio> selectAllLaboratorio() {
        return super.selectAllLaboratorio();
    }

    @Override
    public boolean deleteLaboratorio(int id) throws SQLException {
        return super.deleteLaboratorio(id);
    }

    @Override
    public boolean updateLaboratorio(Laboratorio entidade) throws SQLException {
        return super.updateLaboratorio(entidade);
    }
}