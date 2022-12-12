package Servicos;

import DAO.ResponsavelTecnicoHasLaboratorioDAO;
import model.ResponsavelTecnicoHasLaboratorio;

import java.sql.SQLException;
import java.util.List;

public class ServicoResponsavelTecnicoHasLaboratorio extends ResponsavelTecnicoHasLaboratorioDAO {

    @Override
    public void insert(ResponsavelTecnicoHasLaboratorio entidade) {
        super.insert(entidade);
    }

    @Override
    public ResponsavelTecnicoHasLaboratorio select(int id) {
        return super.select(id);
    }

    @Override
    public List<ResponsavelTecnicoHasLaboratorio> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(ResponsavelTecnicoHasLaboratorio entidade) throws SQLException {
        return super.update(entidade);
    }
}