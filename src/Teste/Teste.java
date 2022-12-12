package Teste;

import Servicos.*;
import model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        //Teste de inserts
        Laboratorio laboratorio = new Laboratorio(null, "laboratorio", "123456789", "123456789", "123456789", "Ana Lima");
        new ServicoLaboratorio().insert(laboratorio);

        Contato contato = new Contato(null, "988380012", 1);
        new ServicoContato().insert(contato);

        Endereco endereco = new Endereco(null, "Paulo Afonso", "41", "Baixos", "Jereissati II", "61920690", "Maracanaú", 1);
        new ServicoEndereco().insert(endereco);

        SiglaFormacao siglaFormacao = new SiglaFormacao(null, "Dr(a)");
        new ServicoSiglaFormacao().insert(siglaFormacao);

        ResponsavelTecnico responsavelTecnico = new ResponsavelTecnico(null, "Maria do Socorro", "CME", "Pediatra", 1);
        new ServicoResponsavelTecnico().insert(responsavelTecnico);

        Paciente paciente = null;
        try {
            paciente = new Paciente(null, "Enzo de Oliveira", new SimpleDateFormat("dd/MM/yyyy").parse("16/07/2014"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        new ServicoPaciente().insert(paciente);

        Especialidade especialidade = new Especialidade(null, "Infectologia", "Doutor");
        new ServicoEspecialidade().insert(especialidade);

        Especialidade especialidade2 = new Especialidade(null, "Pediatria", "Doutor");
        new ServicoEspecialidade().insert(especialidade);

        Medico medico = new Medico(null, "123456789", "Alexandre de Morais");
        medico.setEspecialidades(List.of(especialidade, especialidade2));
        new ServicoMedico().salvar(medico);

        ResponsavelTecnicoHasLaboratorio responsavelTecnicoHasLaboratorio = new ResponsavelTecnicoHasLaboratorio(null, 1, 1);
        new ServicoResponsavelTecnicoHasLaboratorio().insert(responsavelTecnicoHasLaboratorio);

        ConsultaMedica consultaMedica = new ConsultaMedica(null, new Date(), 1, 1, "5056");
        new ServicoConsultaMedica().insert(consultaMedica);

        TipoExame tipoExame = new TipoExame(null, "Exame Avaliativo", "Rotina");
        new ServicoTipoExame().insert(tipoExame);

        HabilitacaoExame habilitacaoExame = new HabilitacaoExame(null, "Pendente", 130.00, 1, 1);
        new ServicoHabilitacaoExame().insert(habilitacaoExame);

        MaterialExame materialExame = new MaterialExame(null, "Estetoscópio", "Usado");
        new ServicoMaterialExame().insert(materialExame);

        Exame exame = new Exame(null, 1, 1, "Exame", "Padrão");
        new ServicoExame().insert(exame);

        SolicitacaoExame solicitacaoExame = new SolicitacaoExame(null, "1234", new Date(), 1, 1, 1);
        new ServicoSolicitacaoExame().insert(solicitacaoExame);

        UnidadeMedida unidadeMedida = new UnidadeMedida(null, "mg");
        new ServicoUnidadeMedida().insert(unidadeMedida);

        ComposicaoExame composicaoExame = new ComposicaoExame(null, "Composto", 1);
        new ServicoComposicaoExame().insert(composicaoExame);

        ValorReferenciaComposicaoExame valorReferenciaComposicaoExame = new ValorReferenciaComposicaoExame(null, "0", "40", "10", "50", 1);
        new ServicoValorReferenciaComposicaoExame().insert(valorReferenciaComposicaoExame);

        Composicao composicao = new Composicao(null, 1, 1, 1);
        new ServicoComposicao().insert(composicao);

        Laudo laudo = new Laudo(null, "123456789", new Date(), "123456789", 1);
        new ServicoLaudo().insert(laudo);

        ResultadoExame resultadoExame = new ResultadoExame(null, new Date(), "130.00", 1, 1);
        new ServicoResultadoExame().insert(resultadoExame);

        //Teste toString
        ArrayList<String> toStrings = new ArrayList<String>();
        toStrings.add(new ServicoLaboratorio().select(1).toString());

        toStrings.add(new ServicoContato().select(1).toString());

        toStrings.add(new ServicoEndereco().select(1).toString());

        toStrings.add(new ServicoSiglaFormacao().select(1).toString());

        toStrings.add(new ServicoResponsavelTecnico().select(1).toString());

        toStrings.add(new ServicoPaciente().select(1).toString());

        toStrings.add(new ServicoMedico().select(1).toString());

        toStrings.add(new ServicoEspecialidade().select(1).toString());

        toStrings.add(new ServicoMedicoHasEspecialidade().select(1).toString());

        toStrings.add(new ServicoResponsavelTecnicoHasLaboratorio().select(1).toString());

        toStrings.add(new ServicoConsultaMedica().select(1).toString());

        toStrings.add(new ServicoTipoExame().select(1).toString());

        toStrings.add(new ServicoHabilitacaoExame().select(1).toString());

        toStrings.add(new ServicoMaterialExame().select(1).toString());

        toStrings.add(new ServicoExame().select(1).toString());

        toStrings.add(new ServicoSolicitacaoExame().select(1).toString());

        toStrings.add(new ServicoUnidadeMedida().select(1).toString());

        toStrings.add(new ServicoComposicaoExame().select(1).toString());

        toStrings.add(new ServicoValorReferenciaComposicaoExame().select(1).toString());

        toStrings.add(new ServicoComposicao().select(1).toString());

        toStrings.add(new ServicoLaudo().select(1).toString());

        toStrings.add(new ServicoResultadoExame().select(1).toString());
        for (String a : toStrings) {
            System.out.println(a);
        }

        ResetarBanco.Reset();
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
