# API de Produtos — Spring Boot + PostgreSQL

API REST para cadastro de produtos (CRUD completo), desenvolvida como meu primeiro projeto em **Java com Spring Boot**.

## Tecnologias

- Java 21
- Spring Boot 4.1 (Spring Web MVC, Spring Data JPA)
- PostgreSQL
- Flyway (versionamento do banco de dados)
- Maven

## Endpoints

| Método | Rota | Descrição | Sucesso | Erro |
|---|---|---|---|---|
| GET | `/products` | Lista todos os produtos | 200 | — |
| GET | `/products/{id}` | Busca um produto pelo id | 200 | 404 |
| POST | `/products` | Cadastra um produto | 201 | — |
| PUT | `/products/{id}` | Atualiza um produto | 200 | 404 |
| DELETE | `/products/{id}` | Remove um produto | 204 | 404 |

Exemplo de corpo (POST / PUT):

```json
{
  "name": "Caneca",
  "price": 25
}
```

## Estrutura

```
src/main/java/com/pamela/aula1/
├── Aula1Application.java        # classe principal
├── Controller/ControllerProduct.java   # endpoints REST
├── Model/Product.java           # entidade JPA
└── Repositories/ProductRepository.java # acesso ao banco (JpaRepository)

src/main/resources/
├── application.properties       # configuração
└── db/migration/                # scripts do Flyway
```

## Como executar

### Pré-requisitos

- JDK 21
- PostgreSQL rodando na porta 5432

### 1. Criar o banco

```sql
CREATE DATABASE "product-api";
```

As tabelas são criadas automaticamente pelo Flyway na primeira execução.

### 2. Definir a senha do banco

A senha não fica no código. Ela é lida da variável de ambiente `DB_PASSWORD`.

Windows (PowerShell):

```powershell
[Environment]::SetEnvironmentVariable("DB_PASSWORD", "sua_senha", "User")
```

Feche e abra o terminal depois de definir a variável.

### 3. Rodar a aplicação

```powershell
.\mvnw spring-boot:run
```

A API fica disponível em `http://localhost:8080/products`.

## O que aprendi

- Estrutura de um projeto Spring Boot (controller, model, repository)
- Mapeamento de entidades com JPA/Hibernate
- Injeção de dependência com `@Autowired`
- Verbos HTTP e status codes em uma API REST (`ResponseEntity`)
- Versionamento de banco de dados com Flyway
- Leitura e diagnóstico de erros de compilação e de execução

## Autora

Pamela — [LinkedIn](COLOQUE_AQUI_O_LINK_DO_SEU_LINKEDIN)
