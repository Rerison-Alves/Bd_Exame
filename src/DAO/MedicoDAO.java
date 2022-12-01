package DAO;

public class MedicoDAO extends ConexaoDB{
    private static final String INSERT_MEDICO_SQL = "INSERT INTO medico (crm,nome) VALUES (?,?);";
    private static final String SELECT_MEDICO_BY_ID = "SELECT id, * FROM medico WHERE id = ?";
    private static final String SELECT_ALL_MEDICO = "SELECT * FROM medico;";
    private static final String DELETE_MEDICO_SQL = "DELETE FROM medico WHERE id = ?;";
    private static final String UPDATE_MEDICO_SQL = "UPDATE medico SET crm = ?,nome = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM medico;";
}
