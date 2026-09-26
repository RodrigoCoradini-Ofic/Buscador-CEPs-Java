// Importando Bibliotecas
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    protected Scanner scanner;
    protected ConsultarApi consultarApi;
    protected String resposta;
    protected Gson gson;
    protected ArrayList<CEP> listaCEP;
    protected SalvarArquivosJson salvarArquivosJson;
    protected Tratamentos tratamentos;

    // Constantes
    private static final String PALAVRA_CHAVE_FINALIZACAO = "sair";

    // Construtor
    public Menu() {
        this.scanner = new Scanner(System.in);
        this.consultarApi = new ConsultarApi();
        this.resposta = "";
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.listaCEP = new ArrayList<>();
        this.salvarArquivosJson = new SalvarArquivosJson();
        this.tratamentos = new Tratamentos();
    }

    // Metodo para criar o Loop do Menu
    public void criarMenu() throws IOException, InterruptedException {
        // Cria o Loop
        while(!resposta.equalsIgnoreCase(PALAVRA_CHAVE_FINALIZACAO)){
            System.out.println("Digite o CEP: (Digite 'SAIR' para Sair) ");
            this.resposta = this.scanner.nextLine();

            // Saindo do Loop
            if(resposta.equalsIgnoreCase(PALAVRA_CHAVE_FINALIZACAO)){
                continue;}

            // Fazer um tratamento na Resposta do Usuário
            this.resposta = tratamentos.tratarEntradas(resposta);
            if (resposta.equalsIgnoreCase("Erro: CEP pesquisado não é Válido")){
                System.out.println(resposta);
                continue;
            }

            // Conectar a API usando a Resposta
            consultarApi.consultarApi(resposta);
            System.out.println("CEP consultado Corretamente!");
            System.out.println(consultarApi.getResponse().body());

            // Transformar o Json num Objeto Java
            CEP cep = gson.fromJson(consultarApi.getResponse().body().toString(), CEP.class);

            // Adicionar a Lista Historico de CEPs pesquisados
            this.listaCEP.add(cep);
        }
        // Salvar o Json
        salvarArquivosJson.salvarArquivo(this.listaCEP, this.gson);
    }
}
