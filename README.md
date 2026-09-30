#  Simulador de Bichinho Virtual em Kotlin
 
Projeto de prática de **Programação Orientada a Objetos (POO)** feito em Kotlin. Você cuida de um bichinho virtual no dia a dia e tenta fazê-lo chegar aos **50 anos** sem que ele fique com fome, cansado, triste, sujo ou apertado para ir ao banheiro.
 
Este projeto faz parte do desafio **Hora de Codar: Uma Nova Geração**.
 
---
 
##  Sobre o projeto
 
O bichinho é representado por uma classe `Pet`, que possui **atributos** (o estado dele) e **métodos** (as ações que ele pode fazer). O jogo roda no terminal e, a cada ação do jogador, o tempo passa e o bichinho envelhece.
 
### Atributos
 
| Atributo | Descrição |
|---|---|
| `nome` | Nome do bichinho |
| `fome` | Quanto maior, mais fome |
| `felicidade` | Quanto maior, mais feliz |
| `cansaco` | Quanto maior, mais cansado |
| `idade` | Aumenta a cada ciclo de tempo |
| `vontadeBanheiro` | Aumenta ao alimentar |
| `sujeira` | Aumenta ao brincar |
 
### Métodos
 
| Método | O que faz |
|---|---|
| `alimentar()` | Diminui a fome e aumenta a vontade de ir ao banheiro |
| `brincar()` | Aumenta a felicidade, o cansaço e a sujeira |
| `descansar(horas)` | Diminui o cansaço (8 horas = totalmente descansado) |
| `irAoBanheiro()` | Zera a vontade de ir ao banheiro |
| `darBanho()` | Zera a sujeira |
| `verificarStatus()` | Mostra os valores atuais do bichinho, incluindo a idade |
| `passarTempo()` | Simula a passagem de um ciclo de tempo |
| `perdeu()` | Verifica se alguma condição de derrota foi atingida |
 
---
 
##  Regras do jogo
 
**Objetivo:** fazer o bichinho chegar à idade **50**.
 
**Passagem do tempo (por ciclo):**
 
- Fome: **+3**
- Felicidade: **-3**
- Cansaço: **+10**
- Idade: **+1**
**Você perde se:**
 
- A fome chegar a **100**
- O cansaço chegar a **100**
- A felicidade chegar a **0**
- A vontade de ir ao banheiro chegar a **100**
- A sujeira chegar a **100**
---
 

 
##  Como jogar
 
Ao iniciar, digite o nome do seu bichinho. Depois, a cada rodada, escolha uma opção:
 
```
1 - Alimentar
2 - Brincar
3 - Descansar
4 - Levar ao banheiro
5 - Dar banho
6 - Só ver o status (não passa o tempo)
```
 
Dicas para vencer:
 
- Não deixe o **cansaço** passar de 100: ele sobe 10 por ciclo, então descanse com frequência.
- Brincar deixa o bichinho feliz, mas também cansa e suja.
- Alimentar diminui a fome, mas aumenta a vontade de ir ao banheiro.
- Fique de olho em todos os medidores antes de escolher a próxima ação.
---
 
##  Estrutura do projeto
 
```
.
├── BichinhoVirtual.kt
└── README.md
```
 
---
 
##  Conceitos praticados
 
- Classes e objetos
- Atributos e métodos
- Encapsulamento do estado do objeto
- Estruturas condicionais (`if`, `when`)
- Laços de repetição (`while`)
- Entrada de dados pelo terminal (`readLine()`)
---

##  Licença
 
Este projeto foi criado para fins educacionais. Sinta-se à vontade para usar, estudar e modificar.
 
