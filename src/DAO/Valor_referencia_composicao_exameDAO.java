package DAO;

public class Valor_referencia_composicao_exameDAO extends ConexaoDB{
    private static final String INSERT_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL = "INSERT INTO valor_referencia_composicao_exame (valor_minimo,valor_maximo,limitador_minimo,limitador_maximo,unidade_medida_id) VALUES (?,?,?,?,?);";
    private static final String SELECT_VALOR_REFERENCIA_COMPOSICAO_EXAME_BY_ID = "SELECT id, * FROM valor_referencia_composicao_exame WHERE id = ?";
    private static final String SELECT_ALL_VALOR_REFERENCIA_COMPOSICAO_EXAME = "SELECT * FROM valor_referencia_composicao_exame;";
    private static final String DELETE_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL = "DELETE FROM valor_referencia_composicao_exame WHERE id = ?;";
    private static final String UPDATE_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL = "UPDATE valor_referencia_composicao_exame SET valor_minimo = ?,valor_maximo = ?,limitador_minimo = ?,limitador_maximo = ?,unidade_medida_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM valor_referencia_composicao_exame;";
}
