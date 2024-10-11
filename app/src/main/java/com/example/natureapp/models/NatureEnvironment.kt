package com.example.natureapp.models

data class NatureEnvironment(
    val name: String,
    val description: String,
    val imageUrl: String
)

val natureList = listOf(
    NatureEnvironment("Selva", "Un ecosistema de densa vegetación con alta biodiversidad.", "https://cdn.autobild.es/sites/navi.axelspringer.es/public/media/image/2016/03/521755-selva-amazonica-extensa-planeta.jpg?tf=3840x"),
    NatureEnvironment("Bosque", "Un área con predominancia de árboles y arbustos.", "https://imagenes.muyinteresante.com/files/article_social_75/uploads/2024/03/20/65face0771f30.jpeg"),
    NatureEnvironment("Desierto", "Un lugar árido con escasa vegetación y agua.", "https://static.toiimg.com/thumb/msid-102149252,width-1070,height-580,resizemode-75/102149252,pt-32,y_pad-40/102149252.jpg"),
    NatureEnvironment("Tundra", "Un ecosistema frío con suelos helados y baja vegetación.", "https://cdn0.bioenciclopedia.com/es/posts/9/7/0/tundra_caracteristicas_clima_tipos_flora_y_fauna_79_orig.jpg"),
    NatureEnvironment("Sabanas", "Praderas con pastizales y algunos árboles dispersos.", "https://cdn0.bioenciclopedia.com/es/posts/4/8/0/sabana_caracteristicas_flora_y_fauna_84_600.jpg"),
    NatureEnvironment("Manglares", "Áreas costeras con vegetación adaptada a agua salada.", "https://www.fundacionaquae.org/wp-content/uploads/2019/07/que-es-un-manglar.jpg")
)
