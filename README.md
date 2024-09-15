# 🎥 Cinema App - Trabalho C1 LPOO

Este projeto foi desenvolvido como parte da disciplina de **Linguagem de Programação Orientada a Objetos (LPOO)**. O objetivo do projeto é simular a gestão de sessões e assentos de um cinema, aplicando conceitos básicos de POO.

## 📁 Estrutura do Projeto

A estrutura de diretórios do projeto é a seguinte:

```
TRABALHO C1 LPOO
│
├── bin
│   ├── Assento.class
│   ├── Cinema.class
│   ├── Secao.class
│
├── src
│   ├── Assento.java
│   ├── Cinema.java
│   ├── Secao.java
│   ├── Utils.java
│
└── README.md
```


### 🔧 Diretório `src` (Códigos Fonte)

- **`Assento.java`**: Classe responsável pelo gerenciamento dos assentos. Permite verificar e alterar a disponibilidade dos assentos.
  
- **`Cinema.java`**: Gerencia o cinema, incluindo a organização das sessões e o controle de assentos.

- **`Secao.java`**: Representa uma sessão de cinema, com informações como o filme e o horário da sessão.

- **`Utils.java`**: Classe de utilitários, fornecendo métodos auxiliares para formatação e exibição de dados no console.

### 🛠 Diretório `bin` (Classes Compiladas)

Contém os arquivos `.class` gerados pela compilação dos arquivos `.java` no diretório `src`.

## ⚙️ Funcionalidades

O Cinema App oferece as seguintes funcionalidades:

- **Exibição de Assentos Disponíveis**: Mostra um mapa de assentos com indicações de assentos disponíveis (`[O]`) e ocupados (`[X]`).
  
- **Seleção de Assentos**: O usuário pode selecionar um assento específico em uma sessão de cinema.

- **Compra de Ingressos**: Simula a compra de um ingresso e exibe um "ingresso" formatado com o nome do filme, o horário e o assento escolhido.

- **Validação de Assentos**: O sistema verifica se o assento selecionado está disponível ou já foi vendido.

## Objetivo Educacional

Este projeto tem como propósito:

- **Praticar a implementação de classes e objetos em Java.**
  
- **Aplicar técnicas de manipulação de arrays e estruturas básicas de dados.**

- **Exercitar conceitos fundamentais de Programação Orientada a Objetos (POO).**

## Objetivo Educacional

Este projeto foi desenvolvido exclusivamente para fins educacionais e não possui uma licença formal.