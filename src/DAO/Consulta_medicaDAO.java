package DAO;

public class Consulta_medicaDAO extends ConexaoDB{
    private static final String INSERT_CONSULTA_MEDICA_SQL = "INSERT INTO consulta_medica (dt_consulta,medico_id,paciente_id,nm_atendimento) VALUES (?,?,?,?);";
    private static final String SELECT_CONSULTA_MEDICA_BY_ID = "SELECT id, * FROM consulta_medica WHERE id = ?";
    private static final String SELECT_ALL_CONSULTA_MEDICA = "SELECT * FROM consulta_medica;";
    private static final String DELETE_CONSULTA_MEDICA_SQL = "DELETE FROM consulta_medica WHERE id = ?;";
    private static final String UPDATE_CONSULTA_MEDICA_SQL = "UPDATE consulta_medica SET dt_consulta = ?,medico_id = ?,paciente_id = ?,nm_atendimento = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM consulta_medica;";
}
