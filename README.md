# 🔎 Buscador de CEPs em Java

Aplicação de console desenvolvida em **Java** para consultar informações de endereços a partir de um CEP utilizando a **API ViaCEP**.

O projeto recebe o CEP digitado pelo usuário, realiza o tratamento da entrada, consulta a API, transforma a resposta JSON em um objeto Java utilizando **Gson** e mantém um histórico das consultas realizadas em um arquivo JSON.

## 📌 Funcionalidades

- 🔎 Consulta de CEP pela API ViaCEP
- ✅ Validação e tratamento do CEP informado
- 🌐 Comunicação com uma API REST utilizando `HttpClient`
- 📦 Conversão de JSON para objetos Java com Gson
- 📝 Exibição dos dados do endereço no console
- 💾 Salvamento do histórico de CEPs consultados em `Historico_Ceps.json`
- 🚪 Comando `SAIR` para encerrar o programa

## 🛠️ Tecnologias utilizadas

- **Java**
- **Gson**
- **API ViaCEP**
- **HTTP Client (`java.net.http`)**
- **JSON**

## 📂 Estrutura do projeto

```text
src/
├── Main.java
├── Menu.java
├── ConsultarApi.java
├── CEP.java
├── Tratamentos.java
└── SalvarArquivosJson.java

Historico_Ceps.json
pom.xml
README.md
```

### Principais classes

| Classe | Responsabilidade |
|---|---|
| `Main` | Ponto de entrada da aplicação |
| `Menu` | Controla a interação com o usuário e o fluxo principal |
| `ConsultarApi` | Realiza a consulta na API ViaCEP |
| `CEP` | Representa os dados retornados pela API |
| `Tratamentos` | Remove caracteres desnecessários e valida o CEP |
| `SalvarArquivosJson` | Salva o histórico de consultas em JSON |

## ⚙️ Como funciona

O programa inicia criando o menu principal:

```text
Digite o CEP: (Digite 'SAIR' para Sair)
```

O usuário pode informar um CEP com ou sem formatação, por exemplo:

```text
89117-390
```

O programa remove espaços, pontos e hífens antes de validar a entrada. fileciteturn0file0L3-L13

Depois da validação, o CEP é enviado para a API ViaCEP utilizando uma requisição HTTP:

```text
https://viacep.com.br/ws/{CEP}/json/
```

A aplicação utiliza `HttpClient`, `HttpRequest` e `HttpResponse` para realizar essa comunicação. fileciteturn0file4L15-L24

A resposta JSON é então convertida para um objeto `CEP` utilizando Gson. fileciteturn0file1L49-L58

Por fim, os CEPs consultados são armazenados em uma lista e, quando o programa é encerrado, o histórico é salvo em:

```text
Historico_Ceps.json
```

fileciteturn0file2L9-L16

## ▶️ Como executar

### Pré-requisitos

- Java **11 ou superior**
- Maven
- Conexão com a internet

O projeto utiliza recursos do pacote `java.net.http`, introduzidos no Java 11.

### 1. Clone o repositório

```bash
git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
```

### 2. Entre na pasta do projeto

```bash
cd NOME_DO_PROJETO
```

### 3. Compile o projeto com Maven

```bash
mvn compile
```

### 4. Execute

```bash
mvn exec:java
```

Ou execute a classe `Main` diretamente pela sua IDE.

## 💻 Exemplo de utilização

```text
Digite o CEP: (Digite 'SAIR' para Sair)
89117-390

CEP consultado Corretamente!

{
  "cep": "89117-390",
  "logradouro": "Rua Andre Schmitt",
  ...
}

Digite o CEP: (Digite 'SAIR' para Sair)
```

Para encerrar:

```text
SAIR
```

## 💾 Histórico

As consultas realizadas durante a execução são armazenadas em uma lista de objetos `CEP`. Ao sair do programa, essa lista é convertida para JSON e salva no arquivo `Historico_Ceps.json`. fileciteturn0file1L57-L60 fileciteturn0file2L9-L16

## 📚 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos importantes de Java, incluindo:

- Programação Orientada a Objetos
- Classes e objetos
- Encapsulamento
- Listas (`ArrayList`)
- Tratamento de exceções
- Requisições HTTP
- Consumo de APIs REST
- Manipulação de JSON
- Uso de bibliotecas externas
- Persistência simples de dados em arquivo

## 👨‍💻 Autor

**Rodrigo Coradini**

Projeto desenvolvido para estudos e prática de desenvolvimento em Java.
