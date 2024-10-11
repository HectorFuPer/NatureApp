package com.example.natureapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.natureapp.ui.theme.NatureAppTheme


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



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NatureAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NatureScreen(innerPadding)
                }
            }
        }
    }
}

@Composable
fun NatureScreen(innerPadding: PaddingValues) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color.DarkGray),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            Text(
                text = "NatureApp",
                color = Color.White,
                fontSize = 45.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                textAlign = TextAlign.Center,
                style = TextStyle(fontWeight = FontWeight.Bold)
            )
        }
        items(natureList) { nature ->
            NatureCard(nature)
        }
    }
}

@Composable
fun NatureCard(nature: NatureEnvironment) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(32.dp),
        elevation = CardDefaults.elevatedCardElevation(15.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        ) {
            AsyncImage(
                model = nature.imageUrl,
                contentDescription = nature.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)

            )
            Text(
                text = nature.name,
                modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally),
                fontSize = 30.sp,
            )
            Text(
                text = nature.description,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                fontSize = 14.sp
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    NatureAppTheme {
        NatureScreen(innerPadding = PaddingValues())
    }
}