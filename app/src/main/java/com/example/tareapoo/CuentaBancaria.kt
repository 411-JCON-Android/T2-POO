package com.example.tareapoo

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Tu nuevo saldo es: $saldo")
    }
    fun retirar(cantidad: Double) {
        if (saldo >= cantidad){
            saldo -= cantidad
            println("Tu nuevo saldo es: $saldo")
        } else {
            println("No hay saldo suficiente para el movimiento")
        }
    }
    fun mostrarSaldo() {
        println("Tu saldo actual es: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
}
