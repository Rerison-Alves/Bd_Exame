package Servicos;

import DAO.EnderecoDAO;
import model.Endereco;

import java.sql.SQLException;
import java.util.List;

public class ServicoEndereco {

    EnderecoDAO enderecoDAO = new EnderecoDAO();

    public void insert(Endereco entidade) {
        enderecoDAO.insert(entidade);
    }

    public Endereco select(int id) {
        return enderecoDAO.select(id);
    }

    public List<Endereco> selectAll() {
        return enderecoDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return enderecoDAO.delete(id);
    }

    public boolean update(Endereco entidade) throws SQLException {
        return enderecoDAO.update(entidade);
    }
}