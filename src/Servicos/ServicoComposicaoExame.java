package Servicos;

import DAO.ComposicaoExameDAO;
import model.ComposicaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoComposicaoExame extends ComposicaoExameDAO {

    @Override
    public void insertComposicao_exame(ComposicaoExame entidade) {
        super.insertComposicao_exame(entidade);
    }

    @Override
    public ComposicaoExame selectComposicao_exame(int id) {
        return super.selectComposicao_exame(id);
    }

    @Override
    public List<ComposicaoExame> selectAllComposicao_exame() {
        return super.selectAllComposicao_exame();
    }

    @Override
    public boolean deleteComposicao_exame(int id) throws SQLException {
        return super.deleteComposicao_exame(id);
    }

    @Override
    public boolean updateComposicao_exame(ComposicaoExame entidade) throws SQLException {
        return super.updateComposicao_exame(entidade);
    }
}