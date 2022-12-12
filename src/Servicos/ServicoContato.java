package Servicos;

import DAO.ContatoDAO;
import model.Contato;

import java.sql.SQLException;
import java.util.List;

public class ServicoContato extends ContatoDAO {

    @Override
    public void insert(Contato entidade) {
        super.insert(entidade);
    }

    @Override
    public Contato select(int id) {
        return super.select(id);
    }

    @Override
    public List<Contato> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Contato entidade) throws SQLException {
        return super.update(entidade);
    }
}