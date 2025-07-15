# Tratamento de Erros na Classe Facade

Este README descreve as melhorias implementadas na classe Facade para garantir um tratamento de erros mais robusto e uma maior estabilidade do sistema.

## 🚀 Visão Geral das Alterações
As principais modificações focam em:

Validação de Entradas: Garantir que os dados fornecidos para a migração do cliente `nome e cep` não sejam nulos ou vazios.

Tratamento de Exceções: Capturar e lidar com erros que podem ocorrer durante a comunicação com os subsistemas externos `CepApi e CrmService`.

## ⚙️ Como Testar as Alterações
Para testar o comportamento do tratamento de erros, você pode utilizar a classe `Teste`
