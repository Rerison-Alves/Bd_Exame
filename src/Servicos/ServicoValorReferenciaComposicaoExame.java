package Servicos;

import DAO.ValorReferenciaComposicaoExameDAO;
import model.ValorReferenciaComposicaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoValorReferenciaComposicaoExame extends ValorReferenciaComposicaoExameDAO {

    @Override
    public void insertValor_referencia_composicao_exame(ValorReferenciaComposicaoExame entidade) {
        super.insertValor_referencia_composicao_exame(entidade);
    }

    @Override
    public ValorReferenciaComposicaoExame selectValor_referencia_composicao_exame(int id) {
        return super.selectValor_referencia_composicao_exame(id);
    }

    @Override
    public List<ValorReferenciaComposicaoExame> selectAllValor_referencia_composicao_exame() {
        return super.selectAllValor_referencia_composicao_exame();
    }

    @Override
    public boolean deleteValor_referencia_composicao_exame(int id) throws SQLException {
        return super.deleteValor_referencia_composicao_exame(id);
    }

    @Override
    public boolean updateValor_referencia_composicao_exame(ValorReferenciaComposicaoExame entidade) throws SQLException {
        return super.updateValor_referencia_composicao_exame(entidade);
    }
}