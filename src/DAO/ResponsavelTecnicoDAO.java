package DAO;

import model.ResponsavelTecnico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResponsavelTecnicoDAO extends ConexaoDB{
    private static final String INSERT_RESPONSAVEL_TECNICO_SQL = "INSERT INTO responsavel_tecnico (nome,conselho,formacao,sigla_formacao_id) VALUES (?,?,?,?);";
    private static final String SELECT_RESPONSAVEL_TECNICO_BY_ID = "SELECT id, * FROM responsavel_tecnico WHERE id = ?";
    private static final String SELECT_ALL_RESPONSAVEL_TECNICO = "SELECT * FROM responsavel_tecnico;";
    private static final String DELETE_RESPONSAVEL_TECNICO_SQL = "DELETE FROM responsavel_tecnico WHERE id = ?;";
    private static final String UPDATE_RESPONSAVEL_TECNICO_SQL = "UPDATE responsavel_tecnico SET nome = ?,conselho = ?,formacao = ?,sigla_formacao_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM responsavel_tecnico;";

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

    public ResponsavelTecnico insert(ResponsavelTecnico entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_RESPONSAVEL_TECNICO_SQL)) {
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setString(2, entidade.getConselho());
            preparedStatement.setString(3, entidade.getFormacao());
            preparedStatement.setInt(4, entidade.getSigla_formacao_id());
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

    public ResponsavelTecnico select(int id) {
        ResponsavelTecnico entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_RESPONSAVEL_TECNICO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String conselho = rs.getString("conselho");
                String formacao = rs.getString("formacao");
                Integer sigla_formacao_id = rs.getInt("sigla_formacao_id");
                entidade = new ResponsavelTecnico(id,nome,conselho,formacao,sigla_formacao_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<ResponsavelTecnico> selectAll() {
        List<ResponsavelTecnico> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_RESPONSAVEL_TECNICO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String conselho = rs.getString("conselho");
                String formacao = rs.getString("formacao");
                Integer sigla_formacao_id = rs.getInt("sigla_formacao_id");
                entidades.add(new ResponsavelTecnico(id,nome,conselho,formacao,sigla_formacao_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_RESPONSAVEL_TECNICO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(ResponsavelTecnico entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_RESPONSAVEL_TECNICO_SQL)) {
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
