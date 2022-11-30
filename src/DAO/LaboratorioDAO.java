package DAO;

public class LaboratorioDAO {
    private static final String INSERT_LABORATORIO_SQL = "INSERT INTO laboratorio (descricao,CNES,CNPJ,CRBM,nome_fantasia) VALUES (?,?,?,?,?);";
    private static final String SELECT_LABORATORIO_BY_ID = "SELECT id, * FROM laboratorio WHERE id = ?";
    private static final String SELECT_ALL_LABORATORIO = "SELECT * FROM laboratorio;";
    private static final String DELETE_LABORATORIO_SQL = "DELETE FROM laboratorio WHERE id = ?;";
    private static final String UPDATE_LABORATORIO_SQL = "UPDATE laboratorio SET descricao = ?,CNES = ?,CNPJ = ?,CRBM = ?,nome_fantasia = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM laboratorio;";
}
