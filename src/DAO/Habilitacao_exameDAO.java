package DAO;

import model.Habilitacao_exame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Habilitacao_exameDAO extends ConexaoDB{
    private static final String INSERT_HABILITACAO_EXAME_SQL = "INSERT INTO habilitacao_exame (observacao,custo,laboratorio_id,tipo_exame_id) VALUES (?,?,?,?);";
    private static final String SELECT_HABILITACAO_EXAME_BY_ID = "SELECT id, * FROM habilitacao_exame WHERE id = ?";
    private static final String SELECT_ALL_HABILITACAO_EXAME = "SELECT * FROM habilitacao_exame;";
    private static final String DELETE_HABILITACAO_EXAME_SQL = "DELETE FROM habilitacao_exame WHERE id = ?;";
    private static final String UPDATE_HABILITACAO_EXAME_SQL = "UPDATE habilitacao_exame SET observacao = ?,custo = ?,laboratorio_id = ?,tipo_exame_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM habilitacao_exame;";

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

    public void insertHabilitacao_exame(Habilitacao_exame entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_HABILITACAO_EXAME_SQL)) {
            preparedStatement.setString(1, entidade.getObservacao());
            preparedStatement.setDouble(2, entidade.getCusto());
            preparedStatement.setInt(3, entidade.getLaboratorio_id());
            preparedStatement.setInt(4, entidade.getTipo_exame_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Habilitacao_exame selectHabilitacao_exame(int id) {
        Habilitacao_exame entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_HABILITACAO_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String observacao = rs.getString("observacao");
                Double custo = rs.getDouble("custo");
                Integer laboratorio_id = rs.getInt("laboratorio_id");
                Integer tipo_exame_id = rs.getInt("tipo_exame_id");
                entidade = new Habilitacao_exame(id,observacao,custo,laboratorio_id,tipo_exame_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Habilitacao_exame> selectAllHabilitacao_exame() {
        List<Habilitacao_exame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_HABILITACAO_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String observacao = rs.getString("observacao");
                Double custo = rs.getDouble("custo");
                Integer laboratorio_id = rs.getInt("laboratorio_id");
                Integer tipo_exame_id = rs.getInt("tipo_exame_id");
                entidades.add(new Habilitacao_exame(id, observacao,custo,laboratorio_id,tipo_exame_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteHabilitacao_exame(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_HABILITACAO_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateHabilitacao_exame(Habilitacao_exame entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_HABILITACAO_EXAME_SQL)) {
            statement.setString(1, entidade.getObservacao());
            statement.setDouble(2, entidade.getCusto());
            statement.setInt(3, entidade.getLaboratorio_id());
            statement.setInt(4, entidade.getTipo_exame_id());
            statement.setInt(5, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
