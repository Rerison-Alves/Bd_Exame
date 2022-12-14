package DAO;

import model.Laudo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaudoDAO extends ConexaoDB{
    private static final String INSERT_LAUDO_SQL = "INSERT INTO laudo (assinatura_digital,dt_resultado,codigo,solicitacao_exame_id) VALUES (?,?,?,?);";
    private static final String SELECT_LAUDO_BY_ID = "SELECT id, * FROM laudo WHERE id = ?";
    private static final String SELECT_ALL_LAUDO = "SELECT * FROM laudo;";
    private static final String DELETE_LAUDO_SQL = "DELETE FROM laudo WHERE id = ?;";
    private static final String UPDATE_LAUDO_SQL = "UPDATE laudo SET assinatura_digital = ?,dt_resultado = ?,codigo = ?,solicitacao_exame_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM laudo;";

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prepararSQL(TOTAL)) {
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

    public Laudo insert(Laudo entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_LAUDO_SQL)) {
            preparedStatement.setString(1, entidade.getAssinatura_digital());
            preparedStatement.setTimestamp(2, new Timestamp(entidade.getDt_resultado().getTime()));
            preparedStatement.setString(3, entidade.getCodigo());
            preparedStatement.setInt(4, entidade.getSolicitacao_exame_id());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()){
                entidade.setId(resultSet.getInt(1));
            }
            preparedStatement.getConnection().close();
            return entidade;
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public Laudo select(int id) {
        Laudo entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_LAUDO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String assinatura_digital = rs.getString("assinatura_digital");
                java.util.Date dt_resultado = new java.util.Date(rs.getTimestamp("dt_resultado").getTime());
                String codigo = rs.getString("codigo");
                Integer solicitacao_exame_id = rs.getInt("solicitacao_exame_id");
                entidade = new Laudo(id,assinatura_digital,dt_resultado,codigo,solicitacao_exame_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Laudo> selectAll() {
        List<Laudo> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_LAUDO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String assinatura_digital = rs.getString("assinatura_digital");
                java.util.Date dt_resultado = new java.util.Date(rs.getTimestamp("dt_resultado").getTime());
                String codigo = rs.getString("codigo");
                Integer solicitacao_exame_id = rs.getInt("solicitacao_exame_id");
                entidades.add(new Laudo(id,assinatura_digital,dt_resultado,codigo,solicitacao_exame_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_LAUDO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(Laudo entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_LAUDO_SQL)) {
            statement.setString(1, entidade.getAssinatura_digital());
            statement.setTimestamp(2, new Timestamp(entidade.getDt_resultado().getTime()));
            statement.setString(3, entidade.getCodigo());
            statement.setInt(4, entidade.getSolicitacao_exame_id());
            statement.setInt(5, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
