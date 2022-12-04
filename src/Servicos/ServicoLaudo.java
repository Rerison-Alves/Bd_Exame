package Servicos;

import DAO.LaudoDAO;
import model.Laudo;

import java.sql.SQLException;
import java.util.List;

public class ServicoLaudo extends LaudoDAO {

    @Override
    public void insertLaudo(Laudo entidade) {
        super.insertLaudo(entidade);
    }

    @Override
    public Laudo selectLaudo(int id) {
        return super.selectLaudo(id);
    }

    @Override
    public List<Laudo> selectAllLaudo() {
        return super.selectAllLaudo();
    }

    @Override
    public boolean deleteLaudo(int id) throws SQLException {
        return super.deleteLaudo(id);
    }

    @Override
    public boolean updateLaudo(Laudo entidade) throws SQLException {
        return super.updateLaudo(entidade);
    }
}