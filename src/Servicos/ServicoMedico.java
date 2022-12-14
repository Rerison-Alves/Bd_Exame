package Servicos;

import DAO.MedicoDAO;
import DAO.MedicoHasEspecialidadeDAO;
import model.Medico;
import model.MedicoHasEspecialidade;

import java.sql.SQLException;
import java.util.List;

public class ServicoMedico {

    private MedicoDAO medicoDAO = new MedicoDAO();

    private MedicoHasEspecialidadeDAO medicoHasEspecialidadeDAO = new MedicoHasEspecialidadeDAO();

    private ServicoEspecialidade servicoEspecialidade = new ServicoEspecialidade();

    public Medico insert(Medico entidade) {
        return medicoDAO.insert(entidade);
    }


    public Medico select(int id) {
        return medicoDAO.select(id);
    }


    public List<Medico> selectAll() {
        return medicoDAO.selectAll();
    }


    public void delete(int id) throws SQLException {
        medicoDAO.delete(id);
    }

    public void update(Medico entidade) throws SQLException {
        removerEspecialidadeMedica(entidade);
        medicoDAO.update(entidade);
        salvarEspecialidades(entidade, entidade);
    }

    public Medico salvar(Medico entidade) {
        Medico medicoNovo = insert(entidade);
        medicoNovo.setEspecialidades(entidade.getEspecialidades());
        salvarEspecialidades(entidade, medicoNovo);
        return medicoNovo;
    }

    private void salvarEspecialidades(Medico entidade, Medico medicoNovo) {
        entidade
                .getEspecialidades()
                .forEach(e -> medicoHasEspecialidadeDAO.insert(new MedicoHasEspecialidade(medicoNovo.getId(), e.getId())));
    }

    public void removerEspecialidadeMedica(Medico medico) throws SQLException {
        medicoHasEspecialidadeDAO.deleteFromMedicoID(medico.getId());
    }
}