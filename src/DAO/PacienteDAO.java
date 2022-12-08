package DAO;

import model.Paciente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PacienteDAO extends ConexaoDB{
    private static final String INSERT_PACIENTE_SQL = "INSERT INTO paciente (nome,dt_nascimento) VALUES (?,?);";
    private static final String SELECT_PACIENTE_BY_ID = "SELECT id, * FROM paciente WHERE id = ?";
    private static final String SELECT_ALL_PACIENTE = "SELECT * FROM paciente;";
    private static final String DELETE_PACIENTE_SQL = "DELETE FROM paciente WHERE id = ?;";
    private static final String UPDATE_PACIENTE_SQL = "UPDATE paciente SET nome = ?,dt_nascimento = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM paciente;";

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

    public void insertPaciente(Paciente entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_PACIENTE_SQL)) {
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setTimestamp(2, new Timestamp(entidade.getDt_nascimento().getTime()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Paciente selectPaciente(int id) {
        Paciente entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_PACIENTE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                Date dt_nascimento = new Date(rs.getTimestamp("dt_nascimento").getTime());
                entidade = new Paciente(id,nome,dt_nascimento);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Paciente> selectAllPaciente() {
        List<Paciente> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_PACIENTE)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date dt_nascimento = new Date(rs.getTimestamp("dt_nascimento").getTime());
                entidades.add(new Paciente(id,nome,dt_nascimento));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deletePaciente(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_PACIENTE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updatePaciente(Paciente entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_PACIENTE_SQL)) {
            statement.setString(1, entidade.getNome());
            statement.setTimestamp(2, new Timestamp(entidade.getDt_nascimento().getTime()));
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
