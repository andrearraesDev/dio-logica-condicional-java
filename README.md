
# 💼 Calculadora de Salário Líquido - Java

Projeto desenvolvido em Java que realiza o cálculo do salário líquido de um colaborador, considerando faixas de imposto de renda e valores de benefícios.  
Foi criado como parte de uma atividade prática da [Digital Innovation One (DIO)](https://www.dio.me/), com o objetivo de exercitar lógica condicional e boas práticas de programação.

---

## 🚀 Funcionalidades

- Entrada do salário bruto
- Entrada do valor dos benefícios (ex: vale-alimentação, vale-transporte, bônus)
- Cálculo da alíquota de imposto conforme a faixa salarial
- Exibição de um resumo formatado com:
  - Salário bruto
  - Valor do imposto aplicado
  - Valor dos benefícios
  - Salário líquido

---

## 🧮 Regras de Cálculo do Imposto

A alíquota aplicada sobre o salário bruto segue a seguinte lógica condicional:

| Faixa Salarial                | Alíquota de Imposto |
|------------------------------|---------------------|
| Até R$ 1.100,00               | 5%                  |
| De R$ 1.100,01 até R$ 2.500,00| 10%                 |
| Acima de R$ 2.500,00          | 15%                 |

---

## 📦 Tecnologias Utilizadas

- **Java** (versão 8+)
- **Scanner API** para entrada de dados via terminal
- Boas práticas de organização e separação de responsabilidades com métodos auxiliares

---

## 📷 Exemplo de Execução

```bash
==============================================
        CALCULADORA DE SALÁRIO LÍQUIDO        
==============================================
Este sistema calcula o salário líquido do(a) 
colaborador(a) com base no salário bruto,     
aplicando a alíquota de imposto e somando     
os benefícios informados.

Informe o valor do salário bruto: R$ 2000.00
Informe o valor dos benefícios: R$ 400.00

--------------- RESUMO DO CÁLCULO ---------------
Salário Bruto:       R$ 2000.00
(-) Imposto:         R$ 200.00
(+) Benefícios:      R$ 400.00
-------------------------------------------------
Salário Líquido:     R$ 2200.00
-------------------------------------------------
```

---

## 🧠 Conceitos Reforçados

- Lógica condicional (`if / else if / else`)
- Cálculo percentual
- Modularização com métodos auxiliares
- Boas práticas na organização do código
- Saída formatada com `System.out.printf()`

---

## 📌 Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/andrearraesDev/dio-logica-condicional-java.git
```

2. Acesse a pasta do projeto:

```bash
cd dio-logica-condicional-java
```

3. Compile e execute o código em seu ambiente Java preferido:

```bash
javac CalculadoraSalario.java
java CalculadoraSalario
```

---

## ⭐ Diferenciais do Projeto

- Estrutura limpa e legível
- Comentários descritivos e cabeçalho explicativo
- Abordagem orientada a boas práticas desde o início
- Ideal para iniciantes aprenderem lógica de programação de forma prática

---

## 📌 Licença

Este projeto está sob a licença MIT.  
Sinta-se à vontade para usar, estudar e compartilhar.

---

### Desenvolvido com ❤️ por André Arraes como parte do bootcamp da DIO.
