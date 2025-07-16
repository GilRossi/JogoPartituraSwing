# 🎼 Jogo de Partituras - Java Swing

Este é um jogo educativo desenvolvido em Java com a biblioteca Swing para ensinar e testar o conhecimento de notas musicais na clave de Sol. O usuário deve identificar corretamente a nota musical mostrada na partitura, clicando no botão correspondente.

## 🧠 Objetivo

Desenvolver um aplicativo lúdico e interativo que ajude iniciantes em música (especialmente violão) a reconhecer notas musicais na partitura através da visualização e associação auditiva/visual com os nomes das notas.

---

## 🖼️ Interface

* A interface exibe:

  * Um violão ilustrativo.
  * A imagem de uma partitura aleatória.
  * Botões com nomes de notas (`LÁ`, `SI`, `DÓ`, `RÉ`, `MI`, `FÁ`, `SOL`).
* Ao clicar em **Tocar**, uma nova partitura é sorteada.
* O jogador deve então clicar na nota correta.
* Feedback visual indica acerto ou erro.

---

## 📦 Recursos

* **Java Swing** para construção da interface gráfica.
* **Imagens** de partituras reais para facilitar o reconhecimento visual.
* **Aleatoriedade controlada** para sorteio das notas.
* **Sistema de feedback visual** com mudança de cores e mensagens.

---

## 📁 Estrutura de Pastas

```
├── /tela
│   ├── TelaGame.java         # Arquivo principal da aplicação
│   └── /resources/images/    # Imagens das notas musicais e violão
```

---

## 🚀 Como Executar

1. **Requisitos**:

   * Java 17+
   * IDE como Eclipse, IntelliJ ou NetBeans

2. **Passos**:

   * Clone o repositório:

     ```bash
     git clone https://github.com/seu-usuario/jogo-partituras-java.git
     ```
   * Importe como projeto Java.
   * Certifique-se de que as imagens estão no caminho correto: `tela/resources/images/`.
   * Rode o método `main` da classe `TelaGame`.

---

## 🖼️ Exemplo de Uso

> Ao clicar em **Tocar**, aparece uma imagem como esta:

```
[ 🎵 partitura.png ] ➡ Qual nota é essa?

🟨 A = LÁ  🟨 B = SI  🟨 C = DÓ ...
```

> O botão clicado muda para "Acertou" (verde) ou "Errou!" (vermelho).

---

## 📚 Aprendizado

Este projeto combina:

* Programação com Java Swing
* Manipulação de imagens
* Controle de eventos e feedback visual
* Randomização de conteúdo

Ideal para estudantes que desejam unir música e programação!

---

## 🛠️ Contribuição

Sinta-se à vontade para abrir issues ou PRs com sugestões de melhoria, novas partituras, ou ideias para adicionar sons e níveis de dificuldade.
