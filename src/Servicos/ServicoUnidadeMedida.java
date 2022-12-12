package Servicos;

import DAO.UnidadeMedidaDAO;
import model.UnidadeMedida;

import java.sql.SQLException;
import java.util.List;

public class ServicoUnidadeMedida extends UnidadeMedidaDAO {

    @Override
    public void insert(UnidadeMedida entidade) {
        super.insert(entidade);
    }

    @Override
    public UnidadeMedida select(int id) {
        return super.select(id);
    }

    @Override
    public List<UnidadeMedida> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(UnidadeMedida entidade) throws SQLException {
        return super.update(entidade);
    }
}