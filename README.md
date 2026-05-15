# Projeto: front + java-api

Este repositório contém duas aplicações principais:

- `front-angular`: interface front-end construída com Angular.
- `java-api`: backend RESTful desenvolvido em Java (por exemplo Spring Boot).

## front-angular

Descrição
- Aplicação Angular responsável pela interface do usuário, consumo das APIs e navegação.

Estrutura básica
- `src/` - código fonte Angular
- `angular.json`, `package.json` - configuração e dependências

Como executar
1. Navegue até a pasta: `cd front-angular`
2. Instale as dependências: `npm install`
3. Inicie em modo de desenvolvimento: `npm start` ou `ng serve`
4. Acesse: `http://localhost:4200` (ou porta configurada)

Observações
- Ajuste a URL das APIs no arquivo de ambiente (`src/environments/`) para apontar ao backend (`java-api`).

## java-api

Descrição
- API REST em Java que fornece endpoints para o front-end. Tipicamente implementada com Spring Boot.

Estrutura básica
- `src/main/java` - código fonte Java
- `pom.xml` ou `build.gradle` - definição de dependências e build

Como executar
1. Navegue até a pasta: `cd java-api`
2. Build e execute (Maven): `mvn clean package && mvn spring-boot:run` ou (Gradle): `./gradlew bootRun`
3. A API normalmente fica disponível em: `http://localhost:8080`

Configurações
- Verifique `application.properties` ou `application.yml` para ajustar porta, datasource e credenciais.

## Desenvolvimento e integração

- Primeiro inicie o `java-api` para garantir que os endpoints estejam disponíveis.
- Configure o front (`environment`) para apontar ao endereço do backend.
- Testes podem ser executados separadamente em cada projeto (`npm test`, `mvn test`/`./gradlew test`).

## Contato
- Informe problemas, dúvidas ou instruções adicionais no README principal do repositório ou no sistema de issues.
