package Servicos;

import DAO.EnderecoDAO;
import model.Endereco;

import java.sql.SQLException;
import java.util.List;

public class ServicoEndereco extends EnderecoDAO {

    @Override
    public void insert(Endereco entidade) {
        super.insert(entidade);
    }

    @Override
    public Endereco select(int id) {
        return super.select(id);
    }

    @Override
    public List<Endereco> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(Endereco entidade) throws SQLException {
        return super.update(entidade);
    }
}