class CuentaCorriente(
    NroCta : Int,
    cliente: Cliente,
    saldoInicial : Double,
    val limiteTransferencia : Double
) : CuentaBancaria(NroCta, cliente, saldoInicial) {
    override fun mostrarTipoCuenta() {
        println("Cuenta corriente")
        println("Limite de trasnferencia: $limiteTransferencia")
    }
}