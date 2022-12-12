package DAO;

import model.SolicitacaoExame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SolicitacaoExameDAO extends ConexaoDB{
    private static final String INSERT_SOLICITACAO_EXAME_SQL = "INSERT INTO solicitacao_exame (nm_prescrito,dt_solicitacao,consulta_medica_id,habilitacao_exame_id, exame_id) VALUES (?,?,?,?,?);";
    private static final String SELECT_SOLICITACAO_EXAME_BY_ID = "SELECT id, * FROM solicitacao_exame WHERE id = ?";
    private static final String SELECT_ALL_SOLICITACAO_EXAME = "SELECT * FROM solicitacao_exame;";
    private static final String DELETE_SOLICITACAO_EXAME_SQL = "DELETE FROM solicitacao_exame WHERE id = ?;";
    private static final String UPDATE_SOLICITACAO_EXAME_SQL = "UPDATE solicitacao_exame SET nm_prescrito = ?,dt_solicitacao = ?,consulta_medica_id = ?,habilitacao_exame_id = ?,exame_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM solicitacao_exame;";

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

    public void insert(SolicitacaoExame entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_SOLICITACAO_EXAME_SQL)) {
            preparedStatement.setString(1, entidade.getNm_prescrito());
            preparedStatement.setTimestamp(2, new Timestamp(entidade.getDt_solicitacao().getTime()));
            preparedStatement.setInt(3, entidade.getConsulta_medica_id());
            preparedStatement.setInt(4, entidade.getHabilitacao_exame_id());
            preparedStatement.setInt(5, entidade.getExame_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public SolicitacaoExame select(int id) {
        SolicitacaoExame entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_SOLICITACAO_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nm_prescrito = rs.getString("nm_prescrito");
                java.util.Date dt_solicitacao = new java.util.Date(rs.getTimestamp("dt_solicitacao").getTime());
                Integer consulta_medica_id = rs.getInt("consulta_medica_id");
                Integer habilitacao_exame_id = rs.getInt("habilitacao_exame_id");
                Integer exame_id = rs.getInt("exame_id");
                entidade = new SolicitacaoExame(id,nm_prescrito,dt_solicitacao,consulta_medica_id,habilitacao_exame_id, exame_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<SolicitacaoExame> selectAll() {
        List<SolicitacaoExame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_SOLICITACAO_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nm_prescrito = rs.getString("nm_prescrito");
                java.util.Date dt_solicitacao = new java.util.Date(rs.getTimestamp("dt_solicitacao").getTime());
                Integer consulta_medica_id = rs.getInt("consulta_medica_id");
                Integer habilitacao_exame_id = rs.getInt("habilitacao_exame_id");
                Integer exame_id = rs.getInt("exame_id");
                entidades.add(new SolicitacaoExame(id,nm_prescrito,dt_solicitacao,consulta_medica_id,habilitacao_exame_id,exame_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_SOLICITACAO_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(SolicitacaoExame entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_SOLICITACAO_EXAME_SQL)) {
            statement.setString(1, entidade.getNm_prescrito());
            statement.setTimestamp(2, new Timestamp(entidade.getDt_solicitacao().getTime()));
            statement.setInt(3, entidade.getConsulta_medica_id());
            statement.setInt(4, entidade.getHabilitacao_exame_id());
            statement.setInt(5, entidade.getExame_id());
            statement.setInt(6, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
