package Servicos;

import DAO.ValorReferenciaComposicaoExameDAO;
import model.ValorReferenciaComposicaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoValorReferenciaComposicaoExame extends ValorReferenciaComposicaoExameDAO {

    @Override
    public void insert(ValorReferenciaComposicaoExame entidade) {
        super.insert(entidade);
    }

    @Override
    public ValorReferenciaComposicaoExame select(int id) {
        return super.select(id);
    }

    @Override
    public List<ValorReferenciaComposicaoExame> selectAll() {
        return super.selectAll();
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return super.delete(id);
    }

    @Override
    public boolean update(ValorReferenciaComposicaoExame entidade) throws SQLException {
        return super.update(entidade);
    }
}