import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConversorMoedas conversorMoedas = new ConversorMoedas();
        Scanner leitura = new Scanner(System.in);
        String from = "";
        String to = "";

        int opcao = 0;

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
                                
                                """);

        while (opcao != 7) {
            opcao = leitura.nextInt();

            switch (opcao) {

                case 1 -> {
                    from = "BRL";
                    to = "USD";
                }
                case 2 -> {
                    from = "USD";
                    to = "BRL";
                }
                case 3 -> {
                    from = "BRL";
                    to = "EUR";
                }
                case 4 -> {
                    from = "EUR";
                    to = "BRL";
                }
                case 5 -> {
                    from = "USD";
                    to = "EUR";
                }
                case 6 -> {
                    from = "EUR";
                    to = "USD";
                }
                case 7 -> {
                    System.out.println("Saindo do programa...");
                    break;
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
                }
            }

            if(opcao >= 1 && opcao <= 6){
                System.out.print("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();
                conversorMoedas.converteMoeda(from, to, valor);
            }
        }



    }
}
