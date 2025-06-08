# 🌡️ Sistema de Alerta de Calor Extremo (HeatAlert API)

Este projeto é uma API REST desenvolvida com Spring Boot que visa ajudar a mitigar os riscos à saúde causados por eventos de calor extremo, permitindo o cadastro, consulta e emissão de alertas baseados na temperatura máxima registrada em diversas cidades.

## 🧩 Funcionalidades

✅ Cadastro de temperaturas por cidade e data

✅ Emissão automática de alertas de calor extremo

✅ Autenticação com JWT

✅ Registro e login de usuários

✅ Filtros, ordenação e paginação nos endpoints

✅ Documentação Swagger da API

✅ Deploy em nuvem com Railway

## 🛠 Tecnologias Utilizadas

* Java 17
* Spring Boot 3.x
* Spring Data JPA
* Spring Security + JWT
* Bean Validation
* Swagger 
* SQL
* Maven
* Railway (Deploy)

## 📄 Documentação Swagger
https://<sua-url>.railway.app/swagger-ui/index.html

## 🛡️ Autenticação com JWT

- 1 - Registro: POST /auth/register

- 2 - Login: POST /auth/login → retorna um token JWT

- 3 - Autenticação: Envie o token no cabeçalho Authorization nas requisições protegidas: Authorization: Bearer <seu-token>

## 🌍 Deploy na Nuvem
https://seu-projeto.up.railway.app

- Substitua seu-projeto pela URL gerada na sua conta Railway.

## 🧪 Como Executar
git clone [link do projeto]
cd [projeto]

## 👨‍💻 Autores
