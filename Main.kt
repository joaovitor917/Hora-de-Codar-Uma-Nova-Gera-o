
//  SIMULADOR DE BICHINHO VIRTUAL
//  Objetivo: fazer o bichinho chegar aos 50 anos




//  PROGRAMA PRINCIPAL

fun main() {
    println("🐶 Bem-vindo ao Simulador de Bichinho Virtual! ")
    print("Qual será o nome do seu bichinho? ")
    val nomeDigitado = readLine()

    // Se o jogador não digitar nada, usamos um nome padrão
    val nome = if (nomeDigitado.isNullOrBlank()) "Bidu" else nomeDigitado

    val pet = Pet(nome)
    println("Objetivo: fazer $nome chegar aos 50 anos. Boa sorte!")

    // O jogo continua enquanto o bichinho não perdeu e não chegou a 50
    while (pet.idade < 50 && !pet.perdeu()) {

        pet.verificarStatus()

        println()
        println("O que você quer fazer?")
        println("1 - Alimentar")
        println("2 - Brincar")
        println("3 - Descansar")
        println("4 - Levar ao banheiro")
        println("5 - Dar banho")
        println("6 - Só ver o status (não passa o tempo)")
        print("Escolha: ")

        val opcao = readLine()

        when (opcao) {
            "1" -> pet.alimentar()
            "2" -> pet.brincar()
            "3" -> {
                print("Por quantas horas ele vai descansar? (8 = totalmente descansado) ")
                val horas = readLine()?.toIntOrNull()
                if (horas == null || horas < 0) {
                    println("Número inválido! Ele não descansou.")
                } else {
                    pet.descansar(horas)
                }
            }
            "4" -> pet.irAoBanheiro()
            "5" -> pet.darBanho()
            "6" -> {
                // Não passa o tempo, volta para o início do loop
                continue
            }
            else -> {
                println("Opção inválida! Tente de novo.")
                continue
            }
        }

        // Depois de cada ação, o tempo passa
        pet.passarTempo()
    }

    // ---------- FIM DE JOGO ----------
    println()
    if (pet.idade >= 50 && !pet.perdeu()) {
        println("🎉 PARABÉNS! ${pet.nome} chegou aos 50 anos! Você venceu! ")
    } else {
        println("Fim de jogo. ${pet.nome} viveu até os ${pet.idade} anos.")
    }
}