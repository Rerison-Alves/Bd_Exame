package DAO;

public class EspecialidadeDAO extends ConexaoDB{
    private static final String INSERT_ESPECIALIDADE_SQL = "INSERT INTO especialidade (descricao,observacao) VALUES (?,?);";
    private static final String SELECT_ESPECIALIDADE_BY_ID = "SELECT id, * FROM especialidade WHERE id = ?";
    private static final String SELECT_ALL_ESPECIALIDADE = "SELECT * FROM especialidade;";
    private static final String DELETE_ESPECIALIDADE_SQL = "DELETE FROM especialidade WHERE id = ?;";
    private static final String UPDATE_ESPECIALIDADE_SQL = "UPDATE especialidade SET descricao = ?,observacao = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM especialidade;";
}
