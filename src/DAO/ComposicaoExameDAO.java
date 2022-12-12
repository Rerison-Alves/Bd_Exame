package DAO;

import model.ComposicaoExame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComposicaoExameDAO extends ConexaoDB{

    private static final String INSERT_COMPOSICAO_EXAME_SQL = "INSERT INTO composicao_exame (descricao,unidade_medida_id) VALUES (?,?);";
    private static final String SELECT_COMPOSICAO_EXAME_BY_ID = "SELECT id, * FROM composicao_exame WHERE id = ?";
    private static final String SELECT_ALL_COMPOSICAO_EXAME = "SELECT * FROM composicao_exame;";
    private static final String DELETE_COMPOSICAO_EXAME_SQL = "DELETE FROM composicao_exame WHERE id = ?;";
    private static final String UPDATE_COMPOSICAO_EXAME_SQL = "UPDATE composicao_exame SET descricao = ?,unidade_medida_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM composicao_exame;";

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

    public void insert(ComposicaoExame entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_COMPOSICAO_EXAME_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setInt(2, entidade.getUnidade_medida_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ComposicaoExame select(int id) {
        ComposicaoExame entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_COMPOSICAO_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                Integer unidade_medida_id = rs.getInt("unidade_medida_id");
                entidade = new ComposicaoExame(id, descricao,unidade_medida_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<ComposicaoExame> selectAll() {
        List<ComposicaoExame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_COMPOSICAO_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                Integer unidade_medida_id = rs.getInt("unidade_medida_id");
                entidades.add(new ComposicaoExame(id, descricao, unidade_medida_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_COMPOSICAO_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(ComposicaoExame entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_COMPOSICAO_EXAME_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getUnidade_medida_id());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
