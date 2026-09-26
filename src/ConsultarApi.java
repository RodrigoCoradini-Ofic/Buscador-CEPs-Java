// Importando Bibliotecas
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {
    protected HttpResponse response;

    // Constantes
    private static final String url = "https://viacep.com.br/ws/";
    private static final String tipoResposta = "/json/";

    // Metodo para consultar a API
    public void consultarApi(String cep) throws IOException, InterruptedException {
        // Cria um Cliente HTTP para conversar com Servidores
        HttpClient client = HttpClient.newHttpClient();
        // Cria uma Requisição HTTP para um determinado Servidor
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url + cep + tipoResposta))
                .build();
        // Envia a Requisição para o Servidor
        this.response = client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    // GETTERs
    public HttpResponse getResponse() {
        return response;
    }
}
