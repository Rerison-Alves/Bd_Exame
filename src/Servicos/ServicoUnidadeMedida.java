package Servicos;

import DAO.UnidadeMedidaDAO;
import model.UnidadeMedida;

import java.sql.SQLException;
import java.util.List;

public class ServicoUnidadeMedida extends UnidadeMedidaDAO {

    @Override
    public void insertUnidade_medida(UnidadeMedida entidade) {
        super.insertUnidade_medida(entidade);
    }

    @Override
    public UnidadeMedida selectUnidade_medida(int id) {
        return super.selectUnidade_medida(id);
    }

    @Override
    public List<UnidadeMedida> selectAllUnidade_medida() {
        return super.selectAllUnidade_medida();
    }

    @Override
    public boolean deleteUnidade_medida(int id) throws SQLException {
        return super.deleteUnidade_medida(id);
    }

    @Override
    public boolean updateUnidade_medida(UnidadeMedida entidade) throws SQLException {
        return super.updateUnidade_medida(entidade);
    }
}