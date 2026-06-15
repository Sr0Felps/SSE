# Monitor de Sensores - SSE (Server-Sent Events)

Aplicação desenvolvida como parte da disciplina **ADS1242 - Mensageria e Streams em Aplicações** da **PUC Goiás**. O projeto implementa comunicação em tempo real entre servidor e cliente utilizando o protocolo **Server-Sent Events (SSE)** com Spring Boot.

## 🚀 Funcionalidades

- Comunicação em Tempo Real: O servidor envia atualizações de temperatura automaticamente via uma conexão HTTP persistente.
- Simulação de Sensores: O sistema simula leituras de três sensores (Sala, Server e Externo) a cada 2 segundos.
- Front-end Responsivo: Interface web moderna utilizando Bootstrap para visualização dinâmica dos dados.
- Reconexão Automática: O protocolo SSE gerencia a reconexão automática em caso de falhas.

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot (Spring Web)
- SSE (Server-Sent Events)
- Bootstrap 5 (via CDN)
- Maven

## 📋 Pré-requisitos

Certifique-se de ter instalado em sua máquina:

- Java JDK 17 ou superior
- Maven

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/Sr0Felps/SSE.git
```

2. Navegue até a pasta do projeto:

```bash
cd sse
```

3. Execute a aplicação utilizando o Maven Wrapper:

```bash
./mvnw spring-boot:run
```

4. Acesse a aplicação no navegador:

```text
http://localhost:8080/index.html
```

## 🔗 Endpoint

### GET /sensores/stream

Endpoint que estabelece a conexão SSE e transmite os eventos em formato `text/event-stream`.

## 🎓 Disciplina

**Curso:** Análise e Desenvolvimento de Sistemas (ADS) – PUC Goiás

**Disciplina:** Mensageria e Streams em Aplicações

**Professor:** Rafael Leal Martins
