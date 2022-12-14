package Servicos;

import DAO.TipoExameDAO;
import model.TipoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoTipoExame {

    TipoExameDAO tipoExameDAO = new TipoExameDAO();

    public void insert(TipoExame entidade) {
        tipoExameDAO.insert(entidade);
    }

    public TipoExame select(int id) {
        return tipoExameDAO.select(id);
    }

    public List<TipoExame> selectAll() {
        return tipoExameDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return tipoExameDAO.delete(id);
    }

    public boolean update(TipoExame entidade) throws SQLException {
        return tipoExameDAO.update(entidade);
    }
}