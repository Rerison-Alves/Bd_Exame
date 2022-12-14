package Servicos;

import DAO.MaterialExameDAO;
import model.MaterialExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoMaterialExame {

    MaterialExameDAO materialExameDAO = new MaterialExameDAO();

    public void insert(MaterialExame entidade) {
        materialExameDAO.insert(entidade);
    }

    public MaterialExame select(int id) {
        return materialExameDAO.select(id);
    }

    public List<MaterialExame> selectAll() {
        return materialExameDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return materialExameDAO.delete(id);
    }

    public boolean update(MaterialExame entidade) throws SQLException {
        return materialExameDAO.update(entidade);
    }
}