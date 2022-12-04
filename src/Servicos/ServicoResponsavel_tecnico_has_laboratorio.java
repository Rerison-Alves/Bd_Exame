package Servicos;

import DAO.Responsavel_tecnico_has_laboratorioDAO;
import model.Responsavel_tecnico_has_laboratorio;

import java.sql.SQLException;
import java.util.List;

public class ServicoResponsavel_tecnico_has_laboratorio extends Responsavel_tecnico_has_laboratorioDAO {

    @Override
    public void insertResponsavel_tecnico_has_laboratorio(Responsavel_tecnico_has_laboratorio entidade) {
        super.insertResponsavel_tecnico_has_laboratorio(entidade);
    }

    @Override
    public Responsavel_tecnico_has_laboratorio selectResponsavel_tecnico_has_laboratorio(int id) {
        return super.selectResponsavel_tecnico_has_laboratorio(id);
    }

    @Override
    public List<Responsavel_tecnico_has_laboratorio> selectAllResponsavel_tecnico_has_laboratorio() {
        return super.selectAllResponsavel_tecnico_has_laboratorio();
    }

    @Override
    public boolean deleteResponsavel_tecnico_has_laboratorio(int id) throws SQLException {
        return super.deleteResponsavel_tecnico_has_laboratorio(id);
    }

    @Override
    public boolean updateResponsavel_tecnico_has_laboratorio(Responsavel_tecnico_has_laboratorio entidade) throws SQLException {
        return super.updateResponsavel_tecnico_has_laboratorio(entidade);
    }
}