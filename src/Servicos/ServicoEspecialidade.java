package Servicos;

import DAO.EspecialidadeDAO;
import model.Especialidade;

import java.sql.SQLException;
import java.util.List;

public class ServicoEspecialidade {

    EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();

    public Especialidade insert(Especialidade entidade) {
       return especialidadeDAO.insert(entidade);
    }

    public Especialidade select(int id) {
        return especialidadeDAO.select(id);
    }

    public List<Especialidade> selectAll() {
        return especialidadeDAO.selectAll();
    }

    public boolean delete(int id) throws SQLException {
        return especialidadeDAO.delete(id);
    }

    public boolean update(Especialidade entidade) throws SQLException {
        return especialidadeDAO.update(entidade);
    }
}