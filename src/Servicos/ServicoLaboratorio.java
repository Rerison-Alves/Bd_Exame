package Servicos;

import DAO.LaboratorioDAO;
import model.Laboratorio;

import java.sql.SQLException;
import java.util.List;

public class ServicoLaboratorio extends LaboratorioDAO {

    @Override
    public void insert(Laboratorio entidade) {
        super.insert(entidade);
    }

    @Override
    public Laboratorio select(int id) {
        return super.select(id);
    }

    @Override
    public List<Laboratorio> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Laboratorio entidade) throws SQLException {
        return super.update(entidade);
    }
}