fun main(){
    println("Banco APP")

    //Crear cliente
    val cliente = Cliente("Sebastian De la Paz", "21.487.703-1")

    //Crear Tipos de cuenta
    val cuentaAhorro = CuentaAhorro(1001, cliente, 100000.0, 3.5)

    val cuentaCorriente = CuentaCorriente(2001, cliente, 100000.0, 200000.0)

    val cuentaJoven = CuentaJoven(3001, cliente, 100000.0, 30.0)


    //Polimorfismo
    val cuentas: List<CuentaBancaria> = listOf(cuentaAhorro, cuentaCorriente, cuentaJoven)

    for(cuenta in cuentas){
        println("-------------")
        cuenta.mostrarTipoCuenta()
    }

    //Manejo de errores

    try{
        println("Ingrese el monto a retirar: ")

        val monto = readln().toDouble()
        cuentaAhorro.retirar(monto)
        println("Saldo: $ ${cuentaAhorro.obtenerSaldo()}")
    }catch(error: NumberFormatException){
        println("Error: Debes ingresar un numero")
    }catch(error: SaldoInsuficienteException){
        println("Error: ${error.message}")
    }finally {
        println("Operacion finalizada")
    }
    println("Programa finalizado")
}