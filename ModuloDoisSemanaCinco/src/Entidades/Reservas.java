package Entidades;

import Excecoes.ExcecoesDominio;

import java.util.Date;

public class Reservas {

    private int numeroApartamento;
    private Date dataEntrada;

    private Date dataSaida;


    public Reservas(int numeroApartamento, Date dataEntrada, Date dataSaida )throws ExcecoesDominio {
        if (dataEntrada.after(dataSaida)) ;
        if (dataEntrada.before(new Date()));
        this.numeroApartamento = numeroApartamento;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;

//
    }

//    public void alterarReserva(Date novaEntrada, Date novaSaida) throws ExcecoesDominio{
//
//        if (novaEntrada.after(novaSaida)) throw new ExcecoesDominio();
//        if (novaEntrada.after((new Date()))) throw new ExcecoesDominio();
//        else{
//            dataEntrada = novaEntrada;
//            dataSaida = novaSaida;
//            System.out.println("Data de entrada: " + dataEntrada +
//                    "\nData saida:" + dataSaida);
//        }
//    }


    @Override
    public String toString() {
        return "Reservas{" + "numeroApartamento=" + numeroApartamento + ",dataEntrada=" + dataEntrada + ",dataSaida=" + dataSaida;
    }
}
