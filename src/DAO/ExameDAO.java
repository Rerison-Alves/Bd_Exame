package DAO;

public class ExameDAO extends ConexaoDB{
    private static final String INSERT_EXAME_SQL = "INSERT INTO exame (tipo_exame_id,material_exame_id,descricao,metodo) VALUES (?,?,?,?);";
    private static final String SELECT_EXAME_BY_ID = "SELECT id, * FROM exame WHERE id = ?";
    private static final String SELECT_ALL_EXAME = "SELECT * FROM exame;";
    private static final String DELETE_EXAME_SQL = "DELETE FROM exame WHERE id = ?;";
    private static final String UPDATE_EXAME_SQL = "UPDATE exame SET tipo_exame_id = ?,material_exame_id = ?,descricao = ?,metodo = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM exame;";
}
