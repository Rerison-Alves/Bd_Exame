package DAO;

import model.Solicitacao_exame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solicitacao_exameDAO extends ConexaoDB{
    private static final String INSERT_SOLICITACAO_EXAME_SQL = "INSERT INTO solicitacao_exame (nm_prescrito,dt_solicitacao,consulta_medica_id,habilitacao_exame_id) VALUES (?,?,?,?);";
    private static final String SELECT_SOLICITACAO_EXAME_BY_ID = "SELECT id, * FROM solicitacao_exame WHERE id = ?";
    private static final String SELECT_ALL_SOLICITACAO_EXAME = "SELECT * FROM solicitacao_exame;";
    private static final String DELETE_SOLICITACAO_EXAME_SQL = "DELETE FROM solicitacao_exame WHERE id = ?;";
    private static final String UPDATE_SOLICITACAO_EXAME_SQL = "UPDATE solicitacao_exame SET nm_prescrito = ?,dt_solicitacao = ?,consulta_medica_id = ?,habilitacao_exame_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM solicitacao_exame;";

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

    public void insertSolicitacao_exame(Solicitacao_exame entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_SOLICITACAO_EXAME_SQL)) {
            preparedStatement.setString(1, entidade.getNm_prescrito());
            preparedStatement.setDate(2, new java.sql.Date(entidade.getDt_solicitacao().getTime()));
            preparedStatement.setInt(3, entidade.getConsulta_medica_id());
            preparedStatement.setInt(4, entidade.getHabilitacao_exame_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Solicitacao_exame selectSolicitacao_exame(int id) {
        Solicitacao_exame entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_SOLICITACAO_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nm_prescrito = rs.getString("nm_prescrito");
                java.util.Date dt_solicitacao = new java.util.Date(rs.getDate("dt_solicitacao").getTime());
                Integer consulta_medica_id = rs.getInt("consulta_medica_id");
                Integer habilitacao_exame_id = rs.getInt("habilitacao_exame_id");
                entidade = new Solicitacao_exame(id,nm_prescrito,dt_solicitacao,consulta_medica_id,habilitacao_exame_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Solicitacao_exame> selectAllSolicitacao_exame() {
        List<Solicitacao_exame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_SOLICITACAO_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nm_prescrito = rs.getString("nm_prescrito");
                java.util.Date dt_solicitacao = new java.util.Date(rs.getDate("dt_solicitacao").getTime());
                Integer consulta_medica_id = rs.getInt("consulta_medica_id");
                Integer habilitacao_exame_id = rs.getInt("habilitacao_exame_id");
                entidades.add(new Solicitacao_exame(id,nm_prescrito,dt_solicitacao,consulta_medica_id,habilitacao_exame_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteSolicitacao_exame(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_SOLICITACAO_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateSolicitacao_exame(Solicitacao_exame entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_SOLICITACAO_EXAME_SQL)) {
            statement.setString(1, entidade.getNm_prescrito());
            statement.setDate(2, new java.sql.Date(entidade.getDt_solicitacao().getTime()));
            statement.setInt(3, entidade.getConsulta_medica_id());
            statement.setInt(4, entidade.getHabilitacao_exame_id());
            statement.setInt(5, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
