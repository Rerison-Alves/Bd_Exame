package Teste;

import model.*;

import java.lang.reflect.Field;

public class Teste {
    
    public static void main(String[] args) {
        Valor_referencia_composicao_exame classe = new Valor_referencia_composicao_exame();
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
