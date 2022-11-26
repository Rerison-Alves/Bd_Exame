package model;

public class Sigla_formacao extends GenericModel{
    private String sigla;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Sigla_formacao{" +
                "sigla='" + sigla + '\'' +
                "} " + super.toString();
    }
}
