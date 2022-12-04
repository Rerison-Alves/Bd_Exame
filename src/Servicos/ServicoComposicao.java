package Servicos;

import DAO.ComposicaoDAO;
import model.Composicao;

import java.sql.SQLException;
import java.util.List;

public class ServicoComposicao extends ComposicaoDAO {

    @Override
    public void insertComposicao(Composicao entidade) {
        super.insertComposicao(entidade);
    }

    @Override
    public Composicao selectComposicao(int id) {
        return super.selectComposicao(id);
    }

    @Override
    public List<Composicao> selectAllComposicao() {
        return super.selectAllComposicao();
    }

    @Override
    public boolean deleteComposicao(int id) throws SQLException {
        return super.deleteComposicao(id);
    }

    @Override
    public boolean updateComposicao(Composicao entidade) throws SQLException {
        return super.updateComposicao(entidade);
    }
}