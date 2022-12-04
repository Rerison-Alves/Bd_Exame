package DAO;

import model.Unidade_medida;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Unidade_medidaDAO extends ConexaoDB{
    private static final String INSERT_UNIDADE_MEDIDA_SQL = "INSERT INTO unidade_medida (descricao) VALUES (?);";
    private static final String SELECT_UNIDADE_MEDIDA_BY_ID = "SELECT id, * FROM unidade_medida WHERE id = ?";
    private static final String SELECT_ALL_UNIDADE_MEDIDA = "SELECT * FROM unidade_medida;";
    private static final String DELETE_UNIDADE_MEDIDA_SQL = "DELETE FROM unidade_medida WHERE id = ?;";
    private static final String UPDATE_UNIDADE_MEDIDA_SQL = "UPDATE unidade_medida SET descricao = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM unidade_medida;";

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

    public void insertUnidade_medida(Unidade_medida entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_UNIDADE_MEDIDA_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Unidade_medida selectUnidade_medida(int id) {
        Unidade_medida entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_UNIDADE_MEDIDA_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                entidade = new Unidade_medida(id, descricao);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Unidade_medida> selectAllMarcas() {
        List<Unidade_medida> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_UNIDADE_MEDIDA)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                entidades.add(new Unidade_medida(id, descricao));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteUnidade_medida(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_UNIDADE_MEDIDA_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateUnidade_medida(Unidade_medida entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_UNIDADE_MEDIDA_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
