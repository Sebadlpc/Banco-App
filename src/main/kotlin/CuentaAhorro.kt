class CuentaAhorro(
    NroCta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    val tasaInteres: Double
) : CuentaBancaria(NroCta, cliente, saldoInicial) {

    override fun mostrarTipoCuenta() {
        println("Tipo de Cuenta: Cuenta de ahorro")
        println("Interes: $tasaInteres")
    }

}