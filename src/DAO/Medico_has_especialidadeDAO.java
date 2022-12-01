package DAO;

public class Medico_has_especialidadeDAO extends ConexaoDB{
    private static final String INSERT_MEDICO_HAS_ESPECIALIDADE_SQL = "INSERT INTO medico_has_especialidade (medico_id,especialidade_id) VALUES (?,?);";
    private static final String SELECT_MEDICO_HAS_ESPECIALIDADE_BY_ID = "SELECT id, * FROM medico_has_especialidade WHERE id = ?";
    private static final String SELECT_ALL_MEDICO_HAS_ESPECIALIDADE = "SELECT * FROM medico_has_especialidade;";
    private static final String DELETE_MEDICO_HAS_ESPECIALIDADE_SQL = "DELETE FROM medico_has_especialidade WHERE id = ?;";
    private static final String UPDATE_MEDICO_HAS_ESPECIALIDADE_SQL = "UPDATE medico_has_especialidade SET medico_id = ?,especialidade_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM medico_has_especialidade;";
}
