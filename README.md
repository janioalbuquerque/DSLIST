# Sobre o projeto

DSList é uma aplicação Back-end construída durante o Intensivão Java Spring, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior"), entre os dias 10/07/2023 a 14/07/2023.

A aplicação é uma pesquisa de jogos que permite aos usuários encontrar informações sobre diferentes jogos.
Os usuários podem realizar pesquisas com base no gênero e na classificação dos jogos. A aplicação também possui um endpoint especial que permite a ordenação personalizada da lista de jogos.

## Modelo conceitual

![App Screenshot](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## End Points
- `GET games`: Busca a lista de jogos
- `GET games by id`: Busca um jogo por meio de ID
- `GET games lists`: Busca a categoria das listas de jogos
- `GET games by lists`: Busca uma lista por meio de seu ID mostrando quais jogos estão dentro desta categoria
- `POST list replacement`: Organiza a lista como o usuário preferir

## Retorno da API
#### Game
![App Screenshot](https://raw.githubusercontent.com/janioalbuquerque/dslist/master/src/assets/retorno_api%20end_point_games.png)

#### Game By Id
![App Screenshot](https://raw.githubusercontent.com/janioalbuquerque/dslist/master/src/assets/retorno_api%20end_point_game_by_id.png)

#### Game Lists
![App Screenshot](https://raw.githubusercontent.com/janioalbuquerque/dslist/master/src/assets/retorno_api%20end_point_game_list.png)

#### Game By Lists
![App Screenshot](https://raw.githubusercontent.com/janioalbuquerque/dslist/master/src/assets/retorno_api%20end_point_game_by_list.png)

# Tecnologias utilizadas

## Back end
- Java
- Spring Boot
- H2 Console
- JPA / Hibernate
- Maven

## Implantação em produção
- Banco de dados: Postgresql

# Como executar o projeto

Pré-requisitos: Java 17


```bash
# clonar repositório
git clone https://github.com/janioalbuquerque/dslist

# entrar na pasta do projeto back end
cd dslist

# executar o projeto
./mvnw spring-boot:run
```


# Autor

Janio Albuquerque
