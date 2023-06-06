import Entidades.Reservas;
import Excecoes.ExcecoesDominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, ExcecoesDominio {


        System.out.println("Gostaria de efetuar uma reserva sim/nao");
        Scanner lerTeclado = new Scanner(System.in);
        String resposta = lerTeclado.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Escolha o numero do apartamento");
            int numeroApartamento = lerTeclado.nextInt();

            System.out.println("Qual a data de entrada");
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/mm/yyy");
            Date novaEntrada = formatoData.parse(lerTeclado.next());

            System.out.println("Qual a data de saida");
            Date novaSaida = formatoData.parse(lerTeclado.next());
            try {
                Reservas novaReserva = new Reservas(numeroApartamento, novaEntrada, novaSaida);
                System.out.println(novaReserva);

            }catch (ExcecoesDominio e){
                System.out.println(e.getMessage());
            }



        }
    }
}