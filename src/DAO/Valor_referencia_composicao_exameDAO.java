package DAO;

import model.Valor_referencia_composicao_exame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Valor_referencia_composicao_exameDAO extends ConexaoDB{
    private static final String INSERT_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL = "INSERT INTO valor_referencia_composicao_exame (valor_minimo,valor_maximo,limitador_minimo,limitador_maximo,unidade_medida_id) VALUES (?,?,?,?,?);";
    private static final String SELECT_VALOR_REFERENCIA_COMPOSICAO_EXAME_BY_ID = "SELECT id, * FROM valor_referencia_composicao_exame WHERE id = ?";
    private static final String SELECT_ALL_VALOR_REFERENCIA_COMPOSICAO_EXAME = "SELECT * FROM valor_referencia_composicao_exame;";
    private static final String DELETE_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL = "DELETE FROM valor_referencia_composicao_exame WHERE id = ?;";
    private static final String UPDATE_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL = "UPDATE valor_referencia_composicao_exame SET valor_minimo = ?,valor_maximo = ?,limitador_minimo = ?,limitador_maximo = ?,unidade_medida_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM valor_referencia_composicao_exame;";

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prapararSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void insertValor_referencia_composicao_exame(Valor_referencia_composicao_exame entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL)) {
            preparedStatement.setString(1, entidade.getValor_minimo());
            preparedStatement.setString(2, entidade.getValor_maximo());
            preparedStatement.setString(3, entidade.getLimitador_minimo());
            preparedStatement.setString(4, entidade.getLimitador_maximo());
            preparedStatement.setInt(5, entidade.getUnidade_medida_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Valor_referencia_composicao_exame selectValor_referencia_composicao_exame(int id) {
        Valor_referencia_composicao_exame entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_VALOR_REFERENCIA_COMPOSICAO_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String valor_minimo = rs.getString("valor_minimo");
                String valor_maximo = rs.getString("valor_maximo");
                String limitador_minimo = rs.getString("limitador_minimo");
                String limitador_maximo = rs.getString("limitador_maximo");
                Integer unidade_medida_id = rs.getInt("unidade_medida_id");
                entidade = new Valor_referencia_composicao_exame(id,valor_minimo,valor_maximo,limitador_minimo,limitador_maximo,unidade_medida_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Valor_referencia_composicao_exame> selectAllValor_referencia_composicao_exame() {
        List<Valor_referencia_composicao_exame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_VALOR_REFERENCIA_COMPOSICAO_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String valor_minimo = rs.getString("valor_minimo");
                String valor_maximo = rs.getString("valor_maximo");
                String limitador_minimo = rs.getString("limitador_minimo");
                String limitador_maximo = rs.getString("limitador_maximo");
                Integer unidade_medida_id = rs.getInt("unidade_medida_id");
                entidades.add(new Valor_referencia_composicao_exame(id,valor_minimo,valor_maximo,limitador_minimo,limitador_maximo,unidade_medida_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteValor_referencia_composicao_exame(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateValor_referencia_composicao_exame(Valor_referencia_composicao_exame entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_VALOR_REFERENCIA_COMPOSICAO_EXAME_SQL)) {
            statement.setString(1, entidade.getValor_minimo());
            statement.setString(2, entidade.getValor_maximo());
            statement.setString(3, entidade.getLimitador_minimo());
            statement.setString(4, entidade.getLimitador_maximo());
            statement.setInt(5, entidade.getUnidade_medida_id());
            statement.setInt(6, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
