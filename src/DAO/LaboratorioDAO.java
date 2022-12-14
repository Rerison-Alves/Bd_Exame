package DAO;

import model.Laboratorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LaboratorioDAO extends ConexaoDB{
    private static final String INSERT_LABORATORIO_SQL = "INSERT INTO laboratorio (descricao,CNES,CNPJ,CRBM,nome_fantasia) VALUES (?,?,?,?,?);";
    private static final String SELECT_LABORATORIO_BY_ID = "SELECT id, * FROM laboratorio WHERE id = ?";
    private static final String SELECT_ALL_LABORATORIO = "SELECT * FROM laboratorio;";
    private static final String DELETE_LABORATORIO_SQL = "DELETE FROM laboratorio WHERE id = ?;";
    private static final String UPDATE_LABORATORIO_SQL = "UPDATE laboratorio SET descricao = ?,CNES = ?,CNPJ = ?,CRBM = ?,nome_fantasia = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM laboratorio;";

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

    public Laboratorio insert(Laboratorio entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_LABORATORIO_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setString(2, entidade.getCNES());
            preparedStatement.setString(3, entidade.getCNPJ());
            preparedStatement.setString(4, entidade.getCRBM());
            preparedStatement.setString(5, entidade.getNome_fantasia());
            entidade.setId(preparedStatement.executeUpdate());
            return entidade;
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public Laboratorio select(int id) {
        Laboratorio entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_LABORATORIO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                String CNES = rs.getString("CNES");
                String CNPJ = rs.getString("CNPJ");
                String CRBM = rs.getString("CRBM");
                String nome_fantasia = rs.getString("nome_fantasia");
                entidade = new Laboratorio(id, descricao,CNES,CNPJ,CRBM,nome_fantasia);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Laboratorio> selectAll() {
        List<Laboratorio> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_LABORATORIO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String CNES = rs.getString("CNES");
                String CNPJ = rs.getString("CNPJ");
                String CRBM = rs.getString("CRBM");
                String nome_fantasia = rs.getString("nome_fantasia");
                entidades.add(new Laboratorio(id, descricao,CNES,CNPJ,CRBM,nome_fantasia));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_LABORATORIO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(Laboratorio entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_LABORATORIO_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setString(2, entidade.getCNES());
            statement.setString(3, entidade.getCNPJ());
            statement.setString(4, entidade.getCRBM());
            statement.setString(5, entidade.getNome_fantasia());
            statement.setInt(6, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
