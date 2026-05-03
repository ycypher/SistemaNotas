# SistemaNotas

Sistema de controle de notas escolares desenvolvido em Java.

## Descrição

O sistema permite cadastrar alunos em uma turma, lançar notas bimestrais, calcular médias, verificar situação (aprovado, recuperação ou reprovado) e emitir boletins pelo console. Conta com um menu interativo para o usuário utilizar o sistema.

## Tecnologia utilizada

- Java 21
- IDE: VScode

## Como executar

1. Certifique-se de ter o JDK instalado. Para verificar, abra o terminal e execute:
   ```
   java -version
   ```

2. Navegue até a pasta `src` do projeto:
   ```
   cd SistemaNotas/src
   ```

3. Compile todos os arquivos `.java`:
   ```
   javac *.java
   ```

4. Execute a classe principal:
   ```
   java TesteNotas
   ```

## Classes do projeto

| Classe | Responsabilidade |
|---|---|
| `Aluno` | Representa um aluno com nome, matrícula e três notas bimestrais. Calcula a média, determina a situação e exibe o boletim. |
| `GerenciadorTurma` | Gerencia uma turma de até 4 alunos. Permite cadastrar alunos, emitir boletins, contar aprovados e encontrar o aluno com maior média. |
| `TesteNotas` | Classe principal com o método `main`. Realiza a configuração inicial da turma e apresenta o menu interativo ao usuário. |

## Aluno

- **Nome:**_ Victor Hugo _
- **Turma:** 13A — 2º Módulo