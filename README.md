# 📚 Library System (Console Application)

Este é um projeto simples de sistema de biblioteca desenvolvido em **Java**, com foco em praticar conceitos fundamentais de programação orientada a objetos (POO) e interação com o usuário via console.

> ⚠️ **Projeto em evolução:** esta é uma versão inicial, sem persistência de dados (sem banco de dados). Melhorias e novas funcionalidades serão adicionadas futuramente.

---

## 🚀 Funcionalidades

* Listagem de livros disponíveis
* Empréstimo de livros
* Entrada de dados via console
* Controle de disponibilidade dos livros
* Validação básica de entrada (ID inválido)

---

## 🧠 Conceitos Aplicados

Este projeto foi desenvolvido com foco no aprendizado e prática dos seguintes conceitos:

* Programação Orientada a Objetos (POO)
* Classes e Objetos
* Encapsulamento
* Listas (`ArrayList`)
* Estrutura de controle (`if`, `while`)
* Tratamento de exceções (`try/catch`)
* Entrada de dados com `Scanner`

---

## 🏗️ Estrutura do Projeto

O sistema é dividido em algumas classes principais:

### 📖 Livro

* `id`
* `titulo`
* `autor`
* `disponivel`
* `dataCadastro`
* `dataAtualizacao`

### ✍️ Autor

* `id`
* `nome`
* `dataNascimento`

### 📦 Emprestimo

* `id`
* `livro`
* `nomeCliente`
* `dataEmprestimo`
* `dataDevolucao`

### 🏛️ Biblioteca

* Lista de livros
* Lista de autores
* Lista de empréstimos

### 🎮 Program (Main)

Responsável pela interação com o usuário e fluxo do sistema.

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/anaClarissi/library-system-basic
```

2. Abra o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code, etc.)

3. Execute a classe:

```
Program.java
```

---

## 💻 Exemplo de Uso

```
=====================
    Library System
=====================
1 - List Books
2 - Exit
=====================
choice: 1

[Lista de livros disponíveis]

Make Loan? (n/y) y
Enter the Book's Id: 1
Enter your name: Ana

Loan successfully completed!
```

---

## 🔮 Melhorias Futuras

Este projeto ainda é uma versão básica. Algumas melhorias planejadas:

* 📌 Sistema completo de menu interativo
* 📌 Cadastro de novos livros
* 📌 Cadastro de clientes
* 📌 Histórico de empréstimos por usuário
* 📌 Busca por título ou autor
* 📌 Integração com banco de dados
* 📌 Interface gráfica (GUI ou Web)

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais, com o objetivo de consolidar conhecimentos iniciais em Java e preparar a base para sistemas mais complexos no futuro.

---

## 👩‍💻 Autora

Desenvolvido por **Ana Clarissi**

* GitHub: https://github.com/anaClarissi
* LinkedIn: https://linkedin.com/in/anaclarissi

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar e modificar.
