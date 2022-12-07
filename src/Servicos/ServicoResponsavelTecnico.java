package Servicos;

import DAO.ResponsavelTecnicoDAO;
import model.ResponsavelTecnico;

import java.sql.SQLException;
import java.util.List;

public class ServicoResponsavelTecnico extends ResponsavelTecnicoDAO {

    @Override
    public void insertResponsavel_tecnico(ResponsavelTecnico entidade) {
        super.insertResponsavel_tecnico(entidade);
    }

    @Override
    public ResponsavelTecnico selectResponsavel_tecnico(int id) {
        return super.selectResponsavel_tecnico(id);
    }

    @Override
    public List<ResponsavelTecnico> selectAllResponsavel_tecnico() {
        return super.selectAllResponsavel_tecnico();
    }

    @Override
    public boolean deleteResponsavel_tecnico(int id) throws SQLException {
        return super.deleteResponsavel_tecnico(id);
    }

    @Override
    public boolean updateResponsavel_tecnico(ResponsavelTecnico entidade) throws SQLException {
        return super.updateResponsavel_tecnico(entidade);
    }
}