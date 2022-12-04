package Servicos;

import DAO.Unidade_medidaDAO;
import model.Unidade_medida;

import java.sql.SQLException;
import java.util.List;

public class ServicoUnidade_medida extends Unidade_medidaDAO {

    @Override
    public void insertUnidade_medida(Unidade_medida entidade) {
        super.insertUnidade_medida(entidade);
    }

    @Override
    public Unidade_medida selectUnidade_medida(int id) {
        return super.selectUnidade_medida(id);
    }

    @Override
    public List<Unidade_medida> selectAllUnidade_medida() {
        return super.selectAllUnidade_medida();
    }

    @Override
    public boolean deleteUnidade_medida(int id) throws SQLException {
        return super.deleteUnidade_medida(id);
    }

    @Override
    public boolean updateUnidade_medida(Unidade_medida entidade) throws SQLException {
        return super.updateUnidade_medida(entidade);
    }
}