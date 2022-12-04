package Servicos;

import DAO.Responsavel_tecnicoDAO;
import model.Responsavel_tecnico;

import java.sql.SQLException;
import java.util.List;

public class ServicoResponsavel_tecnico extends Responsavel_tecnicoDAO {

    @Override
    public void insertResponsavel_tecnico(Responsavel_tecnico entidade) {
        super.insertResponsavel_tecnico(entidade);
    }

    @Override
    public Responsavel_tecnico selectResponsavel_tecnico(int id) {
        return super.selectResponsavel_tecnico(id);
    }

    @Override
    public List<Responsavel_tecnico> selectAllResponsavel_tecnico() {
        return super.selectAllResponsavel_tecnico();
    }

    @Override
    public boolean deleteResponsavel_tecnico(int id) throws SQLException {
        return super.deleteResponsavel_tecnico(id);
    }

    @Override
    public boolean updateResponsavel_tecnico(Responsavel_tecnico entidade) throws SQLException {
        return super.updateResponsavel_tecnico(entidade);
    }
}