package DAO;

import model.Responsavel_tecnico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Responsavel_tecnicoDAO extends ConexaoDB{
    private static final String INSERT_RESPONSAVEL_TECNICO_SQL = "INSERT INTO responsavel_tecnico (nome,conselho,formacao,sigla_formacao_id) VALUES (?,?,?,?);";
    private static final String SELECT_RESPONSAVEL_TECNICO_BY_ID = "SELECT id, * FROM responsavel_tecnico WHERE id = ?";
    private static final String SELECT_ALL_RESPONSAVEL_TECNICO = "SELECT * FROM responsavel_tecnico;";
    private static final String DELETE_RESPONSAVEL_TECNICO_SQL = "DELETE FROM responsavel_tecnico WHERE id = ?;";
    private static final String UPDATE_RESPONSAVEL_TECNICO_SQL = "UPDATE responsavel_tecnico SET nome = ?,conselho = ?,formacao = ?,sigla_formacao_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM responsavel_tecnico;";

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

    public void insertResponsavel_tecnico(Responsavel_tecnico entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_RESPONSAVEL_TECNICO_SQL)) {
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setString(2, entidade.getConselho());
            preparedStatement.setString(3, entidade.getFormacao());
            preparedStatement.setInt(4, entidade.getSigla_formacao_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Responsavel_tecnico selectResponsavel_tecnico(int id) {
        Responsavel_tecnico entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_RESPONSAVEL_TECNICO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String conselho = rs.getString("conselho");
                String formacao = rs.getString("formacao");
                Integer sigla_formacao_id = rs.getInt("sigla_formacao_id");
                entidade = new Responsavel_tecnico(id,nome,conselho,formacao,sigla_formacao_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Responsavel_tecnico> selectAllResponsavel_tecnico() {
        List<Responsavel_tecnico> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_RESPONSAVEL_TECNICO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String conselho = rs.getString("conselho");
                String formacao = rs.getString("formacao");
                Integer sigla_formacao_id = rs.getInt("sigla_formacao_id");
                entidades.add(new Responsavel_tecnico(id,nome,conselho,formacao,sigla_formacao_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteResponsavel_tecnico(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_RESPONSAVEL_TECNICO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateResponsavel_tecnico(Responsavel_tecnico entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_RESPONSAVEL_TECNICO_SQL)) {
            statement.setString(1, entidade.getNome());
            statement.setString(2, entidade.getConselho());
            statement.setString(3, entidade.getFormacao());
            statement.setInt(4, entidade.getSigla_formacao_id());
            statement.setInt(5, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
