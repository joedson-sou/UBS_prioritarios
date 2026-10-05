# 🏥 Exercício Prático: Agendamento de Pacientes Prioritários para Atendimento no dia em uma Unidade Básica de Saúde (UBS)

## Contexto do Mundo Real
Você continua desenvolvendo um sistema de informação para uma Unidade Básica de Saúde (UBS) do SUS. A partir das 7 da manhã, os(as) pacientes devem chegar para aguardar atendimento para consulta. O atendimento será por ordem de prioridade. A priorização será por idade, onde o paciente de maior idade é atendido primeiro. Quando o(a) paciente chega, ele(a) fornece o seu CPF, o(a) atendente verifica se o(a) paciente está cadastrado naquela UBS e, se estiver, insere o cadastro do paciente na agenda de consultas do dia. Neste cadastro da agenda, além do nome e do CPF, o(a) atendente deve também incluir a idade do paciente, que será usada na priorização do atendimento.

A agenda de consultas do dia é um **Heap**, considerando o(a) paciente mais prioritário(a) aquele(a) de maior idade.

---

## Requisitos do Projeto
*Nota: Não reusar a estrutura e operações do exercício anterior, pois a estrutura de dados é outra.*

### 1. Modelagem da estrutura (`Paciente`)
Cada paciente possui os seguintes atributos:
* `cpf` (Inteiro de 64 bits / Long) — Chave de ordenação (ex: `12345678900`).
* `nome_completo` (Texto)
* `cartao_sus` (Texto)
* `tipo_atendimento` (Texto — ex: "Triagem", "Vacinação", "Consulta Agendada")
* `idade` (Inteiro)

### 2. Implementação das Operações
* `cadastrar_atendimento_dia(heap, cpf, nome, cartao_sus, tipo_atendimento, idade)` [Inserção]:
  * Função de cadastro na agenda de atendimentos do dia (inserção em um Heap) onde quem chega na UBS é inserido no Heap para ser atendido(a) por ordem de idade.
* `remover_paciente_prioritário(heap)` [Remoção]:
  * Função que remove o(a) paciente prioritário da agenda de atendimentos do dia (remoção em um Heap).
* `quem_eh_o_proximo(heap)` [Consulta ao elemento raiz do Heap]:
  * Função que retorna o elemento prioritário do Heap.

---

## Roteiro de Testes para o(a) estudante
1. **Simulação de Atendimento na Recepção** (fazer esse passo para 5 pacientes):
   * Ao chegar um paciente para atendimento, inserir o paciente na agenda de atendimentos do dia (não precisa verificar se o paciente em questão já faz parte do cadastro de pacientes da UBS).
2. **Consultar o próximo paciente** da agenda de atendimentos do dia a ser atendido.
3. **Remover o paciente prioritário** que foi chamado para o consultório da agenda de atendimentos do dia.

---

## ⚠️ Gravação de Vídeo
* O vídeo deve ter **até 3 minutos**.
* Não precisa explicar o código (isso será feito somente na prova oral).
* Precisa explicar o programa do **ponto de vista do usuário**, mostrando funcionalidades, dados de entrada e dados de saída do programa (estilo teste de caixa preta, narrado pelo(a) estudante).
* Não precisa se filmar; apenas a voz explicando é suficiente.
* Dizer **seu nome, disciplina e semestre letivo** no início do vídeo.

---

## 🗃️ Entregas
* Entregar o código e o vídeo como anexo da atividade.