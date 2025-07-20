import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        String mensagemValor = "Digite o valor que deseja converter:";
        double valor = 0;

        System.out.println("**************************************************\n");
        System.out.println("""
                            Seja bem-vindo(a) ao conversor de moedas.
                            Escolha a opção desejada:
                            
                            1 - Real brasileiro -> Dólar
                            2 - Dólar -> Real Brasileiro
                            3 - Real brasileiro -> Euro
                            4 - Euro -> Real brasileiro
                            5 - Dólar -> Euro
                            6 - Euro -> Dólar
                            7 - Sair
                            
                            **************************************************
                            """);

        while (opcao != 7) {
            opcao = leitura.nextInt();

            if(opcao == 1) {
                System.out.println(mensagemValor);

            } else if (opcao == 2) {
                System.out.println(mensagemValor);

            } else if (opcao == 3) {
                System.out.println(mensagemValor);

            } else if (opcao == 4) {
                System.out.println(mensagemValor);

            } else if (opcao == 5) {
                System.out.println(mensagemValor);

            } else if (opcao == 6) {
                System.out.println(mensagemValor);

            }
        }






    }
}
