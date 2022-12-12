package Servicos;

import DAO.ExameDAO;
import model.Exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoExame extends ExameDAO {

    @Override
    public void insert(Exame entidade) {
        super.insert(entidade);
    }

    @Override
    public Exame select(int id) {
        return super.select(id);
    }

    @Override
    public List<Exame> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Exame entidade) throws SQLException {
        return super.update(entidade);
    }
}