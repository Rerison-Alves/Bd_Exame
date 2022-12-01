package DAO;

public class Responsavel_tecnicoDAO extends ConexaoDB{
    private static final String INSERT_RESPONSAVEL_TECNICO_SQL = "INSERT INTO responsavel_tecnico (nome,conselho,formacao,sigla_formacao_id) VALUES (?,?,?,?);";
    private static final String SELECT_RESPONSAVEL_TECNICO_BY_ID = "SELECT id, * FROM responsavel_tecnico WHERE id = ?";
    private static final String SELECT_ALL_RESPONSAVEL_TECNICO = "SELECT * FROM responsavel_tecnico;";
    private static final String DELETE_RESPONSAVEL_TECNICO_SQL = "DELETE FROM responsavel_tecnico WHERE id = ?;";
    private static final String UPDATE_RESPONSAVEL_TECNICO_SQL = "UPDATE responsavel_tecnico SET nome = ?,conselho = ?,formacao = ?,sigla_formacao_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM responsavel_tecnico;";

}
