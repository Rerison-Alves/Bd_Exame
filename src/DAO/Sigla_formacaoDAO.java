package DAO;

import model.Sigla_formacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Sigla_formacaoDAO extends ConexaoDB{
    private static final String INSERT_SIGLA_FORMACAO_SQL = "INSERT INTO sigla_formacao (sigla) VALUES (?);";
    private static final String SELECT_SIGLA_FORMACAO_BY_ID = "SELECT id, * FROM sigla_formacao WHERE id = ?";
    private static final String SELECT_ALL_SIGLA_FORMACAO = "SELECT * FROM sigla_formacao;";
    private static final String DELETE_SIGLA_FORMACAO_SQL = "DELETE FROM sigla_formacao WHERE id = ?;";
    private static final String UPDATE_SIGLA_FORMACAO_SQL = "UPDATE sigla_formacao SET sigla = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM sigla_formacao;";

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

    public void insertSigla_formacao(Sigla_formacao entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_SIGLA_FORMACAO_SQL)) {
            preparedStatement.setString(1, entidade.getSigla());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Sigla_formacao selectSigla_formacao(int id) {
        Sigla_formacao entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_SIGLA_FORMACAO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String sigla = rs.getString("sigla");
                entidade = new Sigla_formacao(id, sigla);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Sigla_formacao> selectAllSigla_formacao() {
        List<Sigla_formacao> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_SIGLA_FORMACAO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String sigla = rs.getString("sigla");
                entidades.add(new Sigla_formacao(id, sigla));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteSigla_formacao(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_SIGLA_FORMACAO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateSigla_formacao(Sigla_formacao entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_SIGLA_FORMACAO_SQL)) {
            statement.setString(1, entidade.getSigla());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
