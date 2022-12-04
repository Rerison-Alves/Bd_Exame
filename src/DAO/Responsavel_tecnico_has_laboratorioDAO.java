package DAO;

import model.Responsavel_tecnico_has_laboratorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Responsavel_tecnico_has_laboratorioDAO extends ConexaoDB{
    private static final String INSERT_RESPONSAVEL_TECNICO_HAS_LABORATORIO_SQL = "INSERT INTO responsavel_tecnico_has_laboratorio (responsavel_tecnico_id,laboratorio_id) VALUES (?,?);";
    private static final String SELECT_RESPONSAVEL_TECNICO_HAS_LABORATORIO_BY_ID = "SELECT id, * FROM responsavel_tecnico_has_laboratorio WHERE id = ?";
    private static final String SELECT_ALL_RESPONSAVEL_TECNICO_HAS_LABORATORIO = "SELECT * FROM responsavel_tecnico_has_laboratorio;";
    private static final String DELETE_RESPONSAVEL_TECNICO_HAS_LABORATORIO_SQL = "DELETE FROM responsavel_tecnico_has_laboratorio WHERE id = ?;";
    private static final String UPDATE_RESPONSAVEL_TECNICO_HAS_LABORATORIO_SQL = "UPDATE responsavel_tecnico_has_laboratorio SET responsavel_tecnico_id = ?,laboratorio_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM responsavel_tecnico_has_laboratorio;";

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

    public void insertResponsavel_tecnico_has_laboratorio(Responsavel_tecnico_has_laboratorio entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_RESPONSAVEL_TECNICO_HAS_LABORATORIO_SQL)) {
            preparedStatement.setInt(1, entidade.getResponsavel_tecnico_id());
            preparedStatement.setInt(2, entidade.getLaboratorio_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Responsavel_tecnico_has_laboratorio selectResponsavel_tecnico_has_laboratorio(int id) {
        Responsavel_tecnico_has_laboratorio entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_RESPONSAVEL_TECNICO_HAS_LABORATORIO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer responsavel_tecnico_id = rs.getInt("responsavel_tecnico_id");
                Integer laboratorio_id = rs.getInt("laboratorio_id");
                entidade = new Responsavel_tecnico_has_laboratorio(id,responsavel_tecnico_id,laboratorio_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Responsavel_tecnico_has_laboratorio> selectAllResponsavel_tecnico_has_laboratorio() {
        List<Responsavel_tecnico_has_laboratorio> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_RESPONSAVEL_TECNICO_HAS_LABORATORIO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                Integer responsavel_tecnico_id = rs.getInt("responsavel_tecnico_id");
                Integer laboratorio_id = rs.getInt("laboratorio_id");
                entidades.add(new Responsavel_tecnico_has_laboratorio(id,responsavel_tecnico_id,laboratorio_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteResponsavel_tecnico_has_laboratorio(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_RESPONSAVEL_TECNICO_HAS_LABORATORIO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateResponsavel_tecnico_has_laboratorio(Responsavel_tecnico_has_laboratorio entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_RESPONSAVEL_TECNICO_HAS_LABORATORIO_SQL)) {
            statement.setInt(1, entidade.getResponsavel_tecnico_id());
            statement.setInt(2, entidade.getLaboratorio_id());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
