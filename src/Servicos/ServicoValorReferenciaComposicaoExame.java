package Servicos;

import DAO.ValorReferenciaComposicaoExameDAO;
import model.ValorReferenciaComposicaoExame;

import java.sql.SQLException;
import java.util.List;

public class ServicoValorReferenciaComposicaoExame {

    ValorReferenciaComposicaoExameDAO valorReferenciaComposicaoExameDAO = new ValorReferenciaComposicaoExameDAO();

    public void insert(ValorReferenciaComposicaoExame entidade) {
        valorReferenciaComposicaoExameDAO.insert(entidade);
    }

    public ValorReferenciaComposicaoExame select(int id) {
        return valorReferenciaComposicaoExameDAO.select(id);
    }

    public List<ValorReferenciaComposicaoExame> selectAll() {
        return valorReferenciaComposicaoExameDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return valorReferenciaComposicaoExameDAO.delete(id);
    }

    public boolean update(ValorReferenciaComposicaoExame entidade) throws SQLException {
        return valorReferenciaComposicaoExameDAO.update(entidade);
    }
}