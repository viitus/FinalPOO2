# 🎯 Sistema de Gerenciamento de Eventos e Atividades

Este projeto é um sistema desktop em Java, com interface gráfica feita em **Swing**, para gerenciamento completo de **eventos**, **atividades**, **locais** e **participantes**. Ele utiliza conexão com banco de dados MySQL e segue o padrão de arquitetura **MVC**.

---

## 📁 Estrutura do Projeto

```
SistemaEventos/
├── Controller/
│   ├── AtividadeController.java
│   ├── EventoController.java
│   ├── EventoParticipanteController.java
│   ├── LocalController.java
│   └── ParticipanteController.java
│
├── Model/
│   ├── AtividadeModel.java
│   ├── EventoModel.java
│   ├── EventoParticipanteModel.java
│   ├── LocalModel.java
│   └── ParticipanteModel.java
│
├── Util/
│   └── Conexao.java
│
├── View/
│   ├── TelaAdicionarParticipantes.java
│   ├── TelaAtividades.java
│   ├── TelaEventos.java
│   ├── TelaHome.java
│   ├── TelaLocais.java
│   ├── TelaParticipantes.java
│   └── TelaPrincipal.java
│
├── Libraries/
│   └── mysql-connector-j-9.3.0.jar
```

---

## ⚙️ Tecnologias e Ferramentas

- **Java JDK 24**
- **Swing** para UI
- **MySQL** como banco de dados relacional
- **JDBC** com `mysql-connector-j-9.3.0.jar`
- **NetBeans IDE** (ou compatível)
- **Padrão MVC** para separação de responsabilidades

---

## 🧠 Funcionalidades

### 🎪 Eventos
- Cadastro, edição e remoção de eventos.
- Associação com locais e participantes.

### 📝 Atividades
- Associadas a eventos.
- Contêm tipo, título e horário de início/fim.

### 📍 Locais
- Cadastro de locais onde eventos ocorrem.

### 👥 Participantes
- Cadastro e gerenciamento de participantes.
- Associação a eventos específicos.

---

## 🧪 Requisitos para Rodar

- MySQL instalado e rodando.
- Banco de dados criado com as tabelas:
  - `evento`
  - `atividade`
  - `local`
  - `participante`
  - `evento_participante`
- Java 17 ou superior instalado (recomendado JDK 24 como no projeto).
- Driver JDBC (`mysql-connector-j-9.3.0.jar`) incluído no projeto.
- IDE Java (NetBeans recomendado).

---

## 🗃️ Exemplo de Tabelas

```sql
CREATE DATABASE  IF NOT EXISTS `evento` 
USE `evento`;
--
-- Table structure for table `atividade`
--
DROP TABLE IF EXISTS `atividade`;
CREATE TABLE `atividade` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(50) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `hora_inicio` datetime NOT NULL,
  `hora_fim` datetime NOT NULL,
  `criado_em` datetime DEFAULT CURRENT_TIMESTAMP,
  `id_evento` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_atividade_evento` (`id_evento`),
  CONSTRAINT `fk_atividade_evento` FOREIGN KEY (`id_evento`) REFERENCES `evento` (`id`)
) 
--
-- Table structure for table `evento`
--
DROP TABLE IF EXISTS `evento`;
CREATE TABLE `evento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `descricao` text,
  `data_inicio` datetime NOT NULL,
  `data_fim` datetime NOT NULL,
  `id_local` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nome` (`nome`),
  KEY `id_local` (`id_local`),
  CONSTRAINT `evento_ibfk_2` FOREIGN KEY (`id_local`) REFERENCES `local_evento` (`id`)
)
--
-- Table structure for table `evento_participante`
--
DROP TABLE IF EXISTS `evento_participante`;
CREATE TABLE `evento_participante` (
  `id_evento` int NOT NULL,
  `cpf_participante` varchar(14) NOT NULL,
  PRIMARY KEY (`id_evento`,`cpf_participante`),
  KEY `cpf_participante` (`cpf_participante`),
  CONSTRAINT `evento_participante_ibfk_1` FOREIGN KEY (`id_evento`) REFERENCES `evento` (`id`),
  CONSTRAINT `evento_participante_ibfk_2` FOREIGN KEY (`cpf_participante`) REFERENCES `participante` (`cpf`)
) 
--
-- Table structure for table `local_evento`
--
DROP TABLE IF EXISTS `local_evento`;
CREATE TABLE `local_evento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `capacidade` int NOT NULL,
  `rua` varchar(100) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `cep` varchar(20) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nome` (`nome`)
) 
--
-- Table structure for table `participante`
--
DROP TABLE IF EXISTS `participante`;
CREATE TABLE `participante` (
  `cpf` varchar(14) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `idade` int NOT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `criado_em` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cpf`),
  UNIQUE KEY `celular` (`celular`)
) 
```

---
