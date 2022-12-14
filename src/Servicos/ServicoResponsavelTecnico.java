package Servicos;

import DAO.ResponsavelTecnicoDAO;
import DAO.ResponsavelTecnicoHasLaboratorioDAO;
import model.ResponsavelTecnico;
import model.ResponsavelTecnicoHasLaboratorio;

import java.sql.SQLException;
import java.util.List;

public class ServicoResponsavelTecnico{

    ResponsavelTecnicoDAO responsavelTecnicoDAO = new ResponsavelTecnicoDAO();

    ResponsavelTecnicoHasLaboratorioDAO responsavelTecnicoHasLaboratorioDAO = new ResponsavelTecnicoHasLaboratorioDAO();

    public ResponsavelTecnico insert(ResponsavelTecnico entidade) {
        return responsavelTecnicoDAO.insert(entidade);
    }

    public ResponsavelTecnico salvar(ResponsavelTecnico entidade){
        ResponsavelTecnico responsavelTecnicoNovo = insert(entidade);
        responsavelTecnicoNovo.setLaboratorios(entidade.getLaboratorios());
        salvarLaboratorios(entidade, responsavelTecnicoNovo);
        return responsavelTecnicoNovo;
    }

    public void salvarLaboratorios(ResponsavelTecnico entidade, ResponsavelTecnico responsavelTecnicoNovo){
        entidade
                .getLaboratorios()
                .forEach(e -> new ResponsavelTecnicoHasLaboratorio(responsavelTecnicoNovo.getId(), e.getId()));
    }

    public ResponsavelTecnico select(int id) {
        return responsavelTecnicoDAO.select(id);
    }


    public List<ResponsavelTecnico> selectAll() {
        return responsavelTecnicoDAO.selectAll();
    }


    public boolean delete(int id) throws SQLException {
        return responsavelTecnicoDAO.delete(id);
    }

    public void removerLaboratorios(ResponsavelTecnico responsavelTecnico) throws SQLException {
        responsavelTecnicoHasLaboratorioDAO.deleteFromResponsavelTecnico(responsavelTecnico.getId());
    }

    public void update(ResponsavelTecnico entidade) throws SQLException {
        removerLaboratorios(entidade);
        responsavelTecnicoDAO.update(entidade);
        salvarLaboratorios(entidade, entidade);
    }
}