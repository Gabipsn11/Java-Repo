
# 📚 Java-Repo

Repositório de estudos da linguagem **Java**, criado para guardar exemplos simples, anotações e aprendizados durante meu processo de estudo.

---

## ✨ Sobre

Este repositório contém códigos Java básicos, com explicações em comentários no próprio código e anotações organizadas neste `README`. É voltado para iniciantes e para meu próprio uso como material de referência.

---

## 📂 Estrutura do Repositório

- `tiposvariaveis.java`: exemplos de tipos primitivos em Java (byte, short, int, long, float, double, char, boolean, String).
- `variaveis.java`: exemplo de declaração e uso de variáveis básicas.
- Outros arquivos virão à medida que os estudos avançarem.

---

## 📝 Anotações de Java

### 🔢 Tipos Primitivos Numéricos

```java
byte idade = 127;               // -128 a 127 (8 bits)
short estoque = 32767;         // -32.768 a 32.767 (16 bits)
int populacao = 2147483647;    // -2 bi a +2 bi (32 bits)
long contaCorrente = 9223372036854775807L; // (64 bits), precisa de L no final
```

### 🔣 Números Decimais

```java
float real = 10.1234567f;      // até 7 casas decimais (32 bits), precisa de 'f'
double real2 = 10.123456789012345; // até 15 casas decimais (64 bits)
```

### 🔤 Texto e Caracteres

```java
String nome = "I am Bob :)";   // Sequência de caracteres
char inicial = 'B';            // Um único caractere (aspas simples)
```

### ✅ Booleano

```java
boolean botaoAtivado = true;   // true ou false
```

### ⚠️ Var (inferência de tipo)

```java
var sobrenome = 'G'; // Não funciona corretamente com char (vai gerar erro)
```

---

## 💡 Exemplo Completo – Variáveis

```java
public class variaveis {
    public static void main(String[] args) {
        String nome = "Gabriela";
        int idade = 19;
        double altura = 1.70;
        char inicial = 'G';
        boolean estudante = true;

        System.out.println(idade);
    }
}
```

---

## 📌 Objetivo

Aprender Java aos poucos, com exemplos simples e explicações comentadas. O foco é entender a linguagem, tipos de dados, sintaxe e boas práticas básicas.

---

## 🚀 Próximos passos

- [ ] Estruturas de decisão (`if`, `else`)
- [ ] Laços de repetição (`for`, `while`)
- [ ] Métodos e funções
- [ ] Orientação a Objetos (POO)
- [ ] Coleções (`List`, `Map`, etc)

---

## 👩‍💻 Feito por

**Gabriela Pires**  
📘 Estudando Java desde 2024  
✨ Repositório pessoal para praticar e revisar sempre que precisar.

---

## 📄 Licença

Este repositório é livre para estudos e uso pessoal.
