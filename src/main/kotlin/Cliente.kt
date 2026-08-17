class Cliente(
    val nombre: String,
    val rut: String
) {
    //Contenido
    fun mostrarInformacion(){
        println("Nombre: $nombre /n" +
                "Rut: $rut")

    }
}