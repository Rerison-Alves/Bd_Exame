package Servicos;

import DAO.ResponsavelTecnicoHasLaboratorioDAO;
import model.ResponsavelTecnicoHasLaboratorio;

import java.sql.SQLException;
import java.util.List;

public class ServicoResponsavelTecnicoHasLaboratorio extends ResponsavelTecnicoHasLaboratorioDAO {

    @Override
    public void insertResponsavel_tecnico_has_laboratorio(ResponsavelTecnicoHasLaboratorio entidade) {
        super.insertResponsavel_tecnico_has_laboratorio(entidade);
    }

    @Override
    public ResponsavelTecnicoHasLaboratorio selectResponsavel_tecnico_has_laboratorio(int id) {
        return super.selectResponsavel_tecnico_has_laboratorio(id);
    }

    @Override
    public List<ResponsavelTecnicoHasLaboratorio> selectAllResponsavel_tecnico_has_laboratorio() {
        return super.selectAllResponsavel_tecnico_has_laboratorio();
    }

    @Override
    public boolean deleteResponsavel_tecnico_has_laboratorio(int id) throws SQLException {
        return super.deleteResponsavel_tecnico_has_laboratorio(id);
    }

    @Override
    public boolean updateResponsavel_tecnico_has_laboratorio(ResponsavelTecnicoHasLaboratorio entidade) throws SQLException {
        return super.updateResponsavel_tecnico_has_laboratorio(entidade);
    }
}