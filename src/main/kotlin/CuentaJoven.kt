class CuentaJoven (
    NroCta : Int,
    cliente : Cliente,
    saldoInicial: Double,
    val descuento: Double
) : CuentaBancaria(NroCta, cliente, saldoInicial){
    override fun mostrarTipoCuenta() {
        println("Cuenta joven")
        println("Descuento: $descuento")
    }
}