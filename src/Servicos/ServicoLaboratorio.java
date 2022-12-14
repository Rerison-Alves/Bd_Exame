package Servicos;

import DAO.LaboratorioDAO;
import model.Laboratorio;

import java.sql.SQLException;
import java.util.List;

public class ServicoLaboratorio {

    LaboratorioDAO laboratorioDAO = new LaboratorioDAO();

    public Laboratorio insert(Laboratorio entidade) {
        return laboratorioDAO.insert(entidade);
    }

    public Laboratorio select(int id) {
        return laboratorioDAO.select(id);
    }

    public List<Laboratorio> selectAll() {
        return laboratorioDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return laboratorioDAO.delete(id);
    }

    public boolean update(Laboratorio entidade) throws SQLException {
        return laboratorioDAO.update(entidade);
    }
}