package DAO;

public class Sigla_formacaoDAO extends ConexaoDB{
    private static final String INSERT_SIGLA_FORMACAO_SQL = "INSERT INTO sigla_formacao (sigla) VALUES (?);";
    private static final String SELECT_SIGLA_FORMACAO_BY_ID = "SELECT id, * FROM sigla_formacao WHERE id = ?";
    private static final String SELECT_ALL_SIGLA_FORMACAO = "SELECT * FROM sigla_formacao;";
    private static final String DELETE_SIGLA_FORMACAO_SQL = "DELETE FROM sigla_formacao WHERE id = ?;";
    private static final String UPDATE_SIGLA_FORMACAO_SQL = "UPDATE sigla_formacao SET sigla = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM sigla_formacao;";
}
