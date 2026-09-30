// Classe = "molde" do nosso bichinho.
// Ela tem ATRIBUTOS (variáveis) e MÉTODOS (funções).
class Pet(val nome: String) {

    //  ATRIBUTOS
    var fome = 50            // quanto maior, mais fome (100 = perde)
    var felicidade = 50      // quanto maior, mais feliz (0 = perde)
    var cansaco = 0          // quanto maior, mais cansado (100 = perde)
    var idade = 0            // objetivo: chegar a 50

    // Desafios extras
    var vontadeBanheiro = 0  // aumenta ao alimentar (100 = perde)
    var sujeira = 0          // aumenta ao brincar (100 = perde)

    //  AÇÕES

    // Alimentar: diminui a fome (mas aumenta a vontade de ir ao banheiro)
    fun alimentar() {
        fome = fome - 20
        if (fome < 0) {
            fome = 0
        }
        vontadeBanheiro = vontadeBanheiro + 15
        println("$nome comeu e ficou mais satisfeito! ")
    }

    // Brincar: aumenta a felicidade (mas cansa e suja o bichinho)
    fun brincar() {
        felicidade = felicidade + 20
        if (felicidade > 100) {
            felicidade = 100
        }
        cansaco = cansaco + 15
        sujeira = sujeira + 15
        println("$nome brincou bastante! ")
    }

    // Descansar: diminui o cansaço.
    // Com 8 horas de descanso, o cansaço zera.
    fun descansar(horas: Int) {
        if (horas >= 8) {
            cansaco = 0
        } else {
            // cada hora tira 12 pontos de cansaço
            cansaco = cansaco - (horas * 12)
            if (cansaco < 0) {
                cansaco = 0
            }
        }
        println("$nome descansou por $horas hora(s). ")
    }

    // Ir ao banheiro: zera a vontade de ir ao banheiro
    fun irAoBanheiro() {
        vontadeBanheiro = 0
        println("$nome foi ao banheiro. ")
    }

    // Dar banho: zera a sujeira
    fun darBanho() {
        sujeira = 0
        println("$nome tomou banho e está limpinho! ")
    }

    // Mostra como o bichinho está agora
    fun verificarStatus() {
        println()
        println("===== STATUS DE $nome =====")
        println("Idade: $idade anos")
        println("Fome: $fome")
        println("Felicidade: $felicidade")
        println("Cansaço: $cansaco")
        println("Vontade de ir ao banheiro: $vontadeBanheiro")
        println("Sujeira: $sujeira")
        println("===========================")
    }

    //  PASSAGEM DO TEMPO
    // Chamado a cada ciclo (depois de cada ação do jogador)
    fun passarTempo() {
        fome = fome + 3
        felicidade = felicidade - 3
        cansaco = cansaco + 10
        idade = idade + 1
    }

    //  REGRAS DE DERROTA
    // Devolve true se o jogador perdeu
    fun perdeu(): Boolean {
        if (fome >= 100) {
            println(" $nome morreu de fome!")
            return true
        }
        if (cansaco >= 100) {
            println(" $nome ficou exausto demais!")
            return true
        }
        if (felicidade <= 0) {
            println(" $nome ficou muito triste...")
            return true
        }
        if (vontadeBanheiro >= 100) {
            println(" $nome não aguentou a vontade de ir ao banheiro!")
            return true
        }
        if (sujeira >= 100) {
            println(" $nome ficou sujo demais!")
            return true
        }
        return false
    }
}
