package Servicos;

import DAO.EnderecoDAO;
import model.Endereco;

import java.sql.SQLException;
import java.util.List;

public class ServicoEndereco extends EnderecoDAO {

    @Override
    public void insertEndereco(Endereco entidade) {
        super.insertEndereco(entidade);
    }

    @Override
    public Endereco selectEndereco(int id) {
        return super.selectEndereco(id);
    }

    @Override
    public List<Endereco> selectAllEndereco() {
        return super.selectAllEndereco();
    }

    @Override
    public boolean deleteEndereco(int id) throws SQLException {
        return super.deleteEndereco(id);
    }

    @Override
    public boolean updateEndereco(Endereco entidade) throws SQLException {
        return super.updateEndereco(entidade);
    }
}