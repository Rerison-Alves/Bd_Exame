package Servicos;

import DAO.ContatoDAO;
import model.Contato;

import java.sql.SQLException;
import java.util.List;

public class ServicoContato extends ContatoDAO {

    @Override
    public void insertContato(Contato entidade) {
        super.insertContato(entidade);
    }

    @Override
    public Contato selectContato(int id) {
        return super.selectContato(id);
    }

    @Override
    public List<Contato> selectAllContato() {
        return super.selectAllContato();
    }

    @Override
    public boolean deleteContato(int id) throws SQLException {
        return super.deleteContato(id);
    }

    @Override
    public boolean updateContato(Contato entidade) throws SQLException {
        return super.updateContato(entidade);
    }
}