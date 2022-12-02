package DAO;

import model.Composicao_exame;

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

    public void insertMarca(Composicao_exame entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_COMPOSICAO_EXAME_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Composicao_exame selectMarca(int id) {
        Composicao_exame entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_COMPOSICAO_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                Integer unidade_medida_id = rs.getInt("unidade_medida_id");
                entidade = new Composicao_exame(id, descricao,unidade_medida_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Composicao_exame> selectAllMarcas() {
        List<Composicao_exame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_COMPOSICAO_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                Integer unidade_medida_id = rs.getInt("unidade_medida_id");
                entidades.add(new Composicao_exame(id, descricao, unidade_medida_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteMarca(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_COMPOSICAO_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateMarca(Composicao_exame entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_COMPOSICAO_EXAME_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
