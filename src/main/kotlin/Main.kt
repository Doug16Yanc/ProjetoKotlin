import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val valor = true
        val scanner = Scanner(System.`in`)
        println("Bem-vindo ao nosso sistema de tabuada de multiplicação de números")
        while (valor) {
            System.out.printf("Digite a opçao:\n1-Calcular\n2-Encerrar.\n")
            val opcao = scanner.nextInt()
            if (opcao == 1) {
                System.out.printf("Digite o número para que eu apresente a tabuada deste de 1 até 10:")
                val numero = scanner.nextInt()
                for (contador in 1..10) {
                    var produto = 1
                    produto = contador * numero
                    System.out.printf("%s X %s = %s\n", numero, contador, produto)
                }
            } else if (opcao == 2) {
                break
            }
        }
    }
}