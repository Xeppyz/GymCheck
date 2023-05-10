package Entidades

data class Producto (
    val idProducto: Int?,
    val nombre: String,
    val descripcion: String,
    val precio: Float,
    val stock: Int,
    val img: ByteArray? // Por ver este tipo de dato.
)