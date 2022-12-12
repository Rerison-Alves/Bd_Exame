package DAO;

import model.ConsultaMedica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsultaMedicaDAO extends ConexaoDB{
    private static final String INSERT_CONSULTA_MEDICA_SQL = "INSERT INTO consulta_medica (dt_consulta,medico_id,paciente_id,nm_atendimento) VALUES (?,?,?,?);";
    private static final String SELECT_CONSULTA_MEDICA_BY_ID = "SELECT id, * FROM consulta_medica WHERE id = ?";
    private static final String SELECT_ALL_CONSULTA_MEDICA = "SELECT * FROM consulta_medica;";
    private static final String DELETE_CONSULTA_MEDICA_SQL = "DELETE FROM consulta_medica WHERE id = ?;";
    private static final String UPDATE_CONSULTA_MEDICA_SQL = "UPDATE consulta_medica SET dt_consulta = ?,medico_id = ?,paciente_id = ?,nm_atendimento = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM consulta_medica;";

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

    public void insert(ConsultaMedica entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_CONSULTA_MEDICA_SQL)) {
            preparedStatement.setTimestamp(1, new Timestamp(entidade.getDt_consulta().getTime()));
            preparedStatement.setInt(2, entidade.getMedico_id());
            preparedStatement.setInt(3, entidade.getPaciente_id());
            preparedStatement.setString(4, entidade.getNm_atendimento());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ConsultaMedica select(int id) {
        ConsultaMedica entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_CONSULTA_MEDICA_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Date dt_consulta = new Date(rs.getTimestamp("dt_consulta").getTime());
                Integer medico_id = rs.getInt("medico_id");
                Integer paciente_id = rs.getInt("paciente_id");
                String nm_atendimento = rs.getString("nm_atendimento");
                entidade = new ConsultaMedica(id,dt_consulta,medico_id,paciente_id,nm_atendimento);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<ConsultaMedica> selectAll() {
        List<ConsultaMedica> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_CONSULTA_MEDICA)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                Date dt_consulta = new Date(rs.getTimestamp("dt_consulta").getTime());
                Integer medico_id = rs.getInt("medico_id");
                Integer paciente_id = rs.getInt("paciente_id");
                String nm_atendimento = rs.getString("nm_atendimento");
                entidades.add(new ConsultaMedica(id, dt_consulta,medico_id,paciente_id,nm_atendimento));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_CONSULTA_MEDICA_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(ConsultaMedica entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_CONSULTA_MEDICA_SQL)) {
            statement.setTimestamp(1, new Timestamp(entidade.getDt_consulta().getTime()));
            statement.setInt(2, entidade.getMedico_id());
            statement.setInt(3, entidade.getPaciente_id());
            statement.setString(4, entidade.getNm_atendimento());
            statement.setInt(5, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
