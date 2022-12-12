package DAO;

import model.HabilitacaoExame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HabilitacaoExameDAO extends ConexaoDB{
    private static final String INSERT_HABILITACAO_EXAME_SQL = "INSERT INTO habilitacao_exame (observacao,custo,laboratorio_id,tipo_exame_id) VALUES (?,?,?,?);";
    private static final String SELECT_HABILITACAO_EXAME_BY_ID = "SELECT id, * FROM habilitacao_exame WHERE id = ?";
    private static final String SELECT_ALL_HABILITACAO_EXAME = "SELECT * FROM habilitacao_exame;";
    private static final String DELETE_HABILITACAO_EXAME_SQL = "DELETE FROM habilitacao_exame WHERE id = ?;";
    private static final String UPDATE_HABILITACAO_EXAME_SQL = "UPDATE habilitacao_exame SET observacao = ?,custo = ?,laboratorio_id = ?,tipo_exame_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM habilitacao_exame;";

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

    public void insert(HabilitacaoExame entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_HABILITACAO_EXAME_SQL)) {
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

    public HabilitacaoExame select(int id) {
        HabilitacaoExame entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_HABILITACAO_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String observacao = rs.getString("observacao");
                Double custo = rs.getDouble("custo");
                Integer laboratorio_id = rs.getInt("laboratorio_id");
                Integer tipo_exame_id = rs.getInt("tipo_exame_id");
                entidade = new HabilitacaoExame(id,observacao,custo,laboratorio_id,tipo_exame_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<HabilitacaoExame> selectAll() {
        List<HabilitacaoExame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_HABILITACAO_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String observacao = rs.getString("observacao");
                Double custo = rs.getDouble("custo");
                Integer laboratorio_id = rs.getInt("laboratorio_id");
                Integer tipo_exame_id = rs.getInt("tipo_exame_id");
                entidades.add(new HabilitacaoExame(id, observacao,custo,laboratorio_id,tipo_exame_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_HABILITACAO_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(HabilitacaoExame entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_HABILITACAO_EXAME_SQL)) {
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
