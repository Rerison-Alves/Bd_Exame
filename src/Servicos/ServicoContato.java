package Servicos;

import DAO.ContatoDAO;
import model.Contato;

import java.sql.SQLException;
import java.util.List;

public class ServicoContato {

    ContatoDAO contatoDAO = new ContatoDAO();

    public void insert(Contato entidade) {
        contatoDAO.insert(entidade);
    }

    public Contato select(int id) {
        return contatoDAO.select(id);
    }

    public List<Contato> selectAll() {
        return contatoDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return contatoDAO.delete(id);
    }

    public boolean update(Contato entidade) throws SQLException {
        return contatoDAO.update(entidade);
    }
}