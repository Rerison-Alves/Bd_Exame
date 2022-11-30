package DAO;

public class EnderecoDAO extends ConexaoDB{
    private static final String INSERT_CONTATO_SQL = "INSERT INTO contato (telefone,laboratorio_id) VALUES (?,?);";
    private static final String SELECT_CONTATO_BY_ID = "SELECT id, * FROM contato WHERE id = ?";
    private static final String SELECT_ALL_CONTATO = "SELECT * FROM contato;";
    private static final String DELETE_CONTATO_SQL = "DELETE FROM contato WHERE id = ?;";
    private static final String UPDATE_CONTATO_SQL = "UPDATE contato SET telefone = ?,laboratorio_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM contato;";
}
