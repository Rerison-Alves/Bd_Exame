package DAO;

import model.SiglaFormacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SiglaFormacaoDAO extends ConexaoDB{
    private static final String INSERT_SIGLA_FORMACAO_SQL = "INSERT INTO sigla_formacao (sigla) VALUES (?);";
    private static final String SELECT_SIGLA_FORMACAO_BY_ID = "SELECT id, * FROM sigla_formacao WHERE id = ?";
    private static final String SELECT_ALL_SIGLA_FORMACAO = "SELECT * FROM sigla_formacao;";
    private static final String DELETE_SIGLA_FORMACAO_SQL = "DELETE FROM sigla_formacao WHERE id = ?;";
    private static final String UPDATE_SIGLA_FORMACAO_SQL = "UPDATE sigla_formacao SET sigla = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM sigla_formacao;";

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

    public void insert(SiglaFormacao entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_SIGLA_FORMACAO_SQL)) {
            preparedStatement.setString(1, entidade.getSigla());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public SiglaFormacao select(int id) {
        SiglaFormacao entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_SIGLA_FORMACAO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String sigla = rs.getString("sigla");
                entidade = new SiglaFormacao(id, sigla);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<SiglaFormacao> selectAll() {
        List<SiglaFormacao> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_SIGLA_FORMACAO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String sigla = rs.getString("sigla");
                entidades.add(new SiglaFormacao(id, sigla));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_SIGLA_FORMACAO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(SiglaFormacao entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_SIGLA_FORMACAO_SQL)) {
            statement.setString(1, entidade.getSigla());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
