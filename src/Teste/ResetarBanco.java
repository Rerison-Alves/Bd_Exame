package Teste;

import java.sql.PreparedStatement;

import static DAO.ConexaoDB.prepararSQL;

public class ResetarBanco {
    public static void main(String[] args) {
        Reset();
    }

    public static void Reset() {
        String[] tabelas = {"resultado_exame", "laudo", "composicao", "valor_referencia_composicao_exame", "composicao_exame", "unidade_medida", "solicitacao_exame", "exame", "material_exame", "habilitacao_exame", "tipo_exame", "consulta_medica", "responsavel_tecnico_has_laboratorio", "medico_has_especialidade", "especialidade", "medico", "paciente", "responsavel_tecnico", "sigla_formacao", "endereco", "contato", "laboratorio"};
        for (String tabela : tabelas) {
            String delete = "DELETE FROM " + tabela + ";";
            String resetseq = "";
            if (!(tabela.equals("medico_has_especialidade") || tabela.equals("responsavel_tecnico_has_laboratorio")) ){
                resetseq = "ALTER SEQUENCE " + tabela + "_id_seq RESTART;";
            }

            try (PreparedStatement statement = prepararSQL(delete)) {
                statement.executeUpdate();
                statement.getConnection().close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try (PreparedStatement statement = prepararSQL(resetseq)) {
                statement.executeUpdate();
                statement.getConnection().close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
