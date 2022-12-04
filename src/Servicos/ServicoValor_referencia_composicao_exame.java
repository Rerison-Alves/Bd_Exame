package Servicos;

import DAO.Valor_referencia_composicao_exameDAO;
import model.Valor_referencia_composicao_exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoValor_referencia_composicao_exame extends Valor_referencia_composicao_exameDAO {

    @Override
    public void insertValor_referencia_composicao_exame(Valor_referencia_composicao_exame entidade) {
        super.insertValor_referencia_composicao_exame(entidade);
    }

    @Override
    public Valor_referencia_composicao_exame selectValor_referencia_composicao_exame(int id) {
        return super.selectValor_referencia_composicao_exame(id);
    }

    @Override
    public List<Valor_referencia_composicao_exame> selectAllValor_referencia_composicao_exame() {
        return super.selectAllValor_referencia_composicao_exame();
    }

    @Override
    public boolean deleteValor_referencia_composicao_exame(int id) throws SQLException {
        return super.deleteValor_referencia_composicao_exame(id);
    }

    @Override
    public boolean updateValor_referencia_composicao_exame(Valor_referencia_composicao_exame entidade) throws SQLException {
        return super.updateValor_referencia_composicao_exame(entidade);
    }
}