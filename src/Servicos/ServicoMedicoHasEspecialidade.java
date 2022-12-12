package Servicos;

import DAO.MedicoHasEspecialidadeDAO;
import model.MedicoHasEspecialidade;

import java.sql.SQLException;
import java.util.List;

public class ServicoMedicoHasEspecialidade extends MedicoHasEspecialidadeDAO {

    @Override
    public void insert(MedicoHasEspecialidade entidade) {
        super.insert(entidade);
    }

    @Override
    public MedicoHasEspecialidade select(int id) {
        return super.select(id);
    }

    @Override
    public List<MedicoHasEspecialidade> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(MedicoHasEspecialidade entidade) throws SQLException {
        return super.update(entidade);
    }
}