package Servicos;

import DAO.LaudoDAO;
import model.Laudo;

import java.sql.SQLException;
import java.util.List;

public class ServicoLaudo extends LaudoDAO {

    @Override
    public void insert(Laudo entidade) {
        super.insert(entidade);
    }

    @Override
    public Laudo select(int id) {
        return super.select(id);
    }

    @Override
    public List<Laudo> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Laudo entidade) throws SQLException {
        return super.update(entidade);
    }
}