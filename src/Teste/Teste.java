package Teste;

import DAO.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Set;

public class Teste {
    
    public static void main(String[] args) {
//        Valor_referencia_composicao_exameDAO classe = new Valor_referencia_composicao_exameDAO();
//        getServicos(classe);
    }

    private static void getServicos(Object classe) {
        String tabela = classe.getClass().getSimpleName().replace("DAO", "");
        String tabelaDAO = classe.getClass().getSimpleName();
        File myObj = new File("C:\\Users\\reris\\IdeaProjects\\Bd_Exame\\src\\Servicos\\Servico"+ tabela + ".txt");
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\reris\\IdeaProjects\\Bd_Exame\\src\\Servicos\\Servico"+ tabela +".java");
            myWriter.write(
                    "package Servicos;\n" +
                            "\n" +
                            "import DAO."+ tabelaDAO +";\n" +
                            "import model."+ tabela +";\n" +
                            "\n" +
                            "import java.sql.SQLException;\n" +
                            "import java.util.List;\n" +
                            "\n" +
                            "public class Servico"+ tabela +" extends "+ tabelaDAO +" {\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void insert"+ tabela +"("+ tabela +" entidade) {\n" +
                            "        super.insert"+ tabela +"(entidade);\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public "+ tabela +" select"+ tabela +"(int id) {\n" +
                            "        return super.select"+ tabela +"(id);\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public List<"+ tabela +"> selectAll"+ tabela +"() {\n" +
                            "        return super.selectAll"+ tabela +"();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public boolean delete"+ tabela +"(int id) throws SQLException {\n" +
                            "        return super.delete"+ tabela +"(id);\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public boolean update"+ tabela +"("+ tabela +" entidade) throws SQLException {\n" +
                            "        return super.update"+ tabela +"(entidade);\n" +
                            "    }\n" +
                            "}");
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getQuerys(Object classe) {
        String tabela = classe.getClass().getSimpleName();
        String atributos = getAtributos(classe);
        String atributosrecebe = getAtributosRecebe(classe);
        String interogacoes = getInterogacoes(classe);
        System.out.println("private static final String INSERT_"+tabela.toUpperCase()+"_SQL = \"INSERT INTO "+tabela.toLowerCase()+" ("+atributos+") VALUES ("+interogacoes+");\";\n" +
                        "private static final String SELECT_"+tabela.toUpperCase()+"_BY_ID = \"SELECT id, * FROM "+tabela.toLowerCase()+" WHERE id = ?\";\n" +
                        "private static final String SELECT_ALL_"+tabela.toUpperCase()+" = \"SELECT * FROM "+tabela.toLowerCase()+";\";\n" +
                        "private static final String DELETE_"+tabela.toUpperCase()+"_SQL = \"DELETE FROM "+tabela.toLowerCase()+" WHERE id = ?;\";\n" +
                        "private static final String UPDATE_"+tabela.toUpperCase()+"_SQL = \"UPDATE "+tabela.toLowerCase()+" SET "+atributosrecebe+" WHERE id = ?;\";\n" +
                        "private static final String TOTAL = \"SELECT count(1) FROM "+tabela.toLowerCase()+";\";");
    }

    static String getAtributos(Object classe){
        String atributos="";
        Field[] fields= classe.getClass().getDeclaredFields();
        for (Field x:fields){
            atributos+=x.getName()+",";
        }
        atributos = RemoveLast(atributos);
        return atributos;
    }

    static String getAtributosRecebe(Object classe){
        String atributos="";
        Field[] fields= classe.getClass().getDeclaredFields();
        for (Field x:fields){
            atributos+=x.getName()+" = ?,";
        }
        atributos = RemoveLast(atributos);
        return atributos;
    }
    static String getInterogacoes(Object classe){
        String atributos="";
        Field[] fields= classe.getClass().getDeclaredFields();
        for (Field x:fields){
            atributos+="?,";
        }
        atributos = RemoveLast(atributos);
        return atributos;
    }

    static String RemoveLast(String str) {
        str = str.substring(0, str.length() - 1);
        return str;
    }
}
