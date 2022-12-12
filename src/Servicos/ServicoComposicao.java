package Servicos;

import DAO.ComposicaoDAO;
import model.Composicao;

import java.sql.SQLException;
import java.util.List;

public class ServicoComposicao extends ComposicaoDAO {

    @Override
    public void insert(Composicao entidade) {
        super.insert(entidade);
    }

    @Override
    public Composicao select(int id) {
        return super.select(id);
    }

    @Override
    public List<Composicao> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Composicao entidade) throws SQLException {
        return super.update(entidade);
    }
}