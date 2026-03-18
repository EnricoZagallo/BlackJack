# ♠️ Blackjack Game (Java - MVC)

Um jogo de **Blackjack (21)** desenvolvido em **Java**, utilizando o padrão de arquitetura **MVC (Model-View-Controller)**.

O objetivo foi criar uma aplicação organizada, escalável e próxima de um projeto profissional.

---

## 🎮 Sobre o Projeto

Este projeto simula uma partida de Blackjack no terminal, onde o jogador pode:

- Comprar cartas (**Hit**)
- Parar (**Stand**)
- Jogar contra o Dealer (CPU)
- Perder ao ultrapassar 21 pontos 
- Ganhar ao ter uma mão melhor que o Dealer 

---

## 🧠 Arquitetura (MVC)

O projeto foi estruturado seguindo o padrão **MVC**

---

## ⚙️ Como Funciona

### 🔹 Model

- Representa o baralho e os jogadores
- Calcula o valor das cartas

### 🔹 View

- Exibe mensagens no console
- Mostra as mãos do jogador e do dealer

### 🔹 Controller

- Controla o fluxo do jogo
- Recebe input do usuário
- Aplica as regras do Blackjack

---

## ▶️ Como Executar

1. Clone o repositório:


git clone https://github.com/EnricoZagallo/BlackJack


2. Abra o projeto em uma IDE (IntelliJ, Eclipse, VS Code)

3. Execute a classe:


Main.java


---

## 🎯 Mecânicas do Jogo

- Cartas numéricas → valor normal
- J, Q, K → valem 10
- A → vale 1 ou 11 

### Regras:

- Jogador começa com 2 cartas
- Dealer começa com 2 cartas
- Jogador escolhe:
  - `1` → Hit (comprar carta)
  - `2` → Stand (parar)
- Dealer compra até ter **17 ou mais**
- Quem tiver a melhor mão vence

---

## 📌 Funcionalidades

- Geração de baralho
- Embaralhamento
- Sistema de compra de cartas
- Cálculo de pontuação
- Lógica do Dealer automática
- Input do jogador via terminal
- Estrutura MVC organizada

---

## 🧑‍💻 Aprendizados

Este projeto foi importante para praticar:

- Programação orientada a objetos (POO)
- Separação de responsabilidades
- Arquitetura MVC
- Lógica de jogos
- Manipulação de listas e coleções

---

## 📸 Exemplo de Execução


Player hand: [10 of Hearts, 7 of Spades]
Dealer hand: [K of Clubs, J of Diamonds]

Digite: (1) Hit ou (2) Stand


---

## 🤝 Contribuição

Sinta-se livre para contribuir com melhorias, sugestões ou novas funcionalidades!

---

## 📄 Licença

Este projeto é open-source e pode ser usado para fins de estudo e aprendizado.

---

💡 Projeto desenvolvido para aprendizado e evolução em Java.
