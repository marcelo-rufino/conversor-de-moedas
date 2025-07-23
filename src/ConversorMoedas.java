import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoedas {
    private int valor;

    public void converteMoeda(String from, String to, double valor) throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/49c907000de240b0b7513f0d/pair/" + from + "/" + to + "/" + valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
