package Teste;

import Servicos.*;
import model.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teste {
    
    public static void main(String[] args) {
        //Teste de inserts
        Laboratorio laboratorio = new Laboratorio(null, "laboratorio", "123456789", "123456789", "123456789", "Ana Lima");
        new ServicoLaboratorio().insertLaboratorio(laboratorio);

        Contato contato = new Contato(null, "988380012", 1);
        new ServicoContato().insertContato(contato);

        Endereco endereco = new Endereco(null, "Paulo Afonso", "41", "Baixos", "Jereissati II", "61920690", "Maracanaú", 1);
        new ServicoEndereco().insertEndereco(endereco);

        SiglaFormacao siglaFormacao = new SiglaFormacao(null, "Dr(a)");
        new ServicoSiglaFormacao().insertSigla_formacao(siglaFormacao);

        ResponsavelTecnico responsavelTecnico = new ResponsavelTecnico(null, "Maria do Socorro", "CME", "Pediatra", 1);
        new ServicoResponsavelTecnico().insertResponsavel_tecnico(responsavelTecnico);

        Paciente paciente = new Paciente(null, "Enzo de Oliveira", new Date(1404788400));
        new ServicoPaciente().insertPaciente(paciente);

        Medico medico = new Medico(null, "123456789", "Alexandre de Morais");
        new ServicoMedico().insertMedico(medico);

        Especialidade especialidade = new Especialidade(null, "Infectologia", "Doutor");
        new ServicoEspecialidade().insertEspecialidade(especialidade);

        MedicoHasEspecialidade medicoHasEspecialidade = new MedicoHasEspecialidade(null, 1, 1);
        new ServicoMedicoHasEspecialidade().insertMedico_has_especialidade(medicoHasEspecialidade);

        ResponsavelTecnicoHasLaboratorio responsavelTecnicoHasLaboratorio = new ResponsavelTecnicoHasLaboratorio(null, 1, 1);
        new ServicoResponsavelTecnicoHasLaboratorio().insertResponsavel_tecnico_has_laboratorio(responsavelTecnicoHasLaboratorio);

        ConsultaMedica consultaMedica = new ConsultaMedica(null, new Date(), 1, 1, "5056");
        new ServicoConsultaMedica().insertConsulta_medica(consultaMedica);

        TipoExame tipoExame = new TipoExame(null, "Exame Avaliativo", "Rotina");
        new ServicoTipoExame().insertTipo_exame(tipoExame);

        HabilitacaoExame habilitacaoExame = new HabilitacaoExame(null, "Pendente", 130.00, 1, 1);
        new ServicoHabilitacaoExame().insertHabilitacao_exame(habilitacaoExame);

        MaterialExame materialExame = new MaterialExame(null, "Estetoscópio", "Usado");
        new ServicoMaterialExame().insertMaterial_exame(materialExame);

        Exame exame = new Exame(null, 1, 1, "Exame", "Padrão");
        new ServicoExame().insertExame(exame);

        SolicitacaoExame solicitacaoExame = new SolicitacaoExame(null, "1234", new Date(), 1, 1);
        new ServicoSolicitacaoExame().insertSolicitacao_exame(solicitacaoExame);

        UnidadeMedida unidadeMedida = new UnidadeMedida(null, "mg");
        new ServicoUnidadeMedida().insertUnidade_medida(unidadeMedida);

        ComposicaoExame composicaoExame = new ComposicaoExame(null, "Composto", 1);
        new ServicoComposicaoExame().insertComposicao_exame(composicaoExame);

        ValorReferenciaComposicaoExame valorReferenciaComposicaoExame = new ValorReferenciaComposicaoExame(null, "0", "40", "10",  "50", 1);
        new ServicoValorReferenciaComposicaoExame().insertValor_referencia_composicao_exame(valorReferenciaComposicaoExame);

        Composicao composicao = new Composicao(null, 1, 1, 1);
        new ServicoComposicao().insertComposicao(composicao);

        Laudo laudo = new Laudo(null, "123456789", new Date(), "123456789", 1);
        new ServicoLaudo().insertLaudo(laudo);

        ResultadoExame resultadoExame = new ResultadoExame(null, new Date(), "130.00", 1 , 1);
        new ServicoResultadoExame().insertResultado_exame(resultadoExame);

        //Teste toString
        ArrayList<String> toStrings = new ArrayList<String>();
        toStrings.add(new ServicoLaboratorio().selectLaboratorio(1).toString());

        toStrings.add(new ServicoContato().selectContato(1).toString());

        toStrings.add(new ServicoEndereco().selectEndereco(1).toString());

        toStrings.add(new ServicoSiglaFormacao().selectSigla_formacao(1).toString());

        toStrings.add(new ServicoResponsavelTecnico().selectResponsavel_tecnico(1).toString());

        toStrings.add(new ServicoPaciente().selectPaciente(1).toString());

        toStrings.add(new ServicoMedico().selectMedico(1).toString());

        toStrings.add(new ServicoEspecialidade().selectEspecialidade(1).toString());

        toStrings.add(new ServicoMedicoHasEspecialidade().selectMedico_has_especialidade(1).toString());

        toStrings.add(new ServicoResponsavelTecnicoHasLaboratorio().selectResponsavel_tecnico_has_laboratorio(1).toString());

        toStrings.add(new ServicoConsultaMedica().selectConsulta_medica(1).toString());

        toStrings.add(new ServicoTipoExame().selectTipo_exame(1).toString());

        toStrings.add(new ServicoHabilitacaoExame().selectHabilitacao_exame(1).toString());

        toStrings.add(new ServicoMaterialExame().selectMaterial_exame(1).toString());

        toStrings.add(new ServicoExame().selectExame(1).toString());

        toStrings.add(new ServicoSolicitacaoExame().selectSolicitacao_exame(1).toString());

        toStrings.add(new ServicoUnidadeMedida().selectUnidade_medida(1).toString());

        toStrings.add(new ServicoComposicaoExame().selectComposicao_exame(1).toString());

        toStrings.add(new ServicoValorReferenciaComposicaoExame().selectValor_referencia_composicao_exame(1).toString());

        toStrings.add(new ServicoComposicao().selectComposicao(1).toString());

        toStrings.add(new ServicoLaudo().selectLaudo(1).toString());

        toStrings.add(new ServicoResultadoExame().selectResultado_exame(1).toString());
        for(String a:toStrings){
            System.out.println(a);
        }

        //Teste Delete
        try {
            new ServicoLaboratorio().deleteLaboratorio(1);
            new ServicoContato().deleteContato(1);
            new ServicoEndereco().deleteEndereco(1);
            new ServicoSiglaFormacao().deleteSigla_formacao(1);
            new ServicoResponsavelTecnico().deleteResponsavel_tecnico(1);
            new ServicoPaciente().deletePaciente(1);
            new ServicoMedico().deleteMedico(1);
            new ServicoEspecialidade().deleteEspecialidade(1);
            new ServicoMedicoHasEspecialidade().deleteMedico_has_especialidade(1);
            new ServicoResponsavelTecnicoHasLaboratorio().deleteResponsavel_tecnico_has_laboratorio(1);
            new ServicoConsultaMedica().deleteConsulta_medica(1);
            new ServicoTipoExame().deleteTipo_exame(1);
            new ServicoHabilitacaoExame().deleteHabilitacao_exame(1);
            new ServicoMaterialExame().deleteMaterial_exame(1);
            new ServicoExame().deleteExame(1);
            new ServicoSolicitacaoExame().deleteSolicitacao_exame(1);
            new ServicoUnidadeMedida().deleteUnidade_medida(1);
            new ServicoComposicaoExame().deleteComposicao_exame(1);
            new ServicoValorReferenciaComposicaoExame().deleteValor_referencia_composicao_exame(1);
            new ServicoComposicao().deleteComposicao(1);
            new ServicoLaudo().deleteLaudo(1);
            new ServicoResultadoExame().deleteResultado_exame(1);
        }catch (Exception e){

        }
    }

//    private static void getServicos(Object classe) {
//        String tabela = classe.getClass().getSimpleName().replace("DAO", "");
//        String tabelaDAO = classe.getClass().getSimpleName();
//        File myObj = new File("C:\\Users\\reris\\IdeaProjects\\Bd_Exame\\src\\Servicos\\Servico"+ tabela + ".java");
//        try {
//            FileWriter myWriter = new FileWriter("C:\\Users\\reris\\IdeaProjects\\Bd_Exame\\src\\Servicos\\Servico"+ tabela +".java");
//            myWriter.write(
//                    "package Servicos;\n" +
//                            "\n" +
//                            "import DAO."+ tabelaDAO +";\n" +
//                            "import model."+ tabela +";\n" +
//                            "\n" +
//                            "import java.sql.SQLException;\n" +
//                            "import java.util.List;\n" +
//                            "\n" +
//                            "public class Servico"+ tabela +" extends "+ tabelaDAO +" {\n" +
//                            "\n" +
//                            "    @Override\n" +
//                            "    public void insert"+ tabela +"("+ tabela +" entidade) {\n" +
//                            "        super.insert"+ tabela +"(entidade);\n" +
//                            "    }\n" +
//                            "\n" +
//                            "    @Override\n" +
//                            "    public "+ tabela +" select"+ tabela +"(int id) {\n" +
//                            "        return super.select"+ tabela +"(id);\n" +
//                            "    }\n" +
//                            "\n" +
//                            "    @Override\n" +
//                            "    public List<"+ tabela +"> selectAll"+ tabela +"() {\n" +
//                            "        return super.selectAll"+ tabela +"();\n" +
//                            "    }\n" +
//                            "\n" +
//                            "    @Override\n" +
//                            "    public boolean delete"+ tabela +"(int id) throws SQLException {\n" +
//                            "        return super.delete"+ tabela +"(id);\n" +
//                            "    }\n" +
//                            "\n" +
//                            "    @Override\n" +
//                            "    public boolean update"+ tabela +"("+ tabela +" entidade) throws SQLException {\n" +
//                            "        return super.update"+ tabela +"(entidade);\n" +
//                            "    }\n" +
//                            "}");
//            myWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private static void getQuerys(Object classe) {
//        String tabela = classe.getClass().getSimpleName();
//        String atributos = getAtributos(classe);
//        String atributosrecebe = getAtributosRecebe(classe);
//        String interogacoes = getInterogacoes(classe);
//        System.out.println("private static final String INSERT_"+tabela.toUpperCase()+"_SQL = \"INSERT INTO "+tabela.toLowerCase()+" ("+atributos+") VALUES ("+interogacoes+");\";\n" +
//                        "private static final String SELECT_"+tabela.toUpperCase()+"_BY_ID = \"SELECT id, * FROM "+tabela.toLowerCase()+" WHERE id = ?\";\n" +
//                        "private static final String SELECT_ALL_"+tabela.toUpperCase()+" = \"SELECT * FROM "+tabela.toLowerCase()+";\";\n" +
//                        "private static final String DELETE_"+tabela.toUpperCase()+"_SQL = \"DELETE FROM "+tabela.toLowerCase()+" WHERE id = ?;\";\n" +
//                        "private static final String UPDATE_"+tabela.toUpperCase()+"_SQL = \"UPDATE "+tabela.toLowerCase()+" SET "+atributosrecebe+" WHERE id = ?;\";\n" +
//                        "private static final String TOTAL = \"SELECT count(1) FROM "+tabela.toLowerCase()+";\";");
//    }
//
//    static String getAtributos(Object classe){
//        String atributos="";
//        Field[] fields= classe.getClass().getDeclaredFields();
//        for (Field x:fields){
//            atributos+=x.getName()+",";
//        }
//        atributos = RemoveLast(atributos);
//        return atributos;
//    }
//
//    static String getAtributosRecebe(Object classe){
//        String atributos="";
//        Field[] fields= classe.getClass().getDeclaredFields();
//        for (Field x:fields){
//            atributos+=x.getName()+" = ?,";
//        }
//        atributos = RemoveLast(atributos);
//        return atributos;
//    }
//    static String getInterogacoes(Object classe){
//        String atributos="";
//        Field[] fields= classe.getClass().getDeclaredFields();
//        for (Field x:fields){
//            atributos+="?,";
//        }
//        atributos = RemoveLast(atributos);
//        return atributos;
//    }
//
//    static String RemoveLast(String str) {
//        str = str.substring(0, str.length() - 1);
//        return str;
//    }
}
