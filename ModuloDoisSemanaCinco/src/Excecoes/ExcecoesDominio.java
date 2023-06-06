package Excecoes;

import java.util.Date;

public class ExcecoesDominio extends Exception {
    private Date DataSaidaAlterada;
    private Date DataEntradaAlterada;
    private int numeroApartamento;

    public ExcecoesDominio(String mensage) {
        super(mensage);

    }

    public Date getDataSaidaAlterada() {
        Date DataSaidaAlterada = null;
        return DataSaidaAlterada;
    }

    public Date getDataEntradaAlterada() {
        Date DataEntradaAlterada = null;
        return DataEntradaAlterada;
    }

    @Override
    public String toString() {
        return "ExcecoesDominio{"+
                "dataSaidaAlterada"+ DataSaidaAlterada +
                ",dataEntradaAlterada" + DataEntradaAlterada +
                '}';
    }
}

