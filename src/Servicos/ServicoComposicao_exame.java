package Servicos;

import DAO.Composicao_exameDAO;
import model.Composicao_exame;

import java.sql.SQLException;
import java.util.List;

public class ServicoComposicao_exame extends Composicao_exameDAO {

    @Override
    public void insertComposicao_exame(Composicao_exame entidade) {
        super.insertComposicao_exame(entidade);
    }

    @Override
    public Composicao_exame selectComposicao_exame(int id) {
        return super.selectComposicao_exame(id);
    }

    @Override
    public List<Composicao_exame> selectAllComposicao_exame() {
        return super.selectAllComposicao_exame();
    }

    @Override
    public boolean deleteComposicao_exame(int id) throws SQLException {
        return super.deleteComposicao_exame(id);
    }

    @Override
    public boolean updateComposicao_exame(Composicao_exame entidade) throws SQLException {
        return super.updateComposicao_exame(entidade);
    }
}