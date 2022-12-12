package Servicos;

import DAO.MaterialExameDAO;
import model.MaterialExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoMaterialExame extends MaterialExameDAO {

    @Override
    public void insert(MaterialExame entidade) {
        super.insert(entidade);
    }

    @Override
    public MaterialExame select(int id) {
        return super.select(id);
    }

    @Override
    public List<MaterialExame> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(MaterialExame entidade) throws SQLException {
        return super.update(entidade);
    }
}