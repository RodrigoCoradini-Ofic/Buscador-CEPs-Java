// ImportandoBibliotecas
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SalvarArquivosJson {

    // Metodo para Salvar arquivo em Json
    public void salvarArquivo(ArrayList<CEP> lista, Gson gson) throws IOException {
        if (lista.isEmpty()){
            System.out.println("Não foi Possível Criar o Arquivo do Histórico: motivo não existe Histórico");
        }else {
            FileWriter fileWriter = new FileWriter("Historico_Ceps.json");
            fileWriter.write(gson.toJson(lista));
            fileWriter.close();
            System.out.println("Salvando o Arquivo...");
        }
    }
}
