public class Tratamentos {

    public String tratarEntradas(String entrada){
        // Tratando a String
        entrada = entrada.replace(" ", "");
        entrada = entrada.replace(".", "");
        entrada = entrada.replace("-", "");
        try {
            int numeros = Integer.parseInt(entrada);
            String resultado = "" + numeros;

            if (resultado.length() != 8){
                return "Erro: CEP pesquisado não é Válido";
            }else {
                return resultado;
            }
        } catch (NumberFormatException e) {
            if (entrada.length() != 8) {
                return "Erro: CEP pesquisado não é Válido";
            } else {
                return entrada;
            }
        }
    }
}
