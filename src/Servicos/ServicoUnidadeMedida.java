package Servicos;

import DAO.UnidadeMedidaDAO;
import model.UnidadeMedida;

import java.sql.SQLException;
import java.util.List;

public class ServicoUnidadeMedida {

    UnidadeMedidaDAO unidadeMedidaDAO = new UnidadeMedidaDAO();

    public void insert(UnidadeMedida entidade) {
        unidadeMedidaDAO.insert(entidade);
    }

    public UnidadeMedida select(int id) {
        return unidadeMedidaDAO.select(id);
    }

    public List<UnidadeMedida> selectAll() {
        return unidadeMedidaDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return unidadeMedidaDAO.delete(id);
    }

    public boolean update(UnidadeMedida entidade) throws SQLException {
        return unidadeMedidaDAO.update(entidade);
    }
}