open class CuentaBancaria(
    val NroCta: Int,
    val cliente : Cliente,
    saldoInicial: Double
) {

    private var saldo: Double = saldoInicial

    fun obtenerSaldo() : Double {
        return saldo
    }

    fun depositar(monto:Double) {
        if (monto <=0){
            throw IllegalArgumentException("El monto debe ser mayor a 0")
        }

        saldo += monto
        println("Deposito realizado: $monto")
    }

    fun retirar(monto:Double) {
        if(monto > saldo){
            throw SaldoInsuficienteException("Saldo insuficiente")
        }

        saldo -= monto
        println("Retiro realizado: $monto")
    }

    //Polimorfismo
    open fun mostrarTipoCuenta(){
        println("Cuenta bancaria:")
    }
}