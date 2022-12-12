package Servicos;

import DAO.ResponsavelTecnicoDAO;
import model.ResponsavelTecnico;

import java.sql.SQLException;
import java.util.List;

public class ServicoResponsavelTecnico extends ResponsavelTecnicoDAO {

    @Override
    public void insert(ResponsavelTecnico entidade) {
        super.insert(entidade);
    }

    @Override
    public ResponsavelTecnico select(int id) {
        return super.select(id);
    }

    @Override
    public List<ResponsavelTecnico> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(ResponsavelTecnico entidade) throws SQLException {
        return super.update(entidade);
    }
}