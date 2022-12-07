package DAO;

import model.MaterialExame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MaterialExameDAO extends ConexaoDB{
    private static final String INSERT_MATERIAL_EXAME_SQL = "INSERT INTO material_exame (material,observacao) VALUES (?,?);";
    private static final String SELECT_MATERIAL_EXAME_BY_ID = "SELECT id, * FROM material_exame WHERE id = ?";
    private static final String SELECT_ALL_MATERIAL_EXAME = "SELECT * FROM material_exame;";
    private static final String DELETE_MATERIAL_EXAME_SQL = "DELETE FROM material_exame WHERE id = ?;";
    private static final String UPDATE_MATERIAL_EXAME_SQL = "UPDATE material_exame SET material = ?,observacao = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM material_exame;";

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

    public void insertMaterial_exame(MaterialExame entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_MATERIAL_EXAME_SQL)) {
            preparedStatement.setString(1, entidade.getMaterial());
            preparedStatement.setString(2, entidade.getObservacao());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public MaterialExame selectMaterial_exame(int id) {
        MaterialExame entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_MATERIAL_EXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String material = rs.getString("material");
                String observacao = rs.getString("observacao");
                entidade = new MaterialExame(id,material,observacao);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<MaterialExame> selectAllMaterial_exame() {
        List<MaterialExame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_MATERIAL_EXAME)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String material = rs.getString("material");
                String observacao = rs.getString("observacao");
                entidades.add(new MaterialExame(id,material,observacao));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteMaterial_exame(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_MATERIAL_EXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateMaterial_exame(MaterialExame entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_MATERIAL_EXAME_SQL)) {
            statement.setString(1, entidade.getMaterial());
            statement.setString(2, entidade.getObservacao());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}