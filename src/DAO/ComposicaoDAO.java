package DAO;

public class ComposicaoDAO extends ConexaoDB{

    private static final String INSERT_COMPOSICAO_SQL = "INSERT INTO composicao (exame_id,composicao_exame_id,valor_referencia_composicao_exame_id) VALUES (?,?,?);";
    private static final String SELECT_COMPOSICAO_BY_ID = "SELECT id, * FROM composicao WHERE id = ?";
    private static final String SELECT_ALL_COMPOSICAO = "SELECT * FROM composicao;";
    private static final String DELETE_COMPOSICAO_SQL = "DELETE FROM composicao WHERE id = ?;";
    private static final String UPDATE_COMPOSICAO_SQL = "UPDATE composicao SET descricao = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM composicao;";

}
