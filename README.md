# 🎼 Jogo de Partituras - Java Swing

Jogo educativo desenvolvido em **Java Swing** para ensino e teste de reconhecimento de notas musicais na clave de Sol. O aplicativo ajuda iniciantes em música a reconhecer notas através de associação visual e auditiva.

---

## 🚀 Tecnologias Utilizadas

* **Java 17+**
* **Java Swing** (interface gráfica)
* **Manipulação de imagens**
* **Event-driven programming**

---

## 📂 Estrutura do Projeto

```
tela/
│
├── TelaGame.java                 # Classe principal da aplicação
└── resources/images/
    ├── violao.png               # Imagem ilustrativa do violão
    ├── partitura_[nota].png     # Partituras para cada nota musical
    └── ...                      # Demais recursos visuais
```

---

## 🛠 Princípios Aplicados

### **Clean Code**

* Métodos com responsabilidades bem definidas
* Nomenclatura clara e descritiva para componentes e variáveis
* Organização lógica dos elementos da interface

### **SOLID**

* **S**ingle Responsibility: cada componente tem uma única função
* **O**pen/Closed: estrutura fácil de expandir com novas notas e funcionalidades
* **L**iskov Substitution: consistência no tratamento de eventos e componentes

### **Design Patterns**

* **MVC Pattern**: separação entre interface (View) e lógica de negócio (Controller)
* **Observer Pattern**: tratamento de eventos de interface
* **Singleton Pattern**: gerenciamento de recursos compartilhados

---

## 🎯 Funcionalidades Principais

* Exibição de partituras aleatórias na clave de Sol
* Interface interativa com botões para cada nota musical (`LÁ`, `SI`, `DÓ`, `RÉ`, `MI`, `FÁ`, `SOL`)
* Sistema de feedback visual imediato (acerto/erro)
* Botão "Tocar" para sortear nova partitura
* Imagem ilustrativa de violão para contexto educativo

---

## 💻 Como Executar

1. **Clonar o repositório**

```bash
git clone https://github.com/GilRossi/jogo-partituras-java.git
cd jogo-partituras-java
```

2. **Compilar e executar**

```bash
javac tela/TelaGame.java
java tela.TelaGame
```

3. **Via IDE**
   * Importe o projeto em Eclipse, IntelliJ ou NetBeans
   * Execute o método `main` da classe `TelaGame`

---

## 🎮 Como Jogar

1. Clique em **"Tocar"** para sortear uma nova partitura
2. Observe a nota musical exibida na partitura
3. Clique no botão correspondente à nota correta
4. Receba feedback visual imediato:
   - ✅ **Verde** para acerto
   - ❌ **Vermelho** para erro
5. Continue praticando para melhorar seu reconhecimento musical

---

## 📊 Fluxo da Aplicação

```
Inicialização → Carrega imagens e interface
      ↓
Clique em "Tocar" → Sorteia partitura aleatória
      ↓
Usuário clica em nota → Verifica resposta
      ↓
Feedback visual → Reinicia ciclo
```

---

## 🧪 Recursos de Aprendizado

* Reconhecimento visual de notas na clave de Sol
* Associação entre posição na partitura e nome da nota
* Desenvolvimento de memória muscular visual para músicos iniciantes
* Interface amigável e educativa para todos os níveis

---

## 📚 Próximos Passos

* Adicionar reprodução sonora das notas
* Implementar sistema de pontuação e níveis de dificuldade
* Criar modos de estudo específicos por faixas de notas
* Adicionar tutorial interativo para iniciantes
* Desenvolver versão mobile compatível
* Implementar persistência de progresso do usuário

---

## 👨‍💻 Autor

**Gil Rossi Aguiar**  
📧 [gilrossi.aguiar@live.com](mailto:gilrossi.aguiar@live.com)  
💼 [LinkedIn](https://www.linkedin.com/in/gil-rossi-5814659b/)  
🐙 [GitHub](https://github.com/GilRossi)
