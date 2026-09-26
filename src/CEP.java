public class CEP {
    protected String cep;
    protected String logradouro;
    protected String complemento;
    protected String unidade;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String regiao;

    // Construtor da Classe
    public CEP(String cep, String logradouro, String complemento, String unidade,  String bairro, String cidade, String estado, String regiao) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.unidade = unidade;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.regiao = regiao;
    }

    // GETTERs
    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getEstado() {
        return estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getComplemento() {
        return complemento;
    }
}
