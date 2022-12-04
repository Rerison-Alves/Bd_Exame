package Servicos;

import DAO.Material_exameDAO;
import model.Material_exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoMaterial_exame extends Material_exameDAO {

    @Override
    public void insertMaterial_exame(Material_exame entidade) {
        super.insertMaterial_exame(entidade);
    }

    @Override
    public Material_exame selectMaterial_exame(int id) {
        return super.selectMaterial_exame(id);
    }

    @Override
    public List<Material_exame> selectAllMaterial_exame() {
        return super.selectAllMaterial_exame();
    }

    @Override
    public boolean deleteMaterial_exame(int id) throws SQLException {
        return super.deleteMaterial_exame(id);
    }

    @Override
    public boolean updateMaterial_exame(Material_exame entidade) throws SQLException {
        return super.updateMaterial_exame(entidade);
    }
}