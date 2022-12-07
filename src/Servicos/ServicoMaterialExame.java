package Servicos;

import DAO.MaterialExameDAO;
import model.MaterialExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoMaterialExame extends MaterialExameDAO {

    @Override
    public void insertMaterial_exame(MaterialExame entidade) {
        super.insertMaterial_exame(entidade);
    }

    @Override
    public MaterialExame selectMaterial_exame(int id) {
        return super.selectMaterial_exame(id);
    }

    @Override
    public List<MaterialExame> selectAllMaterial_exame() {
        return super.selectAllMaterial_exame();
    }

    @Override
    public boolean deleteMaterial_exame(int id) throws SQLException {
        return super.deleteMaterial_exame(id);
    }

    @Override
    public boolean updateMaterial_exame(MaterialExame entidade) throws SQLException {
        return super.updateMaterial_exame(entidade);
    }
}