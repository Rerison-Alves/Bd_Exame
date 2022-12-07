package DAO;

import model.ResultadoExame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultadoExameDAO extends ConexaoDB{
    private static final String INSERT_RESULTADO_EXAME_SQL = "INSERT INTO resultado_exame (dt_exame,valor,composicao_id,laudo_id) VALUES (?,?,?,?);";
    private static final String SELECT_RESULTADO_EXAME_BY_ID = "SELECT id, * FROM resultado_exame WHERE id = ?";
    private static final String SELECT_ALL_RESULTADO_EXAME = "SELECT * FROM resultado_exame;";
    private static final String DELETE_RESULTADO_EXAME_SQL = "DELETE FROM resultado_exame WHERE id = ?;";
    private static final String UPDATE_RESULTADO_EXAME_SQL = "UPDATE resultado_exame SET dt_exame = ?,valor = ?,composicao_id = ?,laudo_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM resultado_exame;";

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

    public void insertResultado_exame(ResultadoExame entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_RESULTADO_EXAME_SQL)) {
            preparedStatement.setDate(1, new java.sql.Date(entidade.getDt_exame().getTime()));
            preparedStatement.setString(2, entidade.getValor());
            preparedStatement.setInt(3, entidade.getComposicao_id());
            preparedStatement.setInt(4, entidade.getLaudo_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultadoExame selectResultado_exame(int id) {
        ResultadoExame entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_RESULTADO_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                java.util.Date dt_exame = new java.util.Date(rs.getDate("dt_exame").getTime());
                String valor = rs.getString("valor");
                Integer composicao_id = rs.getInt("composicao_id");
                Integer laudo_id = rs.getInt("laudo_id");
                entidade = new ResultadoExame(id, dt_exame,valor,composicao_id,laudo_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<ResultadoExame> selectAllResultado_exame() {
        List<ResultadoExame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_RESULTADO_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                java.util.Date dt_exame = new java.util.Date(rs.getDate("dt_exame").getTime());
                String valor = rs.getString("valor");
                Integer composicao_id = rs.getInt("composicao_id");
                Integer laudo_id = rs.getInt("laudo_id");
                entidades.add(new ResultadoExame(id, dt_exame,valor,composicao_id,laudo_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteResultado_exame(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_RESULTADO_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateResultado_exame(ResultadoExame entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_RESULTADO_EXAME_SQL)) {
            statement.setDate(1, new java.sql.Date(entidade.getDt_exame().getTime()));
            statement.setString(2, entidade.getValor());
            statement.setInt(3, entidade.getComposicao_id());
            statement.setInt(4, entidade.getLaudo_id());
            statement.setInt(5, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
