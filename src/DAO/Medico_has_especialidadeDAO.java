package DAO;

import model.Medico_has_especialidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Medico_has_especialidadeDAO extends ConexaoDB{
    private static final String INSERT_MEDICO_HAS_ESPECIALIDADE_SQL = "INSERT INTO medico_has_especialidade (medico_id,especialidade_id) VALUES (?,?);";
    private static final String SELECT_MEDICO_HAS_ESPECIALIDADE_BY_ID = "SELECT id, * FROM medico_has_especialidade WHERE id = ?";
    private static final String SELECT_ALL_MEDICO_HAS_ESPECIALIDADE = "SELECT * FROM medico_has_especialidade;";
    private static final String DELETE_MEDICO_HAS_ESPECIALIDADE_SQL = "DELETE FROM medico_has_especialidade WHERE id = ?;";
    private static final String UPDATE_MEDICO_HAS_ESPECIALIDADE_SQL = "UPDATE medico_has_especialidade SET medico_id = ?,especialidade_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM medico_has_especialidade;";

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

    public void insertMedico_has_especialidade(Medico_has_especialidade entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_MEDICO_HAS_ESPECIALIDADE_SQL)) {
            preparedStatement.setInt(1, entidade.getMedico_id());
            preparedStatement.setInt(2, entidade.getEspecialidade_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Medico_has_especialidade selectMedico_has_especialidade(int id) {
        Medico_has_especialidade entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_MEDICO_HAS_ESPECIALIDADE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer medico_id = rs.getInt("medico_id");
                Integer especialidade_id = rs.getInt("especialidade_id");
                entidade = new Medico_has_especialidade(id,medico_id,especialidade_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Medico_has_especialidade> selectAllMedico_has_especialidade() {
        List<Medico_has_especialidade> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_MEDICO_HAS_ESPECIALIDADE)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                Integer medico_id = rs.getInt("medico_id");
                Integer especialidade_id = rs.getInt("especialidade_id");
                entidades.add(new Medico_has_especialidade(id,medico_id,especialidade_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteMedico_has_especialidade(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_MEDICO_HAS_ESPECIALIDADE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateMedico_has_especialidade(Medico_has_especialidade entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_MEDICO_HAS_ESPECIALIDADE_SQL)) {
            statement.setInt(1, entidade.getMedico_id());
            statement.setInt(2, entidade.getEspecialidade_id());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
