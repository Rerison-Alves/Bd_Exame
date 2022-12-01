package DAO;

public class PacienteDAO {
    private static final String INSERT_PACIENTE_SQL = "INSERT INTO paciente (nome,dt_nascimento) VALUES (?,?);";
    private static final String SELECT_PACIENTE_BY_ID = "SELECT id, * FROM paciente WHERE id = ?";
    private static final String SELECT_ALL_PACIENTE = "SELECT * FROM paciente;";
    private static final String DELETE_PACIENTE_SQL = "DELETE FROM paciente WHERE id = ?;";
    private static final String UPDATE_PACIENTE_SQL = "UPDATE paciente SET nome = ?,dt_nascimento = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM paciente;";
}
