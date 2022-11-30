package DAO;

public class Composicao_exameDAO extends ConexaoDB{

    private static final String INSERT_COMPOSICAO_EXAME_SQL = "INSERT INTO composicao_exame (descricao,unidade_medida_id) VALUES (?,?);";
    private static final String SELECT_COMPOSICAO_EXAME_BY_ID = "SELECT id, * FROM composicao_exame WHERE id = ?";
    private static final String SELECT_ALL_COMPOSICAO_EXAME = "SELECT * FROM composicao_exame;";
    private static final String DELETE_COMPOSICAO_EXAME_SQL = "DELETE FROM composicao_exame WHERE id = ?;";
    private static final String UPDATE_COMPOSICAO_EXAME_SQL = "UPDATE composicao_exame SET descricao = ?,unidade_medida_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM composicao_exame;";
}
